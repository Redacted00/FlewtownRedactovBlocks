package redactov.frb.component;

import com.mojang.serialization.Codec;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;
import redactov.frb.FlewtownRedactovBlocks;

public class ModComponents {

    protected static void initialize() {
        FlewtownRedactovBlocks.LOGGER.info("Registering {} components", FlewtownRedactovBlocks.MOD_ID);
        // Technically this method can stay empty, but some developers like to notify
        // the console, that certain parts of the mod have been successfully initialized
    }

}
