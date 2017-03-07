package com.minevid.randomfood.items;

import com.minevid.randomfood.items.blades.ItemDiamondBlade;
import com.minevid.randomfood.items.blades.ItemGoldBlade;
import com.minevid.randomfood.items.blades.ItemIronBlades;
import com.minevid.randomfood.items.handles.*;
import com.minevid.randomfood.items.knifes.IronKnifes.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ModItems {

    //Make Private instances
    public static ItemIronBlades ironBlades;
    public static ItemDiamondBlade diamondBlade;
    public static ItemGoldBlade goldBlade;

    public static ItemBlackIronKnife blackIronKnife;
    public static ItemBlueIronKnife blueIronKnife;
    public static ItemBrownIronKnife brownIronKnife;
    public static ItemCyanIronKnife cyanIronKnife;
    public static ItemGrayIronKnife grayIronKnife;
    public static ItemGreenIronKnife greenIronKnife;
    public static ItemLightBlueIronKnife lightBlueIronKnife;
    public static ItemLimeIronKnife limeIronKnife;
    public static ItemMagentaIronKnife magentaIronKnife;
    public static ItemOrangeIronKnife orangeIronKnife;
    public static ItemPinkIronKnife pinkIronKnife;
    public static ItemRedIronKnife redIronKnife;
    public static ItemSilverIronKnife silverIronKnife;
    public static ItemWhiteIronKnife whiteIronKnife;
    public static ItemYellowIronKnife yellowIronKnife;

    public static ItemBlackHandle blackHandle;
    public static ItemBlueHandle blueHandle;
    public static ItemBrownHandle brownHandle;
    public static ItemCyanHandle cyanHandle;
    public static ItemGrayHandle grayHandle;
    public static ItemGreenHandle greenHandle;
    public static ItemLightBlueHandle lightBlueHandle;
    public static ItemLimeHandle limeHandle;
    public static ItemMagentaHandle magentaHandle;
    public static ItemOrangeHandle orangeHandle;
    public static ItemPinkHandle pinkHandle;
    public static ItemPurpleHandle purpleHandle;
    public static ItemRedHandle redHandle;
    public static ItemSilverHandle silverHandle;
    public static ItemWhiteHandle whiteHandle;
    public static ItemYellowHandle yellowHandle;

    public static void init() {
        ironBlades = new ItemIronBlades();
        diamondBlade = new ItemDiamondBlade();
        goldBlade = new ItemGoldBlade();

        blackIronKnife = new ItemBlackIronKnife();
        blueIronKnife = new ItemBlueIronKnife();
        brownIronKnife = new ItemBrownIronKnife();
        cyanIronKnife = new ItemCyanIronKnife();
        grayIronKnife = new ItemGrayIronKnife();
        greenIronKnife = new ItemGreenIronKnife();
        lightBlueIronKnife = new ItemLightBlueIronKnife();
        limeIronKnife = new ItemLimeIronKnife();
        magentaIronKnife = new ItemMagentaIronKnife();
        orangeIronKnife = new ItemOrangeIronKnife();
        pinkIronKnife = new ItemPinkIronKnife();
        redIronKnife = new ItemRedIronKnife();
        silverIronKnife = new ItemSilverIronKnife();
        whiteIronKnife = new ItemWhiteIronKnife();
        yellowIronKnife = new ItemYellowIronKnife();


        blackHandle = new ItemBlackHandle();
        blueHandle = new ItemBlueHandle();
        brownHandle = new ItemBrownHandle();
        cyanHandle = new ItemCyanHandle();
        grayHandle = new ItemGrayHandle();
        greenHandle = new ItemGreenHandle();
        lightBlueHandle = new ItemLightBlueHandle();
        limeHandle = new ItemLimeHandle();
        magentaHandle = new ItemMagentaHandle();
        orangeHandle = new ItemOrangeHandle();
        pinkHandle = new ItemPinkHandle();
        purpleHandle = new ItemPurpleHandle();
        redHandle = new ItemRedHandle();
        silverHandle = new ItemSilverHandle();
        whiteHandle = new ItemWhiteHandle();
        yellowHandle = new ItemYellowHandle();

    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ironBlades.initModel();
        diamondBlade.initModel();
        goldBlade.initModel();
        blackIronKnife.initModel();
        blueIronKnife.initModel();
        brownIronKnife.initModel();
        cyanIronKnife.initModel();
        grayIronKnife.initModel();
        greenIronKnife.initModel();
        lightBlueIronKnife.initModel();
        limeIronKnife.initModel();
        magentaIronKnife.initModel();
        orangeIronKnife.initModel();
        pinkIronKnife.initModel();
        redIronKnife.initModel();
        silverIronKnife.initModel();
        whiteIronKnife.initModel();
        yellowIronKnife.initModel();


        blackHandle.initModel();
        blueHandle.initModel();
        brownHandle.initModel();
        cyanHandle.initModel();
        grayHandle.initModel();
        greenHandle.initModel();
        lightBlueHandle.initModel();
        limeHandle.initModel();
        magentaHandle.initModel();
        orangeHandle.initModel();
        pinkHandle.initModel();
        purpleHandle.initModel();
        redHandle.initModel();
        silverHandle.initModel();
        whiteHandle.initModel();
        yellowHandle.initModel();


    }
}
