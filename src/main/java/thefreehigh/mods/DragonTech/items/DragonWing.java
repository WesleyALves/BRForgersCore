package thefreehigh.mods.DragonTech.items;

import net.minecraft.item.Item;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class DragonWing extends Item {
	public DragonWing()
	{
		setUnlocalizedName("DragonWing");
		setTextureName(Lib.MODID + ":" + "DragonWing");
		setCreativeTab(DragonTech.tabDragonTech);
	}
}
