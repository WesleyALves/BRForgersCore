package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class AwakenedObsidianOre extends Block {

	public AwakenedObsidianOre() {
		super(Material.rock);
		setBlockTextureName(Lib.MODID + ":" + "AwakenedObsidianOre");
		setBlockName("AwakenedObsidianOre");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
