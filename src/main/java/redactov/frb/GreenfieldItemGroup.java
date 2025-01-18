package redactov.frb;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import redactov.frb.block.ModBlocks;

import net.minecraft.registry.Registry;

public class GreenfieldItemGroup {

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(FlewtownRedactovBlocks.MOD_ID, "greenfieldblocks"));




    public static void initialize() {

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.DIRTY_BRICKS))
            .displayName(Text.of("Greenfield Blocks"))
            .build()); // build() no longer registers by itself
        }

}

