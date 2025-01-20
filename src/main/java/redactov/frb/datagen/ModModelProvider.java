package redactov.frb.datagen;

import com.terraformersmc.modmenu.util.mod.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import redactov.frb.FlewtownRedactovBlocks;
import redactov.frb.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    //public static Block ORANGE_BRICKS = Registry.register(Registries.BLOCK, new Identifier(FlewtownRedactovBlocks.MOD_ID, "orange_bricks"), new Block(FabricBlockSettings.copyOf(Blocks.STONE)));


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        BlockStateModelGenerator.BlockTexturePool DirtyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIRTY_BRICKS);
        //blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.WHITE_WALL_PLANKS,);
        //blockStateModelGenerator.registerDispenserLikeOrientable(ModBlocks.GRASS);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLASS_A);



        blockStateModelGenerator.registerGlassPane(ModBlocks.GLASS_A,ModBlocks.GLASS_PANE_A);
        blockStateModelGenerator.registerGlassPane(ModBlocks.GLASS_B,ModBlocks.GLASS_PANE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOIL_B); //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOIL_C); //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOIL_D); //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOIL_E); //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOIL_F); //
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOIL_G); //
        blockStateModelGenerator.registerGlassPane(ModBlocks.ORANGE_GLASS,ModBlocks.ORANGE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MAGENTA_GLASS,ModBlocks.MAGENTA_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LIGHT_BLUE_GLASS,ModBlocks.LIGHT_BLUE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.YELLOW_GLASS,ModBlocks.YELLOW_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LIME_GLASS,ModBlocks.LIME_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.PINK_GLASS,ModBlocks.PINK_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.GRAY_GLASS,ModBlocks.GRAY_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LIGHT_GRAY_GLASS,ModBlocks.LIGHT_GRAY_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.CYAN_GLASS,ModBlocks.CYAN_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.PURPLE_GLASS,ModBlocks.PURPLE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.BLUE_GLASS,ModBlocks.BLUE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.BROWN_GLASS,ModBlocks.BROWN_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.GREEN_GLASS,ModBlocks.GREEN_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.RED_GLASS,ModBlocks.RED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.BLACK_GLASS,ModBlocks.BLACK_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.BARCODED_GLASS_A,ModBlocks.BARCODED_GLASS_PANE_A);
        blockStateModelGenerator.registerGlassPane(ModBlocks.BARCODED_GLASS_B,ModBlocks.BARCODED_GLASS_PANE_B);



        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLE_LIGHT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLE_DARK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DECO_COBBLE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_C);
        BlockStateModelGenerator.BlockTexturePool SmoothStoneA = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STONE_A);
        BlockStateModelGenerator.BlockTexturePool SmoothStoneB = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STONE_B);
        BlockStateModelGenerator.BlockTexturePool SmoothStoneC = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STONE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIRTY_STONE);



        BlockStateModelGenerator.BlockTexturePool BricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS);
        BlockStateModelGenerator.BlockTexturePool BricksOldAPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_OLD_A);
        BlockStateModelGenerator.BlockTexturePool BricksOldBPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_OLD_B);
        BlockStateModelGenerator.BlockTexturePool WhiteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool OrangeBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool BrownBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool DarkBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_BRICKS);

        BlockStateModelGenerator.BlockTexturePool WhiteFactoryPlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FACTORY_PLATE_WHITE);
        BlockStateModelGenerator.BlockTexturePool GrayFactoryPlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FACTORY_PLATE_GREY);
        BlockStateModelGenerator.BlockTexturePool GravelFactoryPlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAVEL);

        WhiteFactoryPlatePool.slab(ModBlocks.WHITE_FACTORY_PLATE_SLAB);
        GrayFactoryPlatePool.slab(ModBlocks.GRAY_FACTORY_PLATE_SLAB);
        GravelFactoryPlatePool.slab(ModBlocks.GRAVEL_SLAB);


        DirtyBricksPool.stairs(ModBlocks.DIRTY_BRICKS_STAIRS);
        DirtyBricksPool.slab(ModBlocks.DIRTY_BRICKS_SLAB);
        BricksPool.stairs(ModBlocks.BRICKS_STAIRS);
        BricksPool.slab(ModBlocks.BRICKS_SLAB);
        BricksOldAPool.stairs(ModBlocks.BRICKS_OLD_A_STAIRS);
        BricksOldAPool.slab(ModBlocks.BRICKS_OLD_A_SLAB);
        BricksOldBPool.stairs(ModBlocks.BRICKS_OLD_B_STAIRS);
        BricksOldBPool.slab(ModBlocks.BRICKS_OLD_B_SLAB);
        WhiteBricksPool.stairs(ModBlocks.WHITE_BRICKS_STAIRS);
        WhiteBricksPool.slab(ModBlocks.WHITE_BRICKS_SLAB);
        OrangeBricksPool.stairs(ModBlocks.ORANGE_BRICKS_STAIRS);
        OrangeBricksPool.slab(ModBlocks.ORANGE_BRICKS_SLAB);
        BrownBricksPool.stairs(ModBlocks.BROWN_BRICKS_STAIRS);
        BrownBricksPool.slab(ModBlocks.BROWN_BRICKS_SLAB);
        DarkBricksPool.stairs(ModBlocks.DARK_BRICKS_STAIRS);
        DarkBricksPool.slab(ModBlocks.DARK_BRICKS_SLAB);
        DirtyBricksPool.wall(ModBlocks.DIRTY_BRICKS_WALL);
        BricksPool.wall(ModBlocks.BRICKS_WALL);
        BricksOldAPool.wall(ModBlocks.BRICKS_OLD_A_WALL);
        BricksOldBPool.wall(ModBlocks.BRICKS_OLD_B_WALL);
        WhiteBricksPool.wall(ModBlocks.WHITE_BRICKS_WALL);
        OrangeBricksPool.wall(ModBlocks.ORANGE_BRICKS_WALL);
        BrownBricksPool.wall(ModBlocks.BROWN_BRICKS_WALL);
        DarkBricksPool.wall(ModBlocks.DARK_BRICKS_WALL);
        SmoothStoneA.slab(ModBlocks.SMOOTH_STONE_A_SLAB);
        SmoothStoneB.slab(ModBlocks.SMOOTH_STONE_B_SLAB);
        SmoothStoneC.slab(ModBlocks.SMOOTH_STONE_C_SLAB);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_GREY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_LIGHT_GREY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_WHITE_COLORB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_WHITE_COLORC);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_YELLOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_PLATE_DARK_YELLOW);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_DESERT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_OLD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_OLD_MOSSY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_MOSSY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_BROWN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_WHITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_YELLOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_GREY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRICK_PLATE_DARK_YELLOW);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_PLANKS_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_PLANKS_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_PLANKS_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRIPPED_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_D);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_A);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_C);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_D);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_WALL_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_WALL_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_WALL_PLANKS_VERTICAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_WALL_PLANKS_VERTICAL);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAVEL_B);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FACTORY_PLATE_WHITE);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FACTORY_PLATE_GREY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VENTILATION);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUST_VENTILATION);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARAGE_DOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUST_GARAGE_DOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DANGER_BLOCK);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELECTRIC_PANEL);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELECTRIC_PANEL_B);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INDUSTRIAL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELL_PLATE);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NUCLEAR_BLOCK);

        blockStateModelGenerator.registerTrapdoor(ModBlocks.GLASS_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GRID_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.METAL_TRAPDOOR_A);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.METAL_TRAPDOOR_B);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CONCRETE_TRAPDOOR_A);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CONCRETE_TRAPDOOR_B);

        blockStateModelGenerator.registerDoor(ModBlocks.METAL_DOOR_A);
        blockStateModelGenerator.registerDoor(ModBlocks.METAL_DOOR_B);
        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_METAL_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.METAL_GRID_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_GRID_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.OAK_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.DARK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_OAK_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.GLASS_DOOR);
    }

    // добавить кал
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModBlocks.METAL_DOOR_A);
    }
}
