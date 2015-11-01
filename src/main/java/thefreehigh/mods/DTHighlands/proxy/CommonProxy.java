package thefreehigh.mods.DTHighlands.proxy;

import thefreehigh.mods.DTHighlands.manager.*;

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

