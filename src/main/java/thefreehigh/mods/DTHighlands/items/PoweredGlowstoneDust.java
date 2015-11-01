package thefreehigh.mods.DTHighlands.items;

import net.minecraft.item.Item;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class PoweredGlowstoneDust extends Item {
	public PoweredGlowstoneDust()
	{
		setUnlocalizedName("PoweredGlowstoneDust");
		setTextureName(Lib.MODID + ":" + "PoweredGlowstoneDust");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}
}
