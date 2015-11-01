package thefreehigh.mods.BlocksNItems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class VoidBlock extends Block {

	public VoidBlock()
	{
		super(Material.cloth);
		setBlockTextureName(Lib.MODID + ":" + "VoidBlock");
		setBlockName("VoidBlock");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}
