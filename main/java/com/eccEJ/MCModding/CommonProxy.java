package com.eccEJ.MCModding;

import com.eccEJ.MCModding.armors.ModArmor;
import com.eccEJ.MCModding.blocks.ModBlocks;
import com.eccEJ.MCModding.items.ModItems;
import com.eccEJ.MCModding.materials.ModMaterials;
import com.eccEJ.MCModding.recipes.ModRecipes;
import com.eccEJ.MCModding.tools.ModTools;
import com.eccEJ.MCModding.world.OreSpawner;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModMaterials.init();
    	ModBlocks.init();
        ModItems.init();
        ModArmor.init();
        ModTools.init();
        
    }

    public void init(FMLInitializationEvent e) {
    	ModRecipes.init();
    	 GameRegistry.registerWorldGenerator(new OreSpawner(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
