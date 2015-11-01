package thefreehigh.mods.DragonTech.items;

import net.minecraft.item.Item;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class Soulbinder extends Item {
	public Soulbinder()
	{
		setUnlocalizedName("Soulbinder");
		setTextureName(Lib.MODID + ":" + "Soulbinder");
		setCreativeTab(DragonTech.tabDragonTech);
	}
}
