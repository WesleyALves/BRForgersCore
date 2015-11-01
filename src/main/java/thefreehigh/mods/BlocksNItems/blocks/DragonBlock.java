package thefreehigh.mods.BlocksNItems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class DragonBlock extends Block {

	public DragonBlock() {
		super(Material.iron);
		setBlockTextureName(Lib.MODID + ":" + "DragonBlock");
		setBlockName("DragonBlock");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}