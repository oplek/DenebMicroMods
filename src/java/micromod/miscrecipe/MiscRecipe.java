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
   		GameRegistry.addSmelting(Items.golden_pickaxe, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_sword, stack_goldbars, 0f);
   		//GameRegistry.addSmelting(Items.golden_shovel, stack_goldbars, 0f);
   			//...needs at least 2 gold in construction to qualify
   		GameRegistry.addSmelting(Items.golden_boots, stack_goldbars, 0f);
   		GameRegistry.addSmelting(Items.golden_helmet, stack_goldbars, 0f);   		
   		
   		// .. 2 bars
   		ItemStack stack_goldbars2 = new ItemStack(Items.gold_ingot);
   			stack_goldbars2.stackSize = 2;
   	   	GameRegistry.addSmelting(Items.golden_chestplate, stack_goldbars2, 0f);
   		GameRegistry.addSmelting(Items.golden_leggings, stack_goldbars2, 0f);
   		GameRegistry.addSmelting(Items.golden_horse_armor, stack_goldbars2, 0f);
 		
   		
   		//Smelt iron armor/swords/things into iron (1bar)
	    ItemStack stack_ironbars = new ItemStack(Items.iron_ingot);
	    	stack_ironbars.stackSize = 1;
   		GameRegistry.addSmelting(Items.iron_axe, stack_ironbars, 0f);
   		GameRegistry.addSmelting(Items.iron_hoe, stack_ironbars, 0f);
   		GameRegistry.addSmelting(Items.iron_pickaxe, stack_ironbars, 0f);
   		GameRegistry.addSmelting(Items.iron_sword, stack_ironbars, 0f);
   		//GameRegistry.addSmelting(Items.iron_shovel, stack_ironbars, 0f);
			//...needs at least 2 iron in construction to qualify
   		GameRegistry.addSmelting(Items.iron_boots, stack_ironbars, 0f);
   		GameRegistry.addSmelting(Items.iron_helmet, stack_ironbars, 0f);   		
    		GameRegistry.addSmelting(Items.bucket, stack_ironbars, 0f);
   		GameRegistry.addSmelting(Blocks.iron_bars, stack_ironbars, 0f);
  		  		
 		// .. 2 bars
 		ItemStack stack_ironbars2 = new ItemStack(Items.iron_ingot);
 			stack_ironbars2.stackSize = 2;
 		GameRegistry.addSmelting(Items.iron_door, stack_ironbars2, 0f);
  		GameRegistry.addSmelting(Items.cauldron, stack_ironbars2, 0f);
   		GameRegistry.addSmelting(Items.minecart, stack_ironbars2, 0f);
  		GameRegistry.addSmelting(Items.iron_horse_armor, stack_ironbars2, 0f);
   		GameRegistry.addSmelting(Items.iron_chestplate, stack_ironbars2, 0f);
   		GameRegistry.addSmelting(Items.iron_leggings, stack_ironbars2, 0f);
   		GameRegistry.addSmelting(Blocks.hopper, stack_ironbars2, 0f);
   		
   		
   		// .. 3 bars
 		ItemStack stack_ironbars3 = new ItemStack(Items.iron_ingot);
			stack_ironbars3.stackSize = 3;
	   	GameRegistry.addSmelting(Blocks.anvil, stack_ironbars3, 0f);
		 		
   	    		
   		//Break up sandstone into sand
   		ItemStack stack_sand = new ItemStack(Blocks.sand);
   			stack_sand.stackSize = 4;
   		GameRegistry.addShapelessRecipe(stack_sand,Blocks.sandstone);
   		
   		//Break up smooth sandstone into sandstone
   		// ... or not (can't find ID)
   		//ItemStack stack_sandstone = new ItemStack(Blocks.sandstone);
   		//GameRegistry.addShapelessRecipe(stack_sandstone,Blocks.);
   		
   }
}

