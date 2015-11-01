package thefreehigh.mods.DragonTech.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import thefreehigh.mods.DragonTech.blocks.LivingObsidian;

public class BlockManager
{
	//Block List

	public static Block livingObsidian;
	
	
	//Init Method
	public static void init()
	{
		livingObsidian = new LivingObsidian();
		GameRegistry.registerBlock(livingObsidian, "livingObsidian");
	}
}
