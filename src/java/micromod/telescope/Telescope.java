package micromod.telescope;

import micromod.telescope.CommonProxy;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="Telescope", name="Telescope", version="0.0.1")
	public class Telescope {

		
		 // Says where the client and server 'proxy' code is loaded.
	    @SidedProxy(clientSide="micromod.telescope.client.ClientProxy", serverSide="micromod.telescope.CommonProxy")
	    public static CommonProxy proxy;
		
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	    		    	
	    }
	}
