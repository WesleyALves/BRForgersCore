package thefreehigh.mods.BlocksNItems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class OrnateOrangeBlock extends Block {

	public OrnateOrangeBlock()
	{
		super(Material.cloth);
		setBlockTextureName(Lib.MODID + ":" + "OrnateOrangeBlock");
		setBlockName("OrnateOrangeBlock");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}
