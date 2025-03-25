package redactov.frb;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import redactov.frb.block.ModBlocks;
import redactov.frb.block.RedactovBlocks;

public class FlewtownRedactovBlocksClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		HandledScreens.register(FlewtownRedactovBlocks.DUMPSTER_SCREEN_HANDLER_TYPE, DumpsterScreen::new);
		HandledScreens.register(FlewtownRedactovBlocks.DUMPSTER_B_SCREEN_HANDLER_TYPE,DumpsterBScreen::new);

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_B, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_B, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARCODED_GLASS_A, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARCODED_GLASS_B, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_PANE_A, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_PANE_B, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARCODED_GLASS_PANE_A, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARCODED_GLASS_PANE_B, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRON_BARS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(RedactovBlocks.ROAD_BARREL, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(RedactovBlocks.MODERN_SMALL_WINDOW, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(RedactovBlocks.MODERN_LARGE_WINDOW, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METAL_DOOR_B, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METAL_GRID_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRID_TRAPDOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GRID_DOOR, RenderLayer.getCutout());



	}
}