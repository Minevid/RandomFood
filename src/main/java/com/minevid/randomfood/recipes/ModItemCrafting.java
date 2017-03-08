package com.minevid.randomfood.recipes;

import com.minevid.randomfood.items.ModItems;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ModItemCrafting {

    public static void initCrafting() {
        //Blades
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironBlade), " A ", " A ", 'A', new ItemStack(Items.IRON_INGOT));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.goldBlade), " A ", " A ", 'A', new ItemStack(Items.GOLD_INGOT));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondBlade), " A ", " A ", 'A', new ItemStack(Items.DIAMOND));

        //Handles
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blackHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blueHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 4));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.brownHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 3));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cyanHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 6));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.grayHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 8));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.greenHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 2));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.lightBlueHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 12));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.limeHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 10));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.magentaHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 13));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.orangeHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 14));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pinkHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 9));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purpleHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 5));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.redHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 1));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.silverHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 7));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.whiteHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 15));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.yellowHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE, 1, 11));

        //IronKnifes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blackIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.blackHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blueIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.blueHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.brownIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.brownHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cyanIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.cyanHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.grayIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.grayHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.greenIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.greenHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.lightBlueIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.lightBlueHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.limeIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.limeHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.magentaIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.magentaHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.orangeIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.orangeHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pinkIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.pinkHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purpleIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.purpleHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.redIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.redHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.silverIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.silverHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.whiteIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.whiteHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.yellowIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlade), 'B', new ItemStack(ModItems.yellowHandle));

        //GoldKnifes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blackGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.blackHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blueGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.blueHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.brownGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.brownHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cyanGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.cyanHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.grayGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.grayHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.greenGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.greenHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.lightBlueGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.lightBlueHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.limeGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.limeHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.magentaGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.magentaHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.orangeGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.orangeHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pinkGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.pinkHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purpleGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.purpleHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.redGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.redHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.silverGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.silverHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.whiteGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.whiteHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.yellowGoldKnife), " A ", "B  ", 'A', new ItemStack(ModItems.goldBlade), 'B', new ItemStack(ModItems.yellowHandle));

        //Diamond Knifes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blackDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.blackHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blueDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.blueHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.brownDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.brownHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cyanDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.cyanHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.grayDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.grayHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.greenDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.greenHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.lightBlueDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.lightBlueHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.limeDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.limeHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.magentaDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.magentaHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.orangeDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.orangeHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pinkDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.pinkHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purpleDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.purpleHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.redDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.redHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.silverDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.silverHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.whiteDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.whiteHandle));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.yellowDiamondKnife), " A ", "B  ", 'A', new ItemStack(ModItems.diamondBlade), 'B', new ItemStack(ModItems.yellowHandle));
    }
}
