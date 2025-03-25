package redactov.frb.block.props;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class ModernWindow extends BlockWithEntity implements BlockEntityProvider {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    private final boolean isSmall;


    // North(0) - East(1) - South(0) - West(1)
    private final VoxelShape[] smallWindowShapes = new VoxelShape[]{Block.createCuboidShape(0, 0, 7.5, 16, 16, 8.5), Block.createCuboidShape(7.5, 0, 0, 8.5, 16, 16)};
    private final VoxelShape[] largeWindowShapes = new VoxelShape[]{Block.createCuboidShape(0, 0, 7, 16, 32, 9), Block.createCuboidShape(7, 0, 0, 9, 32, 16)};

    public ModernWindow(Settings settings, boolean small) {
        super(settings);
        isSmall = small;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (!isSmall) {
            return switch (state.get(FACING)) {
                case EAST, WEST -> largeWindowShapes[1];
                default -> largeWindowShapes[0];
            };
        } else {
            return switch (state.get(FACING)) {
                case EAST, WEST -> smallWindowShapes[1];
                default -> smallWindowShapes[0];
            };
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
