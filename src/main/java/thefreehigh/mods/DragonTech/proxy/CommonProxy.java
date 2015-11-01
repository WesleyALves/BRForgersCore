package thefreehigh.mods.DragonTech.proxy;

import thefreehigh.mods.DragonTech.manager.*;

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
	}
	
	public static void PostInitCommon()
	{
		
	}
}
