package thefreehigh.mods.DragonTech;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import thefreehigh.core.TFHCore;
import thefreehigh.lib.ObjectStorage;
import thefreehigh.mods.DragonTech.manager.*;
import thefreehigh.mods.DragonTech.proxy.*;

@Mod(modid = Lib.MODID , version = Lib.VERSION , name = Lib.MODNAME, dependencies = Lib.DEPS)
public class DragonTech
{
	@Instance(Lib.MODID)
	public static DragonTech instance;
	
	@SidedProxy(clientSide = Lib.CLIENT, serverSide = Lib.COMMONPROXY)
	public static CommonProxy proxy;	
	
	
	public static CreativeTabs tabDragonTech = new CreativeTabs("tabDragonTech") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return ItemManager.dragonEgg;
	    }
	};
	
	static Logger logger;
	static Configuration config;
	public static ObjectStorage configLib = new ObjectStorage();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		logger.info(Lib.INITLOG);
		config = new Configuration(e.getSuggestedConfigurationFile());
config.load();
		
		/* Get Configurations */
		configLib.booleans.put("MAIN_adventureMode", 
			config.get("MAIN", "adventureMode", false, "[OVERRIDE] Enable the 'Adventure Mode' of the Mod (Add Dundeon Loot and Remove a Lot of Craftings)")
			.getBoolean()
		);
		configLib.booleans.put("MAIN_disableCrafting",
			config.get("MAIN", "disableCrafting", false, "[OVERRIDE] Enable to Disable all Craftings (Exploration or Custom Maps)")
			.getBoolean()
		);
		
		configLib.integers.put("CRAFTING_main",
			config.get("CRAFTING", "main", 0, "Difficulty of MAIN Craftings (-1 = DISABLE, 0 = ALL, 1 = EASY, 2 = NORMAL, 3 = HARD, 4 = ADVENTURE)", -1, 4)
			.getInt()
		);
		
		configLib.integers.put("CRAFTING_cloning",
			config.get("CRAFTING", "cloning", 0, "Difficulty of EGG-CLONING Craftings (-1 = DISABLE, 0 = ALL, 1 = EASY, 2 = NORMAL, 3 = HARD, 4 = ADVENTURE)", -1, 4)
			.getInt()
		);
		
		configLib.integers.put("CRAFTING_materials",
			config.get("CRAFTING", "materials", 0, "Difficulty of MATERIAL Craftings (-1 = DISABLE, 0 = ALL, 1 = EASY, 2 = NORMAL, 3 = HARD, 4 = ADVENTURE)", -1, 4)
			.getInt()
		);
		
		configLib.integers.put("CRAFTING_armor",
			config.get("CRAFTING", "armor", 0, "Difficulty of ARMOR Craftings (-1 = DISABLE, 0 = ALL, 1 = EASY, 2 = NORMAL, 3 = HARD, 4 = ADVENTURE)", -1, 4)
			.getInt()
		);
		
		configLib.integers.put("CRAFTING_util",
			config.get("CRAFTING", "util", 0, "Difficulty of UTILITY Craftings (-1 = DISABLE, 0 = ALL, 1 = EASY, 2 = NORMAL, 3 = HARD, 4 = ADVENTURE)", -1, 4)
			.getInt()
		);
		
		
		
		configLib.booleans.put("WORLD_DungeonLoot", 
			config.get("WORLD", "DungeonLoot", true, "Enable Mod Loot on Dungeons")
			.getBoolean()
		);
		
		configLib.booleans.put("COMPAT_VanillaToDragonEgg", 
			config.get("COMPAT","VanillaToDragonEgg", false, "Conversion bettewen Vanilla and the Mod Dragon Eggs")
			.getBoolean()
		);
		
		configLib.booleans.put("COMPAT_VanillaEggLoot", 
			config.get("COMPAT","VanillaEggLoot", false, "Switch between the Mod and the Vanilla Mod Loot")
			.getBoolean()
		);
		
		
		/* Save Configs */
		config.save();
		
		Blocks.dragon_egg.setCreativeTab(CreativeTabs.tabMisc);
		proxy.PreInitCommon();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent e)
	{
		proxy.InitCommon();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e)
	{
		proxy.PostInitCommon();
	}
}
