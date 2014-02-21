package com.calixnar.testblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockDryGrass extends Block {

	protected BlockDryGrass() {
		
		super(Material.rock);
		
		setBlockName("Dry Grass");
		
		this.setCreativeTab(TestBlock.test_tab);
		
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon dryGrassSides;
	
	@SideOnly(Side.CLIENT)
	private IIcon dryGrassTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon dryGrassBottom;
	
	@Override
    public IIcon getIcon(int par1, int par2)
    {
		
		//0 = bottom of block
		//1 = top of block
		//2-5 = side
		
		if(par1 == 0)
			return this.dryGrassBottom;
		else if(par1 == 1)
			return this.dryGrassTop;
		else 
			return this.dryGrassSides;
		
    
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		
		this.dryGrassSides = reg.registerIcon(TestBlock.MODID + ":dry_grass_sides");
		this.dryGrassTop = reg.registerIcon(TestBlock.MODID + ":dry_grass_top");
		this.dryGrassBottom = reg.registerIcon(TestBlock.MODID + ":dry_grass_bottom");
		
	}

}
