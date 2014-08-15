package com.eccEJ.MCModding.items;

import net.minecraft.item.ItemFood;

import com.eccEJ.MCModding.Main;

public class TomatoSlice extends ItemFood{
	public TomatoSlice(int hunger, boolean wolfFood, String unlocalizedName) {
		super(hunger, wolfFood);
		// TODO Auto-generated constructor stub
		 this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModItems);

	
	 }


}
