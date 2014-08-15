package com.eccEJ.MCModding.items;

import com.eccEJ.MCModding.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionAttackDamage;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class StrengthCookie extends ItemFood{
	public StrengthCookie(int hunger, boolean wolfFood, String unlocalizedName) {
		super(hunger, wolfFood);
		// TODO Auto-generated constructor stub
		 this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModItems);
	}

		@Override
	public ItemStack onEaten(ItemStack item, World world, EntityPlayer player ){
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1000, 255));
		player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel()+4);
		
		item.stackSize--;
		player.heal(5);
		return item;
	}
}

	
	 


	

