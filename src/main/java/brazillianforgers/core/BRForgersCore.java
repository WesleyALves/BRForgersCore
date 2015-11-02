package brazillianforgers.core;

import java.util.Random;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import brazillianforgers.lib.ObjectStorage;

/**
 * BRForgersCore: Where a Lot of ~magic~ Definitions happen! 
 * @author brazillianforgers
 */
@Mod(modid = CoreLib.MODID , version = CoreLib.VERSION , name = CoreLib.MODNAME)
public class BRForgersCore
{
	@Instance(CoreLib.MODID)
	public static BRForgersCore instance;
	
	static Logger logger;
	static Configuration config;
	private static ObjectStorage configLib = new ObjectStorage();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		/* Get Logger */
		logger = e.getModLog();
		
		/* Startup Log */
		logger.info("Start Loading...");
		
		/* Get Configs */
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		config.load();
		
		/* Start Modules */
		logger.debug("Loading PreInitialization Modules..");
		
		/* Init BrazillianForgersLib */
		logger.info("Starting BrazillianForgersLib..");
		
		BRForgersLib lib = BRForgersHelper.getLib();
		
		lib.booleans.put("isClient",(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT));
		String u = (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) ? Minecraft.getMinecraft().getSession().getUsername() : "Server";
		lib.strings.put("username", u);
		
		logger.info("BrazillianForgersLib Loaded.");
		
		/* Ending PreInit */
		logger.debug("All PreInit Modules Loaded!");
		logger.info("Thanks '"+ lib.strings.get("username") +"' for playing with BrazillianForgers Mods!");
		lib.booleans.put("init", true);
		BRForgersHelper.varInitDone = true;
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e)
	{
		logger.debug("Loading Initialization Modules..");
		
		logger.debug("All Init Modules Loaded!");
	}
		
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e)
	{}
}
