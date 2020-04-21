package com.paulo.minecraft.mod.tomatemod.init;

import java.util.function.Supplier;

import com.paulo.minecraft.mod.tomatemod.TomateMod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(TomateMod.MODID, () -> new ItemStack(ModItems.TOMATO));


	public static class ModItemGroup extends ItemGroup {

		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}
	}
}
