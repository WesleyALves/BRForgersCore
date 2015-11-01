package thefreehigh.mods.DTHighlands.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import thefreehigh.mods.DTHighlands.items.*;

public class ItemManager
{
	//Item List
	public static Item nightnyEgg;
	public static Item dragonStaff;
	public static Item dragonlandsStaff; //Staff that Teleports Overworld/DragonLands
	public static Item poweredGlowstoneDust;
	public static Item overPoweredGlowstoneDust;
	public static Item awakenedObsidianDust;
	public static Item blazingGlowstoneDust;
	public static Item blazingObsidianDust; //Portal Igniter
	
	//Init Method
	public static void init()
	{
		nightnyEgg = new NightnyEgg();
		GameRegistry.registerItem(nightnyEgg, "nightnyEgg");
		
		dragonStaff = new DragonStaff();
		GameRegistry.registerItem(dragonStaff, "dragonStaff");
		
		dragonlandsStaff = new DragonLandsStaff();
		GameRegistry.registerItem(dragonlandsStaff, "dragonlandsStaff");
		
		poweredGlowstoneDust = new PoweredGlowstoneDust();
		GameRegistry.registerItem(poweredGlowstoneDust, "poweredGlowstoneDust");
		
		overPoweredGlowstoneDust = new OverPoweredGlowstoneDust();
		GameRegistry.registerItem(overPoweredGlowstoneDust, "overPoweredGlowstoneDust");
		
		awakenedObsidianDust = new AwakenedObsidianDust();
		GameRegistry.registerItem(awakenedObsidianDust, "awakenedObsidianDust");
		
		blazingGlowstoneDust = new BlazingGlowstoneDust();
		GameRegistry.registerItem(blazingGlowstoneDust, "blazingGlowstoneDust");
		
		blazingObsidianDust = new BlazingObsidianDust();
		GameRegistry.registerItem(blazingObsidianDust, "blazingObsidianDust");
		
	}
}
