package com.minevid.randomfood.recipes;

import com.minevid.randomfood.items.ModItems;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Reynout on 7/03/2017.
 */
public class ModCrafting {

    public static void initCrafting() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironBlades), " A ", "A  ", 'A', new ItemStack(Items.IRON_INGOT));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.goldBlade), " A ", "A  ", 'A', new ItemStack(Items.GOLD_INGOT));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondBlade), " A ", "A  ", 'A', new ItemStack(Items.DIAMOND));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blackHandle), "  A", " B ", "A  ", 'A', new ItemStack(Items.STICK), 'B', new ItemStack(Items.DYE));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blackIronKnife), " A ", "B  ", 'A', new ItemStack(ModItems.ironBlades), 'B', new ItemStack(ModItems.blackHandle));


    }
}
