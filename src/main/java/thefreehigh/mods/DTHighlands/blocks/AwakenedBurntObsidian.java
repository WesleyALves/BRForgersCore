package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class AwakenedBurntObsidian extends Block {

	public AwakenedBurntObsidian() {
		super(Material.rock);
		setBlockTextureName(Lib.MODID + ":" + "AwakenedBurntObsidian");
		setBlockName("AwakenedBurntObsidian");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
