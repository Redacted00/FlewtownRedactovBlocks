package redactov.frb.block.props;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class DumpsterCBlock {
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
        Stream.of(
                Block.createCuboidShape(-9, 0, -8, -6, 22, 32),
                Block.createCuboidShape(22, 0, -8, 25, 22, 32),
                Block.createCuboidShape(-6, 0, -8, 22, 22, -4),
                Block.createCuboidShape(-6, 0, -8, 22, 2, 32)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    };
}
