package redactov.frb.block.props;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import redactov.frb.FlewtownRedactovBlocks;

public class ModernHandrails extends BlockWithEntity implements BlockEntityProvider {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private final boolean isCorner;

    public ModernHandrails(Settings settings, boolean corner) {
        super(settings);
        isCorner = corner;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (!isCorner) {
            switch (state.get(FACING)) {
                case EAST -> {
                    return Block.createCuboidShape(13, 0, 0, 16, 16, 16);
                }
                case SOUTH -> {
                    return Block.createCuboidShape(0, 0, 13, 16, 16, 16);
                }
                case WEST -> {
                    return Block.createCuboidShape(0, 0, 0, 3, 16, 16);
                }
                default -> {
                    return Block.createCuboidShape(0, 0, 0, 16, 16, 3);
                }
            }
        } else {
            switch (state.get(FACING)) {
                case EAST -> {
                    return VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 16, 16, 3), Block.createCuboidShape(13, 0, 3, 16, 16, 16), BooleanBiFunction.OR);
                }
                case SOUTH -> {
                    return VoxelShapes.combineAndSimplify(Block.createCuboidShape(13, 0, 0, 16, 16, 16), Block.createCuboidShape(0, 0, 13, 13, 16, 16), BooleanBiFunction.OR);
                }
                case WEST -> {
                    return VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 13, 16, 16, 16), Block.createCuboidShape(0, 0, 0, 3, 16, 13), BooleanBiFunction.OR);
                }
                default -> {
                    return VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 3, 16, 16), Block.createCuboidShape(3, 0, 0, 16, 16, 3), BooleanBiFunction.OR);
                }
            }
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
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
