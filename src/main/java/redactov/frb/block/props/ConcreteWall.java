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

public class ConcreteWall extends BlockWithEntity implements BlockEntityProvider {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public ConcreteWall(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST -> Block.createCuboidShape(0, 0, 0, 16, 16, 7);
            case SOUTH -> Block.createCuboidShape(9, 0, 0, 16, 16, 16);
            case WEST -> Block.createCuboidShape(0, 0, 9, 16, 16, 16);
            default -> Block.createCuboidShape(0, 0, 0, 7, 16, 16);
        };
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

}
