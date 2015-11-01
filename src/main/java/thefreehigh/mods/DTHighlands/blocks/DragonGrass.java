package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class DragonGrass extends Block {

	public DragonGrass() {
		super(Material.ground);
		setBlockTextureName(Lib.MODID + ":" + "DragonGrass");
		setBlockName("DragonGrass");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
