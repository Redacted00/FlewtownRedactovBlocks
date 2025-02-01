package redactov.frb;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import redactov.frb.block.ModBlocks;
import redactov.frb.block.props.DumpsterABlockEntity;
import redactov.frb.block.props.DumpsterBBlockEntity;

public class BlocksEntityTypes {

    public static void initialize() {}

    public static final BlockEntityType<DumpsterABlockEntity> DUMPSTER_A_BLOCK_ENTITY_BLOCK_TYPE = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(FlewtownRedactovBlocks.MOD_ID, "dumpster"),
            FabricBlockEntityTypeBuilder.create(DumpsterABlockEntity::new, ModBlocks.DUMPSTER).build()
    );

    public static final BlockEntityType<DumpsterBBlockEntity> DUMPSTER_B_BLOCK_ENTITY_BLOCK_TYPE = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(FlewtownRedactovBlocks.MOD_ID, "dumpster_b"),
            FabricBlockEntityTypeBuilder.create(DumpsterBBlockEntity::new, ModBlocks.DUMPSTER_B).build()
    );
}
