package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class AwakenedObsidian extends Block {

	public AwakenedObsidian() {
		super(Material.rock);
		setBlockTextureName(Lib.MODID + ":" + "AwakenedObsidian");
		setBlockName("AwakenedObsidian");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
