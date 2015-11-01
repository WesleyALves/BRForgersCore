package thefreehigh.mods.BlocksNItems.proxy;

import thefreehigh.mods.BlocksNItems.manager.BlockManager;
import thefreehigh.mods.BlocksNItems.manager.EventHandler;
import thefreehigh.mods.BlocksNItems.manager.ItemManager;
import thefreehigh.mods.BlocksNItems.manager.RecipeHandler;

public class CommonProxy
{
	public static void PreInitCommon()
	{
		BlockManager.init();
		ItemManager.init();
	}
	
	public static void InitCommon()
	{
		RecipeHandler.init();
		EventHandler.init();
	}
	
	public static void PostInitCommon()
	{
		
	}
}
