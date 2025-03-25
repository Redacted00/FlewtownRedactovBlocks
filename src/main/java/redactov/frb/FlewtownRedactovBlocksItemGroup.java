package redactov.frb;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import redactov.frb.block.ModBlocks;
import redactov.frb.block.RedactovBlocks;

public class FlewtownRedactovBlocksItemGroup {

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(FlewtownRedactovBlocks.MOD_ID, "flewtownredactovblocks"));

    public static void initialize() {

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
            .icon(() -> new ItemStack(RedactovBlocks.DUMPSTER))
            .displayName(Text.of("Flewtown Redactov Blocks"))
            .build()); // build() no longer registers by itself
        }
}

