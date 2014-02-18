package micromod.lapizlamp;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.*;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.GameRegistry;
import micromod.lapizlamp.CommonProxy;
import micromod.lapizlamp.LapizLampBlock;

import java.util.logging.Level;

import net.minecraftforge.common.*;

@Mod(modid="LapizLamp", name="Lapiz Lamp", version="0.0.1")
public class LapizLamp {

	public static LapizLampBlock lamp;
	
	 // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="micromod.lapizlamp.client.ClientProxy", serverSide="micromod.lapizlamp.CommonProxy")
    public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	lamp = new LapizLampBlock(null);
    	Material m = Material.redstoneLight;
    	//GameRegistry.
    	
    	GameRegistry.registerBlock(lamp, "lapizLamp");
    	
    }
}
