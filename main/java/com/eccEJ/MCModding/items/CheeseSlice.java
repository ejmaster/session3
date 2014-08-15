package com.eccEJ.MCModding.items;

import com.eccEJ.MCModding.Main;

import net.minecraft.item.ItemFood;

public class CheeseSlice extends ItemFood {
	public CheeseSlice(int hunger, boolean wolfFood, String unlocalizedName) {
		super(hunger, wolfFood);
		// TODO Auto-generated constructor stub
		 this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModItems);

	
	 }


}
