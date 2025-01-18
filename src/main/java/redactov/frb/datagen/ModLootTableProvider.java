package redactov.frb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import redactov.frb.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {


    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GRASS,ModBlocks.DIRT);
        addDrop(ModBlocks.GRASS_PATH,ModBlocks.DIRT);
        addDrop(ModBlocks.SOIL_A,ModBlocks.DIRT);
        addDrop(ModBlocks.COBBLE, Blocks.COBBLESTONE);
        addDrop(ModBlocks.COBBLE_LIGHT);
        addDrop(ModBlocks.COBBLE_DARK);
        addDrop(ModBlocks.DECO_COBBLE);
        addDrop(ModBlocks.MOSSY_COBBLE);
        addDrop(ModBlocks.DIRT);

        addDrop(ModBlocks.STONE_A);
        addDrop(ModBlocks.STONE_B);
        addDrop(ModBlocks.STONE_C);
        addDrop(ModBlocks.SMOOTH_STONE_A);
        addDrop(ModBlocks.SMOOTH_STONE_B);
        addDrop(ModBlocks.SMOOTH_STONE_C);
        addDrop(ModBlocks.DIRTY_STONE);
        
        
        addDrop(ModBlocks.BRICKS);
        addDrop(ModBlocks.BRICKS_OLD_A);
        addDrop(ModBlocks.BRICKS_OLD_B);
        addDrop(ModBlocks.WHITE_BRICKS);
        addDrop(ModBlocks.ORANGE_BRICKS);
        addDrop(ModBlocks.BROWN_BRICKS);
        addDrop(ModBlocks.DARK_BRICKS);
        addDrop(ModBlocks.STONE_PLATE);
        addDrop(ModBlocks.STONE_PLATE_GREY);
        addDrop(ModBlocks.STONE_PLATE_LIGHT_GREY);
        addDrop(ModBlocks.STONE_PLATE_WHITE);
        addDrop(ModBlocks.STONE_PLATE_WHITE_COLORB);
        addDrop(ModBlocks.STONE_PLATE_WHITE_COLORC);
        addDrop(ModBlocks.STONE_PLATE_YELLOW);
        addDrop(ModBlocks.STONE_PLATE_DARK_YELLOW);

        addDrop(ModBlocks.BRICK_PLATE);
        addDrop(ModBlocks.BRICK_PLATE_DESERT);
        addDrop(ModBlocks.BRICK_PLATE_OLD);
        addDrop(ModBlocks.BRICK_PLATE_OLD_MOSSY);
        addDrop(ModBlocks.BRICK_PLATE_MOSSY);
        addDrop(ModBlocks.BRICK_PLATE_BROWN);
        addDrop(ModBlocks.BRICK_PLATE_WHITE);
        addDrop(ModBlocks.BRICK_PLATE_YELLOW);
        addDrop(ModBlocks.BRICK_PLATE_GREY);
        addDrop(ModBlocks.BRICK_PLATE_DARK_YELLOW);

        addDrop(ModBlocks.OAK_PLANKS_A);
        addDrop(ModBlocks.OAK_PLANKS_B);
        addDrop(ModBlocks.OAK_PLANKS_C);
        addDrop(ModBlocks.STRIPPED_OAK_PLANKS);
        addDrop(ModBlocks.SPRUCE_PLANKS);
        addDrop(ModBlocks.ACACIA_PLANKS);

        addDrop(ModBlocks.WHITE_CONCRETE_A);
        addDrop(ModBlocks.WHITE_CONCRETE_B);
        addDrop(ModBlocks.WHITE_CONCRETE_C);
        addDrop(ModBlocks.WHITE_CONCRETE_D);
        addDrop(ModBlocks.ORANGE_CONCRETE_A);
        addDrop(ModBlocks.ORANGE_CONCRETE_B);
        addDrop(ModBlocks.ORANGE_CONCRETE_C);
        addDrop(ModBlocks.ORANGE_CONCRETE_D);
        addDrop(ModBlocks.MAGENTA_CONCRETE_A);
        addDrop(ModBlocks.MAGENTA_CONCRETE_B);
        addDrop(ModBlocks.MAGENTA_CONCRETE_C);
        addDrop(ModBlocks.MAGENTA_CONCRETE_D);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_A);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_B);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_C);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_D);
        addDrop(ModBlocks.YELLOW_CONCRETE_A);
        addDrop(ModBlocks.YELLOW_CONCRETE_B);
        addDrop(ModBlocks.YELLOW_CONCRETE_C);
        addDrop(ModBlocks.YELLOW_CONCRETE_D);
        addDrop(ModBlocks.LIME_CONCRETE_A);
        addDrop(ModBlocks.LIME_CONCRETE_B);
        addDrop(ModBlocks.LIME_CONCRETE_C);
        addDrop(ModBlocks.LIME_CONCRETE_D);
        addDrop(ModBlocks.PINK_CONCRETE_A);
        addDrop(ModBlocks.PINK_CONCRETE_B);
        addDrop(ModBlocks.PINK_CONCRETE_C);
        addDrop(ModBlocks.PINK_CONCRETE_D);
        addDrop(ModBlocks.GRAY_CONCRETE_A);
        addDrop(ModBlocks.GRAY_CONCRETE_B);
        addDrop(ModBlocks.GRAY_CONCRETE_C);
        addDrop(ModBlocks.GRAY_CONCRETE_D);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_A);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_B);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_C);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_D);
        addDrop(ModBlocks.CYAN_CONCRETE_A);
        addDrop(ModBlocks.CYAN_CONCRETE_B);
        addDrop(ModBlocks.CYAN_CONCRETE_C);
        addDrop(ModBlocks.CYAN_CONCRETE_D);
        addDrop(ModBlocks.PURPLE_CONCRETE_A);
        addDrop(ModBlocks.PURPLE_CONCRETE_B);
        addDrop(ModBlocks.PURPLE_CONCRETE_C);
        addDrop(ModBlocks.PURPLE_CONCRETE_D);
        addDrop(ModBlocks.BLUE_CONCRETE_A);
        addDrop(ModBlocks.BLUE_CONCRETE_B);
        addDrop(ModBlocks.BLUE_CONCRETE_C);
        addDrop(ModBlocks.BLUE_CONCRETE_D);
        addDrop(ModBlocks.BROWN_CONCRETE_A);
        addDrop(ModBlocks.BROWN_CONCRETE_B);
        addDrop(ModBlocks.BROWN_CONCRETE_C);
        addDrop(ModBlocks.BROWN_CONCRETE_D);
        addDrop(ModBlocks.GREEN_CONCRETE_A);
        addDrop(ModBlocks.GREEN_CONCRETE_B);
        addDrop(ModBlocks.GREEN_CONCRETE_C);
        addDrop(ModBlocks.GREEN_CONCRETE_D);
        addDrop(ModBlocks.RED_CONCRETE_A);
        addDrop(ModBlocks.RED_CONCRETE_B);
        addDrop(ModBlocks.RED_CONCRETE_C);
        addDrop(ModBlocks.RED_CONCRETE_D);
        addDrop(ModBlocks.BLACK_CONCRETE_A);
        addDrop(ModBlocks.BLACK_CONCRETE_B);
        addDrop(ModBlocks.BLACK_CONCRETE_C);
        addDrop(ModBlocks.BLACK_CONCRETE_D);

        addDrop(ModBlocks.WHITE_WALL_PLANKS);
        addDrop(ModBlocks.ORANGE_WALL_PLANKS);
        addDrop(ModBlocks.MAGENTA_WALL_PLANKS);
        addDrop(ModBlocks.LIGHT_BLUE_WALL_PLANKS);
        addDrop(ModBlocks.YELLOW_WALL_PLANKS);
        addDrop(ModBlocks.LIME_WALL_PLANKS);
        addDrop(ModBlocks.PINK_WALL_PLANKS);
        addDrop(ModBlocks.GRAY_WALL_PLANKS);
        addDrop(ModBlocks.LIGHT_GRAY_WALL_PLANKS);
        addDrop(ModBlocks.CYAN_WALL_PLANKS);
        addDrop(ModBlocks.PURPLE_WALL_PLANKS);
        addDrop(ModBlocks.BLUE_WALL_PLANKS);
        addDrop(ModBlocks.BROWN_WALL_PLANKS);
        addDrop(ModBlocks.GREEN_WALL_PLANKS);
        addDrop(ModBlocks.RED_WALL_PLANKS);
        addDrop(ModBlocks.BLACK_WALL_PLANKS);

        addDrop(ModBlocks.WHITE_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.ORANGE_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.MAGENTA_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.LIGHT_BLUE_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.YELLOW_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.LIME_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.PINK_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.GRAY_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.LIGHT_GRAY_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.CYAN_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.PURPLE_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.BLUE_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.BROWN_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.GREEN_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.RED_WALL_PLANKS_VERTICAL);
        addDrop(ModBlocks.BLACK_WALL_PLANKS_VERTICAL);

        addDrop(ModBlocks.GRAVEL);
        
        addDrop(ModBlocks.FACTORY_PLATE_WHITE);
        addDrop(ModBlocks.FACTORY_PLATE_GREY);
        addDrop(ModBlocks.VENTILATION);
        addDrop(ModBlocks.RUST_VENTILATION);
        addDrop(ModBlocks.GARAGE_DOOR);
        addDrop(ModBlocks.RUST_GARAGE_DOOR);
        addDrop(ModBlocks.DANGER_BLOCK);
        addDrop(ModBlocks.ELECTRIC_PANEL);
        addDrop(ModBlocks.ELECTRIC_PANEL_B);
        addDrop(ModBlocks.INDUSTRIAL_LAMP);
        addDrop(ModBlocks.NUCLEAR_BLOCK);
    }
}
