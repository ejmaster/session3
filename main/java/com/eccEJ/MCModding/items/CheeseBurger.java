package com.eccEJ.MCModding.items;

import com.eccEJ.MCModding.Main;

import net.minecraft.item.ItemFood;

public class CheeseBurger extends ItemFood{
	public CheeseBurger(int hunger, boolean wolfFood, String unlocalizedName) {
		super(hunger, wolfFood);
		 this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModItems);

	
	 }
}


