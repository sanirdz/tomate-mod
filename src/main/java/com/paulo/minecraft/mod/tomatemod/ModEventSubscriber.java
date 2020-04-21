package com.paulo.minecraft.mod.tomatemod;

import com.paulo.minecraft.mod.tomatemod.init.ModBlocks;
import com.paulo.minecraft.mod.tomatemod.init.ModItemGroups;
import com.paulo.minecraft.mod.tomatemod.seed.TomatoSeedItem;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = TomateMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "tomate"),
			setup(new TomatoSeedItem(ModBlocks.TOMATO_CROP_BLOCK), "tomato_seeds")
		);
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(TomateMod.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(
			final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
}
