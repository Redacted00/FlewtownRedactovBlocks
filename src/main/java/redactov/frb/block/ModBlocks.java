package redactov.frb.block;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.util.Identifier;

import redactov.frb.FlewtownRedactovBlocks;
import redactov.frb.GreenfieldItemGroup;
import redactov.frb.block.props.DumpsterABlock;
import redactov.frb.block.props.DumpsterBBlock;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = new Identifier(FlewtownRedactovBlocks.MOD_ID, name);

        // Sometimes, you may not want to    register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        ItemGroupEvents.modifyEntriesEvent(GreenfieldItemGroup.ITEM_GROUP).register(content -> {
            content.add(block);
        });



        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}


    // Блоки

    public static class GlassPane extends PaneBlock {

        public GlassPane(Settings settings) {
            super(settings);
            setDefaultState(getDefaultState().with(NORTH,Boolean.FALSE));
            setDefaultState(getDefaultState().with(EAST,Boolean.FALSE));
            setDefaultState(getDefaultState().with(SOUTH,Boolean.FALSE));
            setDefaultState(getDefaultState().with(WEST,Boolean.FALSE));
            setDefaultState(getDefaultState().with(WATERLOGGED,Boolean.FALSE));
            //setDefaultState(getDefaultState().with(LIT,Boolean.FALSE));
        }

    }

    public static class Lamp extends RedstoneLampBlock {

        public Lamp(Settings settings) {
            super(settings);
            setDefaultState(getDefaultState().with(LIT,Boolean.TRUE));

        }

    }


    //public static final AbstractBlock.Settings Default_Block = AbstractBlock.Settings.create().mapColor(MapColor.STONE_GREY).instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F);

    private static final AbstractBlock.Settings GlassBlockSettings = AbstractBlock.Settings.create().nonOpaque().sounds(BlockSoundGroup.GLASS).hardness(0.4f);

    public static final Block GRASS = register(new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)),"grass",true);
    public static final Block GRASS_PATH = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"grass_path",true);
    public static final Block DIRT = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"dirt",true);
    public static final Block SOIL_A = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_a",true);
    public static final Block SOIL_B = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_b",true);
    public static final Block SOIL_C = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_c",true);
    public static final Block SOIL_D = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_d",true);
    public static final Block SOIL_E = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_e",true);
    public static final Block SOIL_F = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_f",true);
    public static final Block SOIL_G = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_g",true);
    public static final Block SOIL_H = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_h",true);
    public static final Block SOIL_I = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_i",true);
    public static final Block SOIL_J = register(new Block(FabricBlockSettings.copyOf(Blocks.DIRT)),"soil_j",true);
    public static final Block COBBLE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cobble",true);
    public static final Block COBBLE_LIGHT = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cobble_light",true);
    public static final Block COBBLE_DARK = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cobble_dark",true);
    public static final Block MOSSY_COBBLE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"mossy_cobble",true);
    public static final Block DECO_COBBLE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"deco_cobble",true);

    public static final Block STONE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_a",true);
    public static final Block DIRTY_STONE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"dirty_stone",true);
    public static final Block STONE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_b",true);
    public static final Block STONE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_c",true);
    public static final Block SMOOTH_STONE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"smooth_stone_a",true);
    public static final Block SMOOTH_STONE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"smooth_stone_b",true);
    public static final Block SMOOTH_STONE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"smooth_stone_c",true);


    // BRICKS
    public static final Block BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"bricks",true);
    public static final Block BRICKS_OLD_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"bricks_old_a",true);
    public static final Block BRICKS_OLD_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"bricks_old_b",true);
    public static final Block WHITE_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_bricks",true);
    public static final Block ORANGE_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_bricks",true);
    public static final Block BROWN_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_bricks",true);
    public static final Block DARK_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"dark_bricks",true);
    public static final Block DIRTY_BRICKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"dirty_bricks",true);



    // STONE PLATE's
    public static final Block STONE_PLATE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate",true);
    public static final Block STONE_PLATE_GREY = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_grey",true);
    public static final Block STONE_PLATE_LIGHT_GREY = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_light_grey",true);
    public static final Block STONE_PLATE_WHITE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_white",true);
    public static final Block STONE_PLATE_WHITE_COLORB = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_white_colorb",true);
    public static final Block STONE_PLATE_WHITE_COLORC = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_white_colorc",true);
    public static final Block STONE_PLATE_YELLOW = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_yellow",true);
    public static final Block STONE_PLATE_DARK_YELLOW = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"stone_plate_dark_yellow",true);

    //BRICK PLATE's

    public static final Block BRICK_PLATE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate",true);
    public static final Block BRICK_PLATE_OLD = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_old",true);
    public static final Block BRICK_PLATE_MOSSY = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_mossy",true);
    public static final Block BRICK_PLATE_OLD_MOSSY = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_old_mossy",true);
    public static final Block BRICK_PLATE_WHITE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_white",true);
    public static final Block BRICK_PLATE_YELLOW = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_yellow",true);
    public static final Block BRICK_PLATE_DESERT = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_desert",true);
    public static final Block BRICK_PLATE_GREY = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_grey",true);
    public static final Block BRICK_PLATE_DARK_YELLOW = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_dark_yellow",true);
    public static final Block BRICK_PLATE_BROWN = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brick_plate_brown",true);


    // PLANKS

    public static final Block OAK_PLANKS_A = register(new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), "oak_planks_a",true);
    public static final Block OAK_PLANKS_B = register(new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), "oak_planks_b",true);
    public static final Block STRIPPED_OAK_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), "stripped_oak_planks",true);
    public static final Block OAK_PLANKS_C = register(new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), "oak_planks_c",true);
    public static final Block SPRUCE_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), "spruce_planks",true);
    public static final Block ACACIA_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), "acacia_planks",true);

    // CONCRETE
    //
    //
    // TYPE A
    public static final Block WHITE_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_concrete_a",true);
    public static final Block ORANGE_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_concrete_a",true);
    public static final Block MAGENTA_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"magenta_concrete_a",true);
    public static final Block LIGHT_BLUE_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_blue_concrete_a",true);
    public static final Block YELLOW_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"yellow_concrete_a",true);
    public static final Block LIME_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"lime_concrete_a",true);
    public static final Block PINK_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"pink_concrete_a",true);
    public static final Block GRAY_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"gray_concrete_a",true);
    public static final Block LIGHT_GRAY_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_gray_concrete_a",true);
    public static final Block CYAN_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cyan_concrete_a",true);
    public static final Block PURPLE_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"purple_concrete_a",true);
    public static final Block BLUE_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"blue_concrete_a",true);
    public static final Block BROWN_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_concrete_a",true);
    public static final Block GREEN_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"green_concrete_a",true);
    public static final Block RED_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"red_concrete_a",true);
    public static final Block BLACK_CONCRETE_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"black_concrete_a",true);
    // TYPE B
    public static final Block WHITE_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_concrete_b",true);
    public static final Block ORANGE_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_concrete_b",true);
    public static final Block MAGENTA_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"magenta_concrete_b",true);
    public static final Block LIGHT_BLUE_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_blue_concrete_b",true);
    public static final Block YELLOW_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"yellow_concrete_b",true);
    public static final Block LIME_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"lime_concrete_b",true);
    public static final Block PINK_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"pink_concrete_b",true);
    public static final Block GRAY_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"gray_concrete_b",true);
    public static final Block LIGHT_GRAY_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_gray_concrete_b",true);
    public static final Block CYAN_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cyan_concrete_b",true);
    public static final Block PURPLE_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"purple_concrete_b",true);
    public static final Block BLUE_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"blue_concrete_b",true);
    public static final Block BROWN_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_concrete_b",true);
    public static final Block GREEN_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"green_concrete_b",true);
    public static final Block RED_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"red_concrete_b",true);
    public static final Block BLACK_CONCRETE_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"black_concrete_b",true);
    // TYPE C
    public static final Block WHITE_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_concrete_c",true);
    public static final Block ORANGE_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_concrete_c",true);
    public static final Block MAGENTA_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"magenta_concrete_c",true);
    public static final Block LIGHT_BLUE_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_blue_concrete_c",true);
    public static final Block YELLOW_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"yellow_concrete_c",true);
    public static final Block LIME_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"lime_concrete_c",true);
    public static final Block PINK_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"pink_concrete_c",true);
    public static final Block GRAY_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"gray_concrete_c",true);
    public static final Block LIGHT_GRAY_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_gray_concrete_c",true);
    public static final Block CYAN_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cyan_concrete_c",true);
    public static final Block PURPLE_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"purple_concrete_c",true);
    public static final Block BLUE_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"blue_concrete_c",true);
    public static final Block BROWN_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_concrete_c",true);
    public static final Block GREEN_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"green_concrete_c",true);
    public static final Block RED_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"red_concrete_c",true);
    public static final Block BLACK_CONCRETE_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"black_concrete_c",true);
    // TYPE D
    public static final Block WHITE_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_concrete_d",true);
    public static final Block ORANGE_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_concrete_d",true);
    public static final Block MAGENTA_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"magenta_concrete_d",true);
    public static final Block LIGHT_BLUE_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_blue_concrete_d",true);
    public static final Block YELLOW_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"yellow_concrete_d",true);
    public static final Block LIME_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"lime_concrete_d",true);
    public static final Block PINK_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"pink_concrete_d",true);
    public static final Block GRAY_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"gray_concrete_d",true);
    public static final Block LIGHT_GRAY_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_gray_concrete_d",true);
    public static final Block CYAN_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cyan_concrete_d",true);
    public static final Block PURPLE_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"purple_concrete_d",true);
    public static final Block BLUE_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"blue_concrete_d",true);
    public static final Block BROWN_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_concrete_d",true);
    public static final Block GREEN_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"green_concrete_d",true);
    public static final Block RED_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"red_concrete_d",true);
    public static final Block BLACK_CONCRETE_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"black_concrete_d",true);

    // WALL PLANKS

    public static final Block WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"wall_planks",true);
    public static final Block WHITE_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_wall_planks",true);
    public static final Block ORANGE_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_wall_planks",true);
    public static final Block MAGENTA_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"magenta_wall_planks",true);
    public static final Block LIGHT_BLUE_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_blue_wall_planks",true);
    public static final Block YELLOW_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"yellow_wall_planks",true);
    public static final Block LIME_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"lime_wall_planks",true);
    public static final Block PINK_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"pink_wall_planks",true);
    public static final Block GRAY_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"gray_wall_planks",true);
    public static final Block LIGHT_GRAY_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_gray_wall_planks",true);
    public static final Block CYAN_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cyan_wall_planks",true);
    public static final Block PURPLE_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"purple_wall_planks",true);
    public static final Block BLUE_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"blue_wall_planks",true);
    public static final Block BROWN_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_wall_planks",true);
    public static final Block GREEN_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"green_wall_planks",true);
    public static final Block RED_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"red_wall_planks",true);
    public static final Block BLACK_WALL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"black_wall_planks",true);

    public static final Block WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"wall_planks_vertical",true);
    public static final Block WHITE_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"white_wall_planks_vertical",true);
    public static final Block ORANGE_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"orange_wall_planks_vertical",true);
    public static final Block MAGENTA_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"magenta_wall_planks_vertical",true);
    public static final Block LIGHT_BLUE_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_blue_wall_planks_vertical",true);
    public static final Block YELLOW_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"yellow_wall_planks_vertical",true);
    public static final Block LIME_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"lime_wall_planks_vertical",true);
    public static final Block PINK_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"pink_wall_planks_vertical",true);
    public static final Block GRAY_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"gray_wall_planks_vertical",true);
    public static final Block LIGHT_GRAY_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"light_gray_wall_planks_vertical",true);
    public static final Block CYAN_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"cyan_wall_planks_vertical",true);
    public static final Block PURPLE_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"purple_wall_planks_vertical",true);
    public static final Block BLUE_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"blue_wall_planks_vertical",true);
    public static final Block BROWN_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"brown_wall_planks_vertical",true);
    public static final Block GREEN_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"green_wall_planks_vertical",true);
    public static final Block RED_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"red_wall_planks_vertical",true);
    public static final Block BLACK_WALL_PLANKS_VERTICAL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)),"black_wall_planks_vertical",true);

    public static final Block GLASS_A = register(new GlassBlock(GlassBlockSettings),"glass_a",true);
    public static final Block GLASS_B = register(new GlassBlock(GlassBlockSettings),"glass_b",true);
    public static final Block ORANGE_GLASS = register(new GlassBlock(GlassBlockSettings),"orange_glass",true);
    public static final Block MAGENTA_GLASS = register(new GlassBlock(GlassBlockSettings),"magenta_glass",true);
    public static final Block LIGHT_BLUE_GLASS = register(new GlassBlock(GlassBlockSettings),"light_blue_glass",true);
    public static final Block YELLOW_GLASS = register(new GlassBlock(GlassBlockSettings),"yellow_glass",true);
    public static final Block LIME_GLASS = register(new GlassBlock(GlassBlockSettings),"lime_glass",true);
    public static final Block PINK_GLASS = register(new GlassBlock(GlassBlockSettings),"pink_glass",true);
    public static final Block GRAY_GLASS = register(new GlassBlock(GlassBlockSettings),"gray_glass",true);
    public static final Block LIGHT_GRAY_GLASS = register(new GlassBlock(GlassBlockSettings),"light_gray_glass",true);
    public static final Block CYAN_GLASS = register(new GlassBlock(GlassBlockSettings),"cyan_glass",true);
    public static final Block PURPLE_GLASS = register(new GlassBlock(GlassBlockSettings),"purple_glass",true);
    public static final Block BLUE_GLASS = register(new GlassBlock(GlassBlockSettings),"blue_glass",true);
    public static final Block BROWN_GLASS = register(new GlassBlock(GlassBlockSettings),"brown_glass",true);
    public static final Block GREEN_GLASS = register(new GlassBlock(GlassBlockSettings),"green_glass",true);
    public static final Block RED_GLASS = register(new GlassBlock(GlassBlockSettings),"red_glass",true);
    public static final Block BLACK_GLASS = register(new GlassBlock(GlassBlockSettings),"black_glass",true);
    public static final Block BARCODED_GLASS_A = register(new GlassBlock(GlassBlockSettings.strength(2f)),"barcoded_glass_a",true);
    public static final Block BARCODED_GLASS_B = register(new GlassBlock(GlassBlockSettings.strength(2f)),"barcoded_glass_b",true);

    public static final Block GLASS_PANE_A = register(new GlassPane(GlassBlockSettings),"glass_pane_a",true);
    public static final Block GLASS_PANE_B = register(new GlassPane(GlassBlockSettings),"glass_pane_b",true);
    public static final Block ORANGE_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"orange_glass_pane",true);
    public static final Block MAGENTA_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"magenta_glass_pane",true);
    public static final Block LIGHT_BLUE_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"light_blue_glass_pane",true);
    public static final Block YELLOW_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"yellow_glass_pane",true);
    public static final Block LIME_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"lime_glass_pane",true);
    public static final Block PINK_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"pink_glass_pane",true);
    public static final Block GRAY_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"gray_glass_pane",true);
    public static final Block LIGHT_GRAY_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"light_gray_glass_pane",true);
    public static final Block CYAN_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"cyan_glass_pane",true);
    public static final Block PURPLE_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"purple_glass_pane",true);
    public static final Block BLUE_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"blue_glass_pane",true);
    public static final Block BROWN_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"brown_glass_pane",true);
    public static final Block GREEN_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"green_glass_pane",true);
    public static final Block RED_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"red_glass_pane",true);
    public static final Block BLACK_GLASS_PANE = register(new GlassPane(GlassBlockSettings),"black_glass_pane",true);
    public static final Block BARCODED_GLASS_PANE_A = register(new GlassPane(GlassBlockSettings.strength(2f)),"barcoded_glass_pane_a",true);
    public static final Block BARCODED_GLASS_PANE_B = register(new GlassPane(GlassBlockSettings.strength(2f)),"barcoded_glass_pane_b",true);
    public static final Block GRAVEL = register(new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)),"gravel",true);
    public static final Block GRAVEL_B = register(new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)),"gravel_b",true);

    public static final Block DIRTY_BRICKS_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"dirty_bricks_stairs",true);
    public static final Block BRICKS_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"bricks_stairs",true);
    public static final Block BRICKS_OLD_A_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"bricks_old_a_stairs",true);
    public static final Block BRICKS_OLD_B_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"bricks_old_b_stairs",true);
    public static final Block WHITE_BRICKS_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"white_bricks_stairs",true);
    public static final Block ORANGE_BRICKS_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"orange_bricks_stairs",true);
    public static final Block BROWN_BRICKS_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"brown_bricks_stairs",true);
    public static final Block DARK_BRICKS_STAIRS = register(new StairsBlock(ModBlocks.DIRTY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)),"dark_bricks_stairs",true);
    public static final Block DIRTY_BRICKS_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)),"dirty_bricks_slab",true);
    public static final Block BRICKS_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"bricks_slab",true);
    public static final Block BRICKS_OLD_A_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"bricks_old_a_slab",true);
    public static final Block BRICKS_OLD_B_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"bricks_old_b_slab",true);
    public static final Block WHITE_BRICKS_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"white_bricks_slab",true);
    public static final Block ORANGE_BRICKS_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"orange_bricks_slab",true);
    public static final Block BROWN_BRICKS_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"brown_bricks_slab",true);
    public static final Block DARK_BRICKS_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIRTY_BRICKS)),"dark_bricks_slab",true);
    public static final Block SMOOTH_STONE_A_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)),"smooth_stone_a_slab",true);
    public static final Block SMOOTH_STONE_B_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)),"smooth_stone_b_slab",true);
    public static final Block SMOOTH_STONE_C_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)),"smooth_stone_c_slab",true);


    public static final Block WHITE_FACTORY_PLATE_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)),"white_factory_plate_slab",true);
    public static final Block GRAY_FACTORY_PLATE_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)),"gray_factory_plate_slab",true);
    public static final Block GRAVEL_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)),"gravel_slab",true);



    public static final Block DIRTY_BRICKS_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"dirty_bricks_wall",true);
    public static final Block BRICKS_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"bricks_wall",true);
    public static final Block BRICKS_OLD_A_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"bricks_old_a_wall",true);
    public static final Block BRICKS_OLD_B_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"bricks_old_b_wall",true);
    public static final Block WHITE_BRICKS_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"white_bricks_wall",true);
    public static final Block ORANGE_BRICKS_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"orange_bricks_wall",true);
    public static final Block BROWN_BRICKS_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"brown_bricks_wall",true);
    public static final Block DARK_BRICKS_WALL = register(new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).solid()),"dark_bricks_wall",true);

    // FACTORY
    public static final Block FACTORY_PLATE_WHITE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "factory_plate_white",true);
    public static final Block FACTORY_PLATE_GREY = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "factory_plate_grey",true);
    public static final Block VENTILATION = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "ventilation",true);
    public static final Block RUST_VENTILATION = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "rust_ventilation",true);
    public static final Block GARAGE_DOOR = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "garage_door",true);
    public static final Block RUST_GARAGE_DOOR = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "rust_garage_door",true);
    public static final Block DANGER_BLOCK = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "danger_block",true);
    public static final Block ELECTRIC_PANEL = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "electric_panel",true);
    public static final Block ELECTRIC_PANEL_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "electric_panel_b",true);
    public static final Block INDUSTRIAL_LAMP = register(new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(Instrument.PLING).strength(0.3F).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15)), "industrial_lamp",true);
    public static final Block NUCLEAR_BLOCK = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "nuclear_block",true);
    public static final Block BOX_A = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "box_a",true);
    public static final Block BOX_B = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "box_b",true);
    public static final Block BOX_C = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "box_c",true);
    public static final Block BOX_D = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "box_d",true);
    public static final Block BOX_E = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "box_e",true);
    public static final Block BOX_F = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "box_f",true);
    public static final Block CELL_PLATE = register(new Block(FabricBlockSettings.copyOf(Blocks.STONE)), "cell_plate",true);
    public static final Block SOLAR_PANEL_A = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)), "solar_panel_a",true);
    public static final Block SOLAR_PANEL_B = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)), "solar_panel_b",true);

    // Trapdoors
    public static final Block METAL_TRAPDOOR_A = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE),"metal_trapdoor_a",true);
    public static final Block METAL_TRAPDOOR_B = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE),"metal_trapdoor_b",true);
    public static final Block CONCRETE_TRAPDOOR_A = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE),"concrete_trapdoor_a",true);
    public static final Block CONCRETE_TRAPDOOR_B = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE),"concrete_trapdoor_b",true);
    public static final Block GLASS_TRAPDOOR = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.GLASS),BlockSetType.STONE),"glass_trapdoor",true);
    public static final Block GRID_TRAPDOOR = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE),"grid_trapdoor",true);
    public static final Block OAK_TRAPDOOR = register(new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.STONE),"oak_trapdoor",true);

    // Doors
    public static final Block METAL_DOOR_A = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.IRON),"metal_door_a",true);
    public static final Block METAL_DOOR_B = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.IRON),"metal_door_b",true);
    public static final Block BLACK_METAL_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.IRON),"black_metal_door",true);
    public static final Block METAL_GRID_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.STONE),BlockSetType.IRON),"metal_grid_door",true);
    public static final Block WHITE_GRID_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS),BlockSetType.OAK),"white_grid_door",true);
    public static final Block OAK_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS),BlockSetType.OAK),"oak_door",true);
    public static final Block DARK_OAK_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS),BlockSetType.DARK_OAK),"dark_oak_door",true);
    public static final Block WHITE_OAK_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS),BlockSetType.OAK),"white_oak_door",true);
    public static final Block GLASS_DOOR = register(new DoorBlock(FabricBlockSettings.copyOf(Blocks.GLASS),BlockSetType.STONE),"glass_door",true);

    // Bloha Models
    public static final Block DUMPSTER = register(new DumpsterABlock(AbstractBlock.Settings.copy(Blocks.CHEST)), "dumpster",true);
    public static final Block DUMPSTER_B = register(new DumpsterBBlock(AbstractBlock.Settings.copy(Blocks.CHEST)), "dumpster_b",true);


}


