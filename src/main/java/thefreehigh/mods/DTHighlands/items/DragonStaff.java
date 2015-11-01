package thefreehigh.mods.DTHighlands.items;

import net.minecraft.item.Item;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class DragonStaff extends Item {
	public DragonStaff()
	{
		setUnlocalizedName("DragonStaff");
		setTextureName(Lib.MODID + ":" + "DragonStaff");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}
}
