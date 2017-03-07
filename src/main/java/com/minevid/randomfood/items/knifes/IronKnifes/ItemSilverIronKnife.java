package com.minevid.randomfood.items.knifes.IronKnifes;

import com.minevid.randomfood.creativeTab.CreativeTabRF;
import com.minevid.randomfood.references.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ItemSilverIronKnife extends Item {
    public ItemSilverIronKnife() {
        setRegistryName("silverironknife");
        setUnlocalizedName(References.MOD_ID + ".silverironknife");
        GameRegistry.register(this);
        this.setCreativeTab(CreativeTabRF.RF_TAB_KNIFE);
        setMaxStackSize(References.MaxStackSizeTool);
        setNoRepair();
        setMaxDamage(References.MaxDamageIronTool);
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1);

        if (itemStack.isItemEnchanted()) {
            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
            returnItem.setTagCompound(nbtTagCompound);
        }

        return returnItem;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
