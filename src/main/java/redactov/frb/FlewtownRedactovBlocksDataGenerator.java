package redactov.frb;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import redactov.frb.datagen.ModBlockTagProvider;
import redactov.frb.datagen.ModEnglishLangProvider;
import redactov.frb.datagen.ModLootTableProvider;
import redactov.frb.datagen.ModModelProvider;

public class FlewtownRedactovBlocksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
