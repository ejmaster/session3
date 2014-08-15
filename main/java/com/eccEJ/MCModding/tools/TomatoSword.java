package com.eccEJ.MCModding.tools;

import ibxm.Player;

import com.eccEJ.MCModding.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

public class TomatoSword extends ItemSword{
	public TomatoSword(ToolMaterial tomato, String unlocalizedName) {
		super(tomato);
		this.setTextureName(Main.MODID+":"+unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setPotionEffect(Potion.blindness.toString());
		//this.onLeftClickEntity(stack, player, entity)
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack,EntityPlayer player,Entity entity){
		entity.setFire(9000);
		entity.attackEntityFrom(DamageSource.generic, 1112);
		return true;
	}
}
