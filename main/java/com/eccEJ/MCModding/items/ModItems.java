package com.eccEJ.MCModding.items;

import com.eccEJ.MCModding.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class ModItems {

    public static Item tutorialItem;
    public static Item Tomato;
    public static Item Banana;
    public static Item tutorialFood;
    public static Item bowThing;
    public static Item Cheese;
    public static Item StrengthCookie;
    public static Item CheeseBurger;
    public static Item BreadSlice;
    public static Item CheeseSlice;
    public static Item TomatoSlice;
    public static final void init() {
     	//register your items here	
    	GameRegistry.registerItem(tutorialItem= new BasicItem("Item"), "Item");
        GameRegistry.registerItem(tutorialItem= new BasicItem("tutorialItem"), "tutorialItem");
        
        GameRegistry.registerItem(Banana= new Banana(2, false, "Banana"), "Banana");
        GameRegistry.registerItem(Tomato= new Tomato(2, false, "Tomato"),"Tomato");
        GameRegistry.registerItem(Cheese= new Cheese(3, false, "Cheese"), "Cheese");
        GameRegistry.registerItem(StrengthCookie= new StrengthCookie(0, false, "StrengthCookie"), "StrengthCookie");
        GameRegistry.registerItem(CheeseBurger= new CheeseBurger(8, false, "CheeseBurger"), "CheeseBurger");
        GameRegistry.registerItem(BreadSlice= new BreadSlice(1, false, "BreadSlice"), "BreadSlice");
        GameRegistry.registerItem(CheeseSlice= new CheeseSlice(1, false, "CheeseSlice"), "CheeseSlice");
        GameRegistry.registerItem(TomatoSlice= new TomatoSlice(1, false, "TomatoSlice"), "TomatoSlice");
        //register your item to the mod item tabs
       
        
        GameRegistry.registerItem(tutorialFood= new BlockFood(3, false, "tutorialFood"), "tutorialFood");
        
      
        
        
    }

    //this is your creative tab for items
    public static CreativeTabs tabModItems = new CreativeTabs("tabModItems") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.ender_eye;
        }
    };
}