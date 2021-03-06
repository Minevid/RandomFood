package com.minevid.randomfood.items.handles;

import com.minevid.randomfood.creativeTab.CreativeTabRF;
import com.minevid.randomfood.references.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ItemGrayHandle extends Item {
    public ItemGrayHandle(){
        setRegistryName("grayhandle");
        setUnlocalizedName(References.MOD_ID + ".grayhandle");
        GameRegistry.register(this);
        this.setCreativeTab(CreativeTabRF.RF_TAB_KNIFE);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
