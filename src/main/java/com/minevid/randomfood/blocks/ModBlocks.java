package com.minevid.randomfood.blocks;

/**
 * Created by Reynout on 9/03/2017.
 */
public class ModBlocks
{

    public static BlockMolybdenumOre molybdenumOre;
    public static BlockVanadiumOre vanadiumOre;
    public static BlockChroniumOre chroniumOre;
    public static BlockNickelOre nickelOre;

    public static void init()
    {
        molybdenumOre = new BlockMolybdenumOre();
        vanadiumOre = new BlockVanadiumOre();
        chroniumOre = new BlockChroniumOre();
        nickelOre = new BlockNickelOre();
    }

    public static void initModels()
    {
        molybdenumOre.initModel();
        vanadiumOre.initModel();
        chroniumOre.initModel();
        nickelOre.initModel();
    }

}
