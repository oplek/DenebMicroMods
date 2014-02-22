package com.calixnar.hglass;

import com.calixnar.testblock.TestBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockHGlass extends Block{

	protected BlockHGlass() {
		
		super(Material.glass);
	
		this.setBlockName("hglass");
		
		this.setCreativeTab(TestBlock.test_tab);

		
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon hglassTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon hglassTransparent;
	
	@Override
	public IIcon getIcon(int par1, int par2) {
		
		if(par1 == 1)
			return this.hglassTop;
		else
			return this.hglassTransparent;
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		
		this.hglassTop = reg.registerIcon(HGlass.MODID + ":horizontal_glass");
		this.hglassTransparent = reg.registerIcon(HGlass.MODID + ":transparent");
		
	}
	

}
