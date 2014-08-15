package com.eccEJ.MCModding.tools;

import ibxm.Player;

import com.eccEJ.MCModding.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.DamageSource;


import com.eccEJ.MCModding.Main;

public class NetherSword extends ItemSword{
	public NetherSword(ToolMaterial Nether, String unlocalizedName) {
		super(Nether);
		this.setTextureName(Main.MODID+":"+unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		//this.onLeftClickEntity(stack, player, entity)
	}

}
