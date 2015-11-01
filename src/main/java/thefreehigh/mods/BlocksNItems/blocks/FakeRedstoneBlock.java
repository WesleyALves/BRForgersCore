package thefreehigh.mods.BlocksNItems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class FakeRedstoneBlock extends Block {

	public FakeRedstoneBlock() {
		super(Material.rock);
		setBlockTextureName("redstone_block");
		setBlockName("FakeRedstoneBlock");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}
