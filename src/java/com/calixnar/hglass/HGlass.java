package com.calixnar.hglass;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod(modid = HGlass.MODID, version = HGlass.VERSION, name = HGlass.NAME)

public class HGlass {
	
	public static final String MODID = "hglass";
	public static final String VERSION = "0.1";
	public static final String NAME = "Horizontal Glass";
	
	public static Block hglass;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		hglass = new BlockHGlass();
		
		GameRegistry.registerBlock(hglass, hglass.getUnlocalizedName());
		
	}
	
}
