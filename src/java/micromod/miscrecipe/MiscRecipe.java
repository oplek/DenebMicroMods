package micromod.miscrecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import micromod.miscrecipe.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="MiscRecipe", name="MiscRecipe", version="0.0.1")
public class MiscRecipe {

	
	 // Says where the client and server 'proxy' code is loaded.
   @SidedProxy(clientSide="micromod.miscrecipe.client.ClientProxy", serverSide="micromod.miscrecipe.CommonProxy")
   public static CommonProxy proxy;
	
   @EventHandler
   public void preInit(FMLPreInitializationEvent event) {
   		
	    //Smelt gold armor/swords into gold 
	    ItemStack stack_goldbars = new ItemStack(Items.gold_ingot);
	    	stack_goldbars.stackSize = 1;
   		GameRegistry.addSmelting(Items.golden_axe, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_hoe, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_horse_armor, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_pickaxe, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_sword, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_boots, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_chestplate, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_helmet, stack_goldbars, 0f);   		
   		GameRegistry.addSmelting(Items.golden_leggings, stack_goldbars, 0f);
   		
   		//Break up sandstone into sand
   		ItemStack stack_sand = new ItemStack(Blocks.sand);
   		GameRegistry.addShapelessRecipe(stack_sand,Blocks.sandstone);
   		
   		//Break up smooth sandstone into sandstone
   		// ... or not (can't find ID)
   		//ItemStack stack_sandstone = new ItemStack(Blocks.sandstone);
   		//GameRegistry.addShapelessRecipe(stack_sandstone,Blocks.);
   		
   }
}

