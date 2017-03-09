package com.minevid.randomfood.proxy;

import com.minevid.randomfood.blocks.ModBlocks;
import com.minevid.randomfood.items.ModItems;
import com.minevid.randomfood.recipes.ModItemCrafting;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Reynout on 7/03/2017.
 */
public abstract class CommonProxy  {

    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent event)
    {
        ModItemCrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
