package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class DragonDirt extends Block {

	public DragonDirt() {
		super(Material.ground);
		setBlockTextureName(Lib.MODID + ":" + "DragonDirt");
		setBlockName("DragonDirt");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
