package redactov.frb.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import redactov.frb.FlewtownRedactovBlocks;
import redactov.frb.FlewtownRedactovBlocksItemGroup;
import redactov.frb.block.props.*;

public class RedactovBlocks {

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = new Identifier(FlewtownRedactovBlocks.MOD_ID, name);

        // Sometimes, you may not want to    register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        ItemGroupEvents.modifyEntriesEvent(FlewtownRedactovBlocksItemGroup.ITEM_GROUP).register(content -> {
            content.add(block);
        });



        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}

    public static final Block DUMPSTER = register(new DumpsterABlock(AbstractBlock.Settings.copy(Blocks.CHEST)), "dumpster",true);
    public static final Block ROAD_BARREL = register(new Block(AbstractBlock.Settings.copy(Blocks.STONE)), "road_barrel", true);
    public static final Block DUMPSTER_B = register(new DumpsterBBlock(AbstractBlock.Settings.copy(Blocks.CHEST)), "dumpster_b",true);
    public static final Block MODERN_HANDRAILS = register(new ModernHandrails(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), false), "modern_handrails",true);
    public static final Block MODERN_HANDRAILS_CORNER = register(new ModernHandrails(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), true), "modern_handrails_corner",true);
    public static final Block MODERN_SMALL_WINDOW = register(new ModernWindow(AbstractBlock.Settings.copy(Blocks.GLASS), true), "modern_small_window",true);
    public static final Block MODERN_LARGE_WINDOW = register(new ModernWindow(AbstractBlock.Settings.copy(Blocks.GLASS), false), "modern_large_window",true);
    public static final Block MODERN_LIGHT_OLD = register(new ModernLightOld(AbstractBlock.Settings.copy(Blocks.GLASS)), "modern_light_old", true);
    public static final Block CONCRETE_WALL_A = register(new ConcreteWall(AbstractBlock.Settings.copy(Blocks.STONE)), "concrete_wall_a", true);
    public static final Block CONCRETE_WALL_B = register(new ConcreteWall(AbstractBlock.Settings.copy(Blocks.STONE)), "concrete_wall_b", true);

}
