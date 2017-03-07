package com.minevid.randomfood.items;

import com.minevid.randomfood.items.blades.ItemIronBlades;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ModItems {

    //Make Private instances
    public static ItemIronBlades ironBlades;


    public static void init()
    {
        ironBlades = new ItemIronBlades();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        ironBlades.initModel();
    }
}
