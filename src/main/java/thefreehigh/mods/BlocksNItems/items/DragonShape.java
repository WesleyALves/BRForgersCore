package thefreehigh.mods.BlocksNItems.items;

import net.minecraft.item.Item;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class DragonShape extends Item
{
	public DragonShape()
	{
		setUnlocalizedName("DragonShape");
		setTextureName(Lib.MODID + ":" + "DragonShape");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}
