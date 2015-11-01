package thefreehigh.mods.DragonTech.items;

import net.minecraft.item.Item;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class DragonStar extends Item
{
	public DragonStar()
	{
		setUnlocalizedName("DragonStar");
		setTextureName(Lib.MODID + ":" + "DragonStar");
		setCreativeTab(DragonTech.tabDragonTech);
	}
}
