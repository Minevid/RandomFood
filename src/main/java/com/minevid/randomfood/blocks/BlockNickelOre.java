package com.minevid.randomfood.blocks;

import com.minevid.randomfood.creativeTab.CreativeTabRF;
import com.minevid.randomfood.references.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 10/03/2017.
 */
public class BlockNickelOre extends Block
{
    public BlockNickelOre() {
        super(Material.ROCK);
        setRegistryName("nickelore");
        setUnlocalizedName(References.MOD_ID + ".nickelore");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(CreativeTabRF.RF_TAB);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
