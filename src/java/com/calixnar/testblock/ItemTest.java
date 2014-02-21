package com.calixnar.testblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemTest extends Item {
	
	protected ItemTest(String itemName) {
		
		this.setUnlocalizedName(itemName);
		this.setTextureName(TestBlock.MODID + ":cow_pie");
		
		this.setCreativeTab(TestBlock.test_tab);
		
	}
	/*
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {

		this.itemIcon = reg.registerIcon(TestBlock.MODID + ":" + this.getIconString());
		
	}
	*/

}
