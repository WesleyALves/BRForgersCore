package thefreehigh.mods.BlocksNItems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class TFHBlock extends Block {

	public TFHBlock() {
		super(Material.iron);
		setBlockTextureName(Lib.MODID + ":" + "TFHBlock");
		setBlockName("TFHBlock");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}