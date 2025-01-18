package redactov.frb.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.*;
import net.minecraft.world.World;
import redactov.frb.FlewtownRedactovBlocks;


public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(FlewtownRedactovBlocks.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

    public static void initialize() {}

    public static class Document extends Item{


        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            FlewtownRedactovBlocks.LOGGER.info("World:" + world + " User: " + user + " Hand: " + hand);

            if(user.getStackInHand(hand).hasNbt()){
                user.getStackInHand(hand).setNbt(new NbtCompound());
                NbtCompound nbt = user.getStackInHand(hand).getNbt();
                assert nbt != null;
                nbt.putString("Fulln","bruh");

            }

            return super.use(world, user, hand);
        }

        public Document(Settings settings) {
            super(settings);
            settings.maxCount(1);
            settings.maxDamage(0);
            settings.rarity(Rarity.EPIC);

        }

        @Override
        public boolean hasGlint(ItemStack stack) {
            return super.hasGlint(stack);
        }
    }

    public static final Item DOCUMENT = register(new Document(new Item.Settings().maxCount(1).maxDamage(0).rarity(Rarity.EPIC)),"document" );
}

