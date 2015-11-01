package thefreehigh.mods.DTHighlands.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class DraconyPlanks extends Block {

	public DraconyPlanks() {
		super(Material.wood);
		setBlockTextureName(Lib.MODID + ":" + "DraconyPlanks");
		setBlockName("DraconyPlanks");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}

}
