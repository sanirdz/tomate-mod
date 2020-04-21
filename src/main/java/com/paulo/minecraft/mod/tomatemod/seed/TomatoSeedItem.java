package com.paulo.minecraft.mod.tomatemod.seed;

import com.paulo.minecraft.mod.tomatemod.init.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;

public class TomatoSeedItem extends BlockNamedItem {

	public TomatoSeedItem(Block cropBlockIn) {
		super(cropBlockIn, new Properties().group(ModItemGroups.MOD_ITEM_GROUP));
	}
}
