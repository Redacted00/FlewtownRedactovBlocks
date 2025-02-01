package redactov.frb.block.props;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class DumpsterBBlock extends BlockWithEntity implements BlockEntityProvider {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final VoxelShape N_SHAPE = Stream.of(
            Block.createCuboidShape(-4.25, 1.75, 0.4999999999999929, 20.25, 12.4, 16.399999999999995),
            Block.createCuboidShape(-4.25, 11.75, 4.999999999999993, 20.25, 13.899999999999999, 16.399999999999995),
            Block.createCuboidShape(-4.25, 13.75, 11.999999999999993, 20.25, 17.4, 16.399999999999995)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape E_SHAPE = Stream.of(
            Block.createCuboidShape(-0.39999999999999414, 1.75, -4.250000000000002, 15.500000000000007, 12.4, 20.25),
            Block.createCuboidShape(-0.39999999999999414, 11.75, -4.250000000000002, 11.000000000000007, 13.899999999999999, 20.25),
            Block.createCuboidShape(-0.39999999999999414, 13.75, -4.250000000000002, 4.000000000000008, 17.4, 20.25)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape S_SHAPE = Stream.of(
            Block.createCuboidShape(-4.25, 1.75, -0.399999999999995, 20.25, 12.4, 15.500000000000007),
            Block.createCuboidShape(-4.25, 11.75, -0.399999999999995, 20.25, 13.899999999999999, 11.000000000000007),
            Block.createCuboidShape(-4.25, 13.75, -0.399999999999995, 20.25, 17.4, 4.000000000000008)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape W_SHAPE = Stream.of(
            Block.createCuboidShape(0.4999999999999929, 1.75, -4.25, 16.399999999999995, 12.4, 20.25),
            Block.createCuboidShape(4.999999999999993, 11.75, -4.25, 16.399999999999995, 13.899999999999999, 20.25),
            Block.createCuboidShape(11.999999999999993, 13.75, -4.25, 16.399999999999995, 17.4, 20.25)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public DumpsterBBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DumpsterBBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return N_SHAPE;
            case EAST:
                return E_SHAPE;
            case SOUTH:
                return S_SHAPE;
            case WEST:
                return W_SHAPE;
            default:
                return N_SHAPE;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            // This will call the createScreenHandlerFactory method from BlockWithEntity, which will return our blockEntity casted to
            // a namedScreenHandlerFactory. If your block class does not extend BlockWithEntity, it needs to implement createScreenHandlerFactory.
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                // With this call the server will request the client to open the appropriate Screenhandler
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof DumpsterBBlockEntity dumpsterBlockEntity) {
                ItemScatterer.spawn(world, pos, dumpsterBlockEntity);
                // update comparators
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
    }
}
