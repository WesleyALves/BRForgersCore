package thefreehigh.mods.BlocksNItems.items;

import net.minecraft.item.Item;
import thefreehigh.mods.BlocksNItems.BlocksNItems;
import thefreehigh.mods.BlocksNItems.Lib;

public class TFHPlate extends Item
{
	public TFHPlate()
	{
		setUnlocalizedName("TFHPlate");
		setTextureName(Lib.MODID + ":" + "TFHPlate");
		setCreativeTab(BlocksNItems.tabTFH);
	}
}
