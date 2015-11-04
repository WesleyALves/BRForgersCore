package testing;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "Testing" , version = "1.0" , name = "Testing Mod")
public class TestMod {
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		RecipeHandler.addToRecipes(new CraftingObject());
	}
}
