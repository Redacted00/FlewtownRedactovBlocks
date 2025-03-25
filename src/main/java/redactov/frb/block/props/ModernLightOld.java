package redactov.frb.block.props;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class ModernLightOld extends BlockWithEntity implements BlockEntityProvider {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    // North(0) - East(1) - South(0) - West(1)
    private static final VoxelShape[] SHAPES = new VoxelShape[]{Block.createCuboidShape(5, 12.5, 14, 11, 15, 16), Block.createCuboidShape(0, 12.5, 5, 2, 15, 11), Block.createCuboidShape(5, 12.5, 0, 11, 15, 2), Block.createCuboidShape(14, 12.5, 5, 16, 15, 11) };

    public ModernLightOld(Settings settings) {
        super(settings.emissiveLighting(Blocks::always).luminance(value -> 15));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case EAST:
                return SHAPES[1];
            case SOUTH:
                return SHAPES[2];
            case WEST:
                return SHAPES[3];
            default:
                return SHAPES[0];
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
