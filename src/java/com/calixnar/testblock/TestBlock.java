package com.calixnar.testblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TestBlock.MODID, version = TestBlock.VERSION, name = TestBlock.NAME)

public class TestBlock 
{
	
	public static final String MODID = "testblock";
	public static final String VERSION = "1.0";
	public static final String NAME = "TestBlock";
	
	public static Block testBlock;
	public static Block dryGrass;
	public static Item testItem;
	
	public static CreativeTabs test_tab = new CreativeTabsTestTab("Test Tab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		
		testBlock = new BlockTestBlock();
		dryGrass = new BlockDryGrass();
		testItem = new ItemTest("Cow Pie");
				
		GameRegistry.registerBlock(testBlock, testBlock.getUnlocalizedName());
		GameRegistry.registerBlock(dryGrass, dryGrass.getUnlocalizedName());
		GameRegistry.registerItem(testItem, testItem.getUnlocalizedName());
	}

}
