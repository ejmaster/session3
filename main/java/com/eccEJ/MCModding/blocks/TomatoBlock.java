package com.eccEJ.MCModding.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.eccEJ.MCModding.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TomatoBlock extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;
	@SideOnly(Side.CLIENT)
	private IIcon back;
	@SideOnly(Side.CLIENT)
	private IIcon left;
	@SideOnly(Side.CLIENT)
	private IIcon right;
	
    protected TomatoBlock(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setHardness(1.0F);
        this.setResistance(1.0F);
        this.setHarvestLevel("hoe", 1);
        this.setStepSound(soundTypeSnow);
       
    }
    
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int p_149691_2_)
    {
    return (side == 1 ? this.top : side == 2 ? this.front : side == 5 ? this.left : 
    	side == 3 ? this.back :side == 0 ? this.bottom : side == 4 ? this.right : this.blockIcon);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
    this.front = p_149651_1_.registerIcon(Main.MODID + ":" + "TomatoBlockside");
    this.top = p_149651_1_.registerIcon(Main.MODID + ":" + "TomatoBlocktop");
    this.back = p_149651_1_.registerIcon(Main.MODID + ":" + "TomatoBlockside");
    this.bottom= p_149651_1_.registerIcon(Main.MODID + ":" + "TomatoBlockside");
    this.right= p_149651_1_.registerIcon(Main.MODID + ":" + "TomatoBlockside");
    this.left= p_149651_1_.registerIcon(Main.MODID + ":" + "TomatoBlockside");
    }
}
