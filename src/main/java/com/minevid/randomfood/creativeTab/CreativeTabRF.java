package com.minevid.randomfood.creativeTab;

import com.minevid.randomfood.blocks.ModBlocks;
import com.minevid.randomfood.items.ModItems;
import com.minevid.randomfood.references.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Reynout on 7/03/2017.
 */
public class CreativeTabRF {
    public static final CreativeTabs RF_TAB = new CreativeTabs(References.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.molybdenumOre);
        }
        @Override
        public String getTranslatedTabLabel(){
            return "Random Food";
        }

    };

    public static final CreativeTabs RF_TAB_KNIFE = new CreativeTabs(References.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.blackDiamondKnife;
        }
        @Override
        public String getTranslatedTabLabel(){
            return "Knifes";
        }
    };
}
