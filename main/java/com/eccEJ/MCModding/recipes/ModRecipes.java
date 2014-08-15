package com.eccEJ.MCModding.recipes;

import com.eccEJ.MCModding.blocks.ModBlocks;
import com.eccEJ.MCModding.items.ModItems;
import com.eccEJ.MCModding.tools.ModTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public final class ModRecipes {
	 public static final void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(Items.baked_potato, 1), Blocks.diamond_block);
	 
		GameRegistry.addShapelessRecipe
		(new ItemStack(Items.nether_star)
		, Blocks.diamond_block);
		
		GameRegistry.addShapedRecipe
		(new ItemStack(Items.paper),
				"XXX",
				"   ",
				"   ",
				
				'X', Items.nether_star);
		
		GameRegistry.addSmelting
		(new ItemStack(Items.arrow),
				new ItemStack(Items.blaze_powder,64),
				10f);
		
		GameRegistry.addShapedRecipe
		(new ItemStack(ModItems.Tomato, 2), 
				"XXX",
				"   ",
				"   ",
				'X', Blocks.dirt);
		
		GameRegistry.addShapelessRecipe
		(new ItemStack(ModItems.Banana,1)
		, Blocks.dirt);
		
		GameRegistry.addShapelessRecipe
		(new ItemStack(ModItems.Tomato,9)
		, ModBlocks.TomatoBlock);
		
		GameRegistry.addShapedRecipe
		(new ItemStack(ModTools.NetherSword, 1),
				" X ",
				" X ",
				" K ",
				'X', Blocks.netherrack, 
				'K', Items.blaze_rod);
		
		GameRegistry.addShapedRecipe
		(new ItemStack(ModItems.CheeseBurger, 1), 
				"XXX",
				"YER",
				"XXX",
				'X', ModItems.BreadSlice, 
				'Y', ModItems.CheeseSlice, 
				'E', Items.cooked_beef, 
				'R', ModItems.TomatoSlice);
		
		GameRegistry.addShapelessRecipe
		(new ItemStack(ModItems.BreadSlice, 3)
		, Items.bread);
		
		GameRegistry.addShapelessRecipe
		(new ItemStack(ModItems.CheeseSlice, 3)
		, ModItems.Cheese);
		
		GameRegistry.addShapelessRecipe
		(new ItemStack(ModItems.TomatoSlice, 3)
		, ModItems.Tomato);
				
	 }
}
