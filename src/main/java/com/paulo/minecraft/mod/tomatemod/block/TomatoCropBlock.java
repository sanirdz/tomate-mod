package com.paulo.minecraft.mod.tomatemod.block;

import com.paulo.minecraft.mod.tomatemod.init.ModItems;

import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.IItemProvider;

public class TomatoCropBlock extends CropsBlock {
	
	public TomatoCropBlock() {
		super(Properties.create(Material.PLANTS).
				tickRandomly().
				hardnessAndResistance(0.0F).
				doesNotBlockMovement().
				sound(SoundType.CROP));
	}

	protected IItemProvider getSeedsItem() {
		return ModItems.TOMATO_SEEDS;
	}
}
