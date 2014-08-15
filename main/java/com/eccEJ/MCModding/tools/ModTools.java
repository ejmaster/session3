package com.eccEJ.MCModding.tools;

import com.eccEJ.MCModding.materials.ModMaterials;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {
	 public static Item TitaniumHoe  = new TitaniumHoe(ModMaterials.titanium, "TitaniumHoe");
	 public static Item tomatoSword;
	 public static Item NetherSword;
	 
	 public static final void init() {
		 GameRegistry.registerItem(TitaniumHoe, "TitaniumHoe");
		 GameRegistry.registerItem(tomatoSword= new TomatoSword(ModMaterials.tomato, "tomatoSword"), "tomatoSword");
		 GameRegistry.registerItem(NetherSword= new NetherSword(ModMaterials.Nether,"NetherSword"), "NetherSword");
	 
	 }
}
