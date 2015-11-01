package thefreehigh.mods.DragonTech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thefreehigh.mods.DragonTech.DragonTech;

public class LivingObsidian extends Block {

	public LivingObsidian() {
		super(Material.rock);
		setBlockTextureName("dragon_egg" /*Strings.MODID + ":" + "DragonBlock"*/);
		setBlockName("LivingObsidian");
		setCreativeTab(DragonTech.tabDragonTech);
	}
}
