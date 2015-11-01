package thefreehigh.mods.BlocksNItems.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import thefreehigh.mods.BlocksNItems.blocks.*;

public class BlockManager
{
	//Block List
	public static Block dragonBlock;
	public static Block ornateOrangeBlock;
	public static Block voidBlock;
	public static Block tfhBlock;
	public static Block fakeRedstoneBlock;
	
	//Init Method
	public static void init()
	{
		dragonBlock = new DragonBlock();
		GameRegistry.registerBlock(dragonBlock, "dragonBlock");
		
		ornateOrangeBlock = new OrnateOrangeBlock();
		GameRegistry.registerBlock(ornateOrangeBlock, "ornateOrangeBlock");
		
		tfhBlock = new TFHBlock();
		GameRegistry.registerBlock(tfhBlock, "TFHBlock");
		
		fakeRedstoneBlock = new FakeRedstoneBlock();
		GameRegistry.registerBlock(fakeRedstoneBlock, "fakeRedstoneBlock");
	}
}
