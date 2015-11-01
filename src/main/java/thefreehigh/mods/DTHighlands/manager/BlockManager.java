package thefreehigh.mods.DTHighlands.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import thefreehigh.mods.DTHighlands.blocks.*;

public class BlockManager
{
	//Block List
	public static Block dragonGrass;
	public static Block dragonDirt;
	public static Block dragonStone;
	
	public static Block draconyLog;
	public static Block draconyLeaves;
	public static Block draconyPlanks;
	
	public static Block awakenedObsidianOre;
	public static Block awakenedObsidian;
	public static Block awakenedBurntObsidian;
		
		
	//Init Method
	public static void init()
	{
		dragonGrass = new DragonGrass();
		GameRegistry.registerBlock(dragonGrass, "dragonGrass");
		dragonDirt = new DragonDirt();
		GameRegistry.registerBlock(dragonDirt, "dragonDirt");
		dragonStone = new DragonStone();
		GameRegistry.registerBlock(dragonStone, "dragonStone");
		
		draconyLog = new DraconyLog();
		GameRegistry.registerBlock(draconyLog, "draconyLog");
		draconyLeaves = new DraconyLeaves();
		GameRegistry.registerBlock(draconyLeaves, "draconyLeaves");
		draconyPlanks = new DraconyPlanks();
		GameRegistry.registerBlock(draconyPlanks, "draconyPlanks");
		
		awakenedObsidianOre = new AwakenedObsidianOre();
		GameRegistry.registerBlock(awakenedObsidianOre, "awakenedObsidianOre");
		awakenedObsidian = new AwakenedObsidian();
		GameRegistry.registerBlock(awakenedObsidian, "awakenedObsidian");
		awakenedBurntObsidian = new AwakenedBurntObsidian();
		GameRegistry.registerBlock(awakenedBurntObsidian, "awakenedBurntObsidian");
	}
}