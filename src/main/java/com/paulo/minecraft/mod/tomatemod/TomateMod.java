package com.paulo.minecraft.mod.tomatemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod(TomateMod.MODID)
public class TomateMod {

	public static final String MODID = "tomatemod";
	
	private static final Logger log = LogManager.getLogger(MODID);
	
	
	public TomateMod() {
		log.info("Starting Tomate Mod");
	}

}
