package redactov.frb;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redactov.frb.block.ModBlocks;
import redactov.frb.item.ModItems;
import redactov.frb.screenhandler.DumpsterScreenHandler;
import redactov.frb.screenhandler.DumpsterBScreenHandler;


public class FlewtownRedactovBlocks implements ModInitializer {
	public static final String MOD_ID = "frb";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ScreenHandlerType<DumpsterScreenHandler> DUMPSTER_SCREEN_HANDLER_TYPE = Registry.register(
			Registries.SCREEN_HANDLER,
			new Identifier(FlewtownRedactovBlocks.MOD_ID, "dumpster"),
			new ScreenHandlerType<>(DumpsterScreenHandler::new, FeatureSet.empty())
	);

	public static final ScreenHandlerType<DumpsterBScreenHandler> DUMPSTER_B_SCREEN_HANDLER_TYPE = Registry.register(
			Registries.SCREEN_HANDLER,
			new Identifier(FlewtownRedactovBlocks.MOD_ID, "dumpster_b"),
			new ScreenHandlerType<>(DumpsterBScreenHandler::new, FeatureSet.empty())
	);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		GreenfieldItemGroup.initialize();
		ModBlocks.initialize();
		BlocksEntityTypes.initialize();
		ModItems.initialize();

	}
}