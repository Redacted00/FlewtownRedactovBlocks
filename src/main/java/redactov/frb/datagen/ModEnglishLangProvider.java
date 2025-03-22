package redactov.frb.datagen;

import com.terraformersmc.modmenu.util.mod.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import redactov.frb.block.ModBlocks;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.BRICKS,"Bricks");
        translationBuilder.add(ModBlocks.BRICKS_OLD_A,"Bricks Old (A)");
        translationBuilder.add(ModBlocks.BRICKS_OLD_B,"Bricks Old (B)");
        translationBuilder.add(ModBlocks.WHITE_BRICKS,"White Bricks");
        translationBuilder.add(ModBlocks.ORANGE_BRICKS,"Orange Bricks");
        translationBuilder.add(ModBlocks.BROWN_BRICKS,"Brown Bricks");
        translationBuilder.add(ModBlocks.DARK_BRICKS,"Dark Bricks");
        translationBuilder.add(ModBlocks.DIRTY_BRICKS,"Old Bricks");
        translationBuilder.add(ModBlocks.DIRTY_BRICKS_STAIRS,"Old Brick Stairs");
        translationBuilder.add(ModBlocks.DIRTY_BRICKS_SLAB,"Old Brick Slab");
        translationBuilder.add(ModBlocks.STONE_PLATE,"Stone Plate");
        translationBuilder.add(ModBlocks.STONE_PLATE_GRAY,"Gray Stone Plate");
        translationBuilder.add(ModBlocks.STONE_PLATE_LIGHT_GRAY,"Light Gray Stone Plate");
        translationBuilder.add(ModBlocks.STONE_PLATE_WHITE,"White Stone Plate");
        translationBuilder.add(ModBlocks.STONE_PLATE_WHITE_COLORB,"White Stone Plate (B)");
        translationBuilder.add(ModBlocks.STONE_PLATE_WHITE_COLORC,"White Stone Plate (C)");
        translationBuilder.add(ModBlocks.STONE_PLATE_YELLOW,"Yellow Stone Plate");
        translationBuilder.add(ModBlocks.STONE_PLATE_DARK_YELLOW,"Dark Yellow Stone Plate");

        translationBuilder.add(ModBlocks.BRICK_PLATE,"Brick Plate");
        translationBuilder.add(ModBlocks.BRICK_PLATE_OLD,"Brick Plate Old");
        translationBuilder.add(ModBlocks.BRICK_PLATE_MOSSY,"Brick Plate Mossy");
        translationBuilder.add(ModBlocks.BRICK_PLATE_OLD_MOSSY,"Brick Plate Old Mossy");

        translationBuilder.add(ModBlocks.BRICK_PLATE_BROWN,"Brown Brick Plate");
        translationBuilder.add(ModBlocks.BRICK_PLATE_WHITE,"White Brick Plate");
        translationBuilder.add(ModBlocks.BRICK_PLATE_YELLOW,"Yellow Brick Plate");
        translationBuilder.add(ModBlocks.BRICK_PLATE_GRAY,"Gray Brick Plate");
        translationBuilder.add(ModBlocks.BRICK_PLATE_DARK_YELLOW,"Dark Yellow Brick Plate");

        translationBuilder.add(ModBlocks.OAK_PLANKS_A, "Oak Planks (A)");
        translationBuilder.add(ModBlocks.OAK_PLANKS_B,"Oak Planks (B)");
        translationBuilder.add(ModBlocks.OAK_PLANKS_C, "Oak Planks (C)");
        translationBuilder.add(ModBlocks.STRIPPED_OAK_PLANKS, "Stripped Oak Planks");
        translationBuilder.add(ModBlocks.SPRUCE_PLANKS, "Spruce Planks");
        translationBuilder.add(ModBlocks.ACACIA_PLANKS, "Acacia Planks");

        translationBuilder.add(ModBlocks.WHITE_CONCRETE_A, "White Concrete (A)");
        translationBuilder.add(ModBlocks.WHITE_CONCRETE_B, "White Concrete (B)");
        translationBuilder.add(ModBlocks.WHITE_CONCRETE_C, "White Concrete (C)");
        translationBuilder.add(ModBlocks.WHITE_CONCRETE_D, "White Concrete (D)");
        translationBuilder.add(ModBlocks.ORANGE_CONCRETE_A, "Orange Concrete (A)");
        translationBuilder.add(ModBlocks.ORANGE_CONCRETE_B, "Orange Concrete (B)");
        translationBuilder.add(ModBlocks.ORANGE_CONCRETE_C, "Orange Concrete (C)");
        translationBuilder.add(ModBlocks.ORANGE_CONCRETE_D, "Orange Concrete (D)");
        translationBuilder.add(ModBlocks.MAGENTA_CONCRETE_A,"Magenta Concrete (A)");
        translationBuilder.add(ModBlocks.MAGENTA_CONCRETE_B,"Magenta Concrete (B)");
        translationBuilder.add(ModBlocks.MAGENTA_CONCRETE_C,"Magenta Concrete (C)");
        translationBuilder.add(ModBlocks.MAGENTA_CONCRETE_D,"Magenta Concrete (D)");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_CONCRETE_A,"Light Blue Concrete (A)");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_CONCRETE_B,"Light Blue Concrete (B)");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_CONCRETE_C,"Light Blue Concrete (C)");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_CONCRETE_D,"Light Blue Concrete (D)");
        translationBuilder.add(ModBlocks.YELLOW_CONCRETE_A, "Yellow Concrete (A)");
        translationBuilder.add(ModBlocks.YELLOW_CONCRETE_B, "Yellow Concrete (B)");
        translationBuilder.add(ModBlocks.YELLOW_CONCRETE_C, "Yellow Concrete (C)");
        translationBuilder.add(ModBlocks.YELLOW_CONCRETE_D, "Yellow Concrete (D)");
        translationBuilder.add(ModBlocks.LIME_CONCRETE_A, "Lime Concrete (A)");
        translationBuilder.add(ModBlocks.LIME_CONCRETE_B, "Lime Concrete (B)");
        translationBuilder.add(ModBlocks.LIME_CONCRETE_C, "Lime Concrete (C)");
        translationBuilder.add(ModBlocks.LIME_CONCRETE_D, "Lime Concrete (D)");
        translationBuilder.add(ModBlocks.PINK_CONCRETE_A, "Pink Concrete (A)");
        translationBuilder.add(ModBlocks.PINK_CONCRETE_B, "Pink Concrete (B)");
        translationBuilder.add(ModBlocks.PINK_CONCRETE_C, "Pink Concrete (C)");
        translationBuilder.add(ModBlocks.PINK_CONCRETE_D, "Pink Concrete (D)");
        translationBuilder.add(ModBlocks.GRAY_CONCRETE_A, "Gray Concrete (A)");
        translationBuilder.add(ModBlocks.GRAY_CONCRETE_B, "Gray Concrete (B)");
        translationBuilder.add(ModBlocks.GRAY_CONCRETE_C, "Gray Concrete (C)");
        translationBuilder.add(ModBlocks.GRAY_CONCRETE_D, "Gray Concrete (D)");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_CONCRETE_A, "Light Gray Concrete (A)");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_CONCRETE_B, "Light Gray Concrete (B)");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_CONCRETE_C, "Light Gray Concrete (C)");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_CONCRETE_D, "Light Gray Concrete (D)");
        translationBuilder.add(ModBlocks.CYAN_CONCRETE_A, "Cyan Concrete (A)");
        translationBuilder.add(ModBlocks.CYAN_CONCRETE_B, "Cyan Concrete (B)");
        translationBuilder.add(ModBlocks.CYAN_CONCRETE_C, "Cyan Concrete (C)");
        translationBuilder.add(ModBlocks.CYAN_CONCRETE_D, "Cyan Concrete (D)");
        translationBuilder.add(ModBlocks.PURPLE_CONCRETE_A, "Purple Concrete (A)");
        translationBuilder.add(ModBlocks.PURPLE_CONCRETE_B, "Purple Concrete (B)");
        translationBuilder.add(ModBlocks.PURPLE_CONCRETE_C, "Purple Concrete (C)");
        translationBuilder.add(ModBlocks.PURPLE_CONCRETE_D, "Purple Concrete (D)");
        translationBuilder.add(ModBlocks.BLUE_CONCRETE_A, "Blue Concrete (A)");
        translationBuilder.add(ModBlocks.BLUE_CONCRETE_B, "Blue Concrete (B)");
        translationBuilder.add(ModBlocks.BLUE_CONCRETE_C, "Blue Concrete (C)");
        translationBuilder.add(ModBlocks.BLUE_CONCRETE_D, "Blue Concrete (D)");
        translationBuilder.add(ModBlocks.BROWN_CONCRETE_A, "Brown Concrete (A)");
        translationBuilder.add(ModBlocks.BROWN_CONCRETE_B, "Brown Concrete (B)");
        translationBuilder.add(ModBlocks.BROWN_CONCRETE_C, "Brown Concrete (C)");
        translationBuilder.add(ModBlocks.BROWN_CONCRETE_D, "Brown Concrete (D)");
        translationBuilder.add(ModBlocks.GREEN_CONCRETE_A, "Green Concrete (A)");
        translationBuilder.add(ModBlocks.GREEN_CONCRETE_B, "Green Concrete (B)");
        translationBuilder.add(ModBlocks.GREEN_CONCRETE_C, "Green Concrete (C)");
        translationBuilder.add(ModBlocks.GREEN_CONCRETE_D, "Green Concrete (D)");
        translationBuilder.add(ModBlocks.RED_CONCRETE_A, "Red Concrete (A)");
        translationBuilder.add(ModBlocks.RED_CONCRETE_B, "Red Concrete (B)");
        translationBuilder.add(ModBlocks.RED_CONCRETE_C, "Red Concrete (C)");
        translationBuilder.add(ModBlocks.RED_CONCRETE_D, "Red Concrete (D)");
        translationBuilder.add(ModBlocks.BLACK_CONCRETE_A, "Black Concrete (A)");
        translationBuilder.add(ModBlocks.BLACK_CONCRETE_B, "Black Concrete (B)");
        translationBuilder.add(ModBlocks.BLACK_CONCRETE_C, "Black Concrete (C)");
        translationBuilder.add(ModBlocks.BLACK_CONCRETE_D, "Black Concrete (D)");

        translationBuilder.add(ModBlocks.WHITE_WALL_PLANKS, "White Wall Planks");
        translationBuilder.add(ModBlocks.ORANGE_WALL_PLANKS, "Orange Wall Planks");
        translationBuilder.add(ModBlocks.MAGENTA_WALL_PLANKS, "Magenta Wall Planks");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_WALL_PLANKS, "Light Blue Wall Planks");
        translationBuilder.add(ModBlocks.YELLOW_WALL_PLANKS, "Yellow Wall Planks");
        translationBuilder.add(ModBlocks.LIME_WALL_PLANKS, "Lime Wall Planks");
        translationBuilder.add(ModBlocks.PINK_WALL_PLANKS, "Pink Wall Planks");
        translationBuilder.add(ModBlocks.GRAY_WALL_PLANKS, "Gray Wall Planks");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_WALL_PLANKS, "Light Gray Wall Planks");
        translationBuilder.add(ModBlocks.CYAN_WALL_PLANKS, "Cyan Wall Planks");
        translationBuilder.add(ModBlocks.PURPLE_WALL_PLANKS, "Purple Wall Planks");
        translationBuilder.add(ModBlocks.BLUE_WALL_PLANKS, "Blue Wall Planks");
        translationBuilder.add(ModBlocks.BROWN_WALL_PLANKS, "Brown Wall Planks");
        translationBuilder.add(ModBlocks.GREEN_WALL_PLANKS, "Green Wall Planks");
        translationBuilder.add(ModBlocks.RED_WALL_PLANKS, "Red Wall Planks");
        translationBuilder.add(ModBlocks.BLACK_WALL_PLANKS, "Black Wall Planks");

        translationBuilder.add(ModBlocks.WHITE_WALL_PLANKS_VERTICAL, "White Vertical Wall Planks");
        translationBuilder.add(ModBlocks.ORANGE_WALL_PLANKS_VERTICAL, "Orange Vertical Wall Planks");
        translationBuilder.add(ModBlocks.MAGENTA_WALL_PLANKS_VERTICAL, "Magenta Vertical Wall Planks");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_WALL_PLANKS_VERTICAL, "Light Blue Vertical Wall Planks");
        translationBuilder.add(ModBlocks.YELLOW_WALL_PLANKS_VERTICAL, "Yellow Vertical Wall Planks");
        translationBuilder.add(ModBlocks.LIME_WALL_PLANKS_VERTICAL, "Lime Vertical Wall Planks");
        translationBuilder.add(ModBlocks.PINK_WALL_PLANKS_VERTICAL, "Pink Vertical Wall Planks");
        translationBuilder.add(ModBlocks.GRAY_WALL_PLANKS_VERTICAL, "Gray Vertical Wall Planks");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_WALL_PLANKS_VERTICAL, "Light Gray Vertical Wall Planks");
        translationBuilder.add(ModBlocks.CYAN_WALL_PLANKS_VERTICAL, "Cyan Vertical Wall Planks");
        translationBuilder.add(ModBlocks.PURPLE_WALL_PLANKS_VERTICAL, "Purple Vertical Wall Planks");
        translationBuilder.add(ModBlocks.BLUE_WALL_PLANKS_VERTICAL, "Blue Vertical Wall Planks");
        translationBuilder.add(ModBlocks.BROWN_WALL_PLANKS_VERTICAL, "Brown Vertical Wall Planks");
        translationBuilder.add(ModBlocks.GREEN_WALL_PLANKS_VERTICAL, "Green Vertical Wall Planks");
        translationBuilder.add(ModBlocks.RED_WALL_PLANKS_VERTICAL, "Red Vertical Wall Planks");
        translationBuilder.add(ModBlocks.BLACK_WALL_PLANKS_VERTICAL, "Black Vertical Wall Planks");

        translationBuilder.add(ModBlocks.GRAVEL,"Gravel");
        
        translationBuilder.add(ModBlocks.FACTORY_PLATE_WHITE,"White Factory Plate");
        translationBuilder.add(ModBlocks.FACTORY_PLATE_GRAY,"Gray Factory Plate");
        translationBuilder.add(ModBlocks.VENTILATION, "Ventilation");
        translationBuilder.add(ModBlocks.RUST_VENTILATION, "Rust Ventilation");
        translationBuilder.add(ModBlocks.GARAGE_DOOR, "Garage Door Block");
        translationBuilder.add(ModBlocks.RUST_GARAGE_DOOR, "Rust Garage Door Block");
        translationBuilder.add(ModBlocks.DANGER_BLOCK, "Danger Lines Block");
        translationBuilder.add(ModBlocks.ELECTRIC_PANEL, "Electric Panel");
        translationBuilder.add(ModBlocks.ELECTRIC_PANEL_B, "Electric Panel (B)");
        translationBuilder.add(ModBlocks.INDUSTRIAL_LAMP, "Industrial Lamp");
        translationBuilder.add(ModBlocks.NUCLEAR_BLOCK, "Nuclear Block");
        
    }
}
