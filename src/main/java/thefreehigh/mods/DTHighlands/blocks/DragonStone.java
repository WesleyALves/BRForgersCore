package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class DragonStone extends Block {

	public DragonStone() {
		super(Material.rock);
		setBlockTextureName(Lib.MODID + ":" + "DragonStone");
		setBlockName("DragonStone");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
