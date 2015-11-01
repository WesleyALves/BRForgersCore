package thefreehigh.mods.BlocksNItems.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import thefreehigh.mods.BlocksNItems.items.*;

public class ItemManager
{
	//Item List
	public static Item dragonShape;
	public static Item tfhPlate;
	public static Item tfhBadge;
	
	//Init Method
	public static void init()
	{
		dragonShape = new DragonShape();
		GameRegistry.registerItem(dragonShape, "dragonShape");
		
		tfhPlate = new TFHPlate();
		GameRegistry.registerItem(tfhPlate, "TFHPlate");
		
		tfhBadge = new TFHBadge();
		GameRegistry.registerItem(tfhBadge, "TFHBadge");
	}
}
