package com.calixnar.testblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTestBlock extends Block{
	
	protected BlockTestBlock() {
		
		super(Material.rock);

		this.setBlockName("testBlock");
		this.setBlockTextureName(TestBlock.MODID + ":fancy_block");
		this.setCreativeTab(TestBlock.test_tab);
						
	}

}
