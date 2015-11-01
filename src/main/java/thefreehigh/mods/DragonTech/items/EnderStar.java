package thefreehigh.mods.DragonTech.items;

import net.minecraft.item.Item;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class EnderStar extends Item
{
	public EnderStar()
	{
		setUnlocalizedName("EnderStar");
		setTextureName(Lib.MODID + ":" + "EnderStar");
		setCreativeTab(DragonTech.tabDragonTech);
	}
}
