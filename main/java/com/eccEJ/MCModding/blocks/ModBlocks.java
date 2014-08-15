package com.eccEJ.MCModding.blocks;

import com.eccEJ.MCModding.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public final class ModBlocks {

    public static Block TomatoBlock;
    public static Block tutorialBlock;

    public static final void init() {
        GameRegistry.registerBlock(TomatoBlock = new TomatoBlock("TomatoBlock", 
        		Material.wood), "TomatoBlock").setCreativeTab(tabModBlocks);
        
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", 
        		Material.glass), "tutorialBlock").setCreativeTab(tabModBlocks);
        
    }
    
    //this is your creative tab for blocks
    public static CreativeTabs tabModBlocks = new CreativeTabs("tabModBlocks") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.ender_eye;
        }
    };
}