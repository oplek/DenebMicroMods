package micromod.lapizlamp;

import net.minecraft.block.BlockGlowstone;

import net.minecraft.block.material.Material;

public class LapizLampBlock extends BlockGlowstone {

	public LapizLampBlock(Material p_i45409_1_) {
		super(p_i45409_1_);
		// TODO Auto-generated constructor stub
		
		this.setLightLevel(1000f);
		this.setBlockName("lapizLamp");
		this.opaque=false;
		this.setLightOpacity(-100);
		this.getMaterial();
		
		
	}

}
