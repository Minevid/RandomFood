package com.minevid.randomfood.items;

import com.minevid.randomfood.items.blades.ItemDiamondBlade;
import com.minevid.randomfood.items.blades.ItemGoldBlade;
import com.minevid.randomfood.items.blades.ItemIronBlade;
import com.minevid.randomfood.items.handles.*;
import com.minevid.randomfood.items.knifes.DiamondKnifes.*;
import com.minevid.randomfood.items.knifes.GoldKnifes.*;
import com.minevid.randomfood.items.knifes.IronKnifes.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ModItems {

    //Make Private instances
    public static ItemIronBlade ironBlade;
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
    public static ItemPurpleIronKnife purpleIronKnife;
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


    public static ItemBlackGoldKnife blackGoldKnife;
    public static ItemBlueGoldKnife blueGoldKnife;
    public static ItemBrownGoldKnife brownGoldKnife;
    public static ItemCyanGoldKnife cyanGoldKnife;
    public static ItemGrayGoldKnife grayGoldKnife;
    public static ItemGreenGoldKnife greenGoldKnife;
    public static ItemLightBlueGoldKnife lightBlueGoldKnife;
    public static ItemLimeGoldKnife limeGoldKnife;
    public static ItemMagentaGoldKnife magentaGoldKnife;
    public static ItemOrangeGoldKnife orangeGoldKnife;
    public static ItemPinkGoldKnife pinkGoldKnife;
    public static ItemPurpleGoldKnife purpleGoldKnife;
    public static ItemRedGoldKnife redGoldKnife;
    public static ItemSilverGoldKnife silverGoldKnife;
    public static ItemWhiteGoldKnife whiteGoldKnife;
    public static ItemYellowGoldKnife yellowGoldKnife;

    public static ItemBlackDiamondKnife blackDiamondKnife;
    public static ItemBlueDiamondKnife blueDiamondKnife;
    public static ItemBrownDiamondKnife brownDiamondKnife;
    public static ItemCyanDiamondKnife cyanDiamondKnife;
    public static ItemGrayDiamondKnife grayDiamondKnife;
    public static ItemGreenDiamondKnife greenDiamondKnife;
    public static ItemLightBlueDiamondKnife lightBlueDiamondKnife;
    public static ItemLimeDiamondKnife limeDiamondKnife;
    public static ItemMagentaDiamondKnife magentaDiamondKnife;
    public static ItemOrangeDiamondKnife orangeDiamondKnife;
    public static ItemPinkDiamondKnife pinkDiamondKnife;
    public static ItemPurpleDiamondKnife purpleDiamondKnife;
    public static ItemRedDiamondKnife redDiamondKnife;
    public static ItemSilverDiamondKnife silverDiamondKnife;
    public static ItemWhiteDiamondKnife whiteDiamondKnife;
    public static ItemYellowDiamondKnife yellowDiamondKnife;


    public static void init() {
        ironBlade = new ItemIronBlade();
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
        purpleIronKnife = new ItemPurpleIronKnife();
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


        blackGoldKnife = new ItemBlackGoldKnife();
        blueGoldKnife = new ItemBlueGoldKnife();
        brownGoldKnife = new ItemBrownGoldKnife();
        cyanGoldKnife = new ItemCyanGoldKnife();
        grayGoldKnife = new ItemGrayGoldKnife();
        greenGoldKnife = new ItemGreenGoldKnife();
        lightBlueGoldKnife = new ItemLightBlueGoldKnife();
        limeGoldKnife = new ItemLimeGoldKnife();
        magentaGoldKnife = new ItemMagentaGoldKnife();
        orangeGoldKnife = new ItemOrangeGoldKnife();
        pinkGoldKnife = new ItemPinkGoldKnife();
        purpleGoldKnife = new ItemPurpleGoldKnife();
        redGoldKnife = new ItemRedGoldKnife();
        silverGoldKnife = new ItemSilverGoldKnife();
        whiteGoldKnife = new ItemWhiteGoldKnife();
        yellowGoldKnife = new ItemYellowGoldKnife();


        blackDiamondKnife = new ItemBlackDiamondKnife();
        blueDiamondKnife = new ItemBlueDiamondKnife();
        brownDiamondKnife = new ItemBrownDiamondKnife();
        cyanDiamondKnife = new ItemCyanDiamondKnife();
        grayDiamondKnife = new ItemGrayDiamondKnife();
        greenDiamondKnife = new ItemGreenDiamondKnife();
        lightBlueDiamondKnife = new ItemLightBlueDiamondKnife();
        limeDiamondKnife = new ItemLimeDiamondKnife();
        magentaDiamondKnife = new ItemMagentaDiamondKnife();
        orangeDiamondKnife = new ItemOrangeDiamondKnife();
        pinkDiamondKnife = new ItemPinkDiamondKnife();
        purpleDiamondKnife = new ItemPurpleDiamondKnife();
        redDiamondKnife = new ItemRedDiamondKnife();
        silverDiamondKnife = new ItemSilverDiamondKnife();
        whiteDiamondKnife = new ItemWhiteDiamondKnife();
        yellowDiamondKnife = new ItemYellowDiamondKnife();


    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ironBlade.initModel();
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
        purpleIronKnife.initModel();
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

        blackGoldKnife.initModel();
        blueGoldKnife.initModel();
        brownGoldKnife.initModel();
        cyanGoldKnife.initModel();
        grayGoldKnife.initModel();
        greenGoldKnife.initModel();
        lightBlueGoldKnife.initModel();
        limeGoldKnife.initModel();
        magentaGoldKnife.initModel();
        orangeGoldKnife.initModel();
        pinkGoldKnife.initModel();
        purpleGoldKnife.initModel();
        redGoldKnife.initModel();
        silverGoldKnife.initModel();
        whiteGoldKnife.initModel();
        yellowGoldKnife.initModel();


        blackDiamondKnife.initModel();
        blueDiamondKnife.initModel();
        brownDiamondKnife.initModel();
        cyanDiamondKnife.initModel();
        grayDiamondKnife.initModel();
        greenDiamondKnife.initModel();
        lightBlueDiamondKnife.initModel();
        limeDiamondKnife.initModel();
        magentaDiamondKnife.initModel();
        orangeDiamondKnife.initModel();
        pinkDiamondKnife.initModel();
        purpleDiamondKnife.initModel();
        redDiamondKnife.initModel();
        silverDiamondKnife.initModel();
        whiteDiamondKnife.initModel();
        yellowDiamondKnife.initModel();

    }
}
