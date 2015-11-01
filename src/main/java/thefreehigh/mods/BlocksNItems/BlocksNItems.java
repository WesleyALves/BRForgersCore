package thefreehigh.mods.BlocksNItems;

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
import thefreehigh.mods.BlocksNItems.manager.ItemManager;
import thefreehigh.mods.BlocksNItems.proxy.CommonProxy;

@Mod(modid = Lib.MODID , version = Lib.VERSION , name = Lib.MODNAME, dependencies = Lib.DEPS)
public class BlocksNItems
{
	@Instance(Lib.MODID)
	public static BlocksNItems instance;
	
	@SidedProxy(clientSide = Lib.CLIENT, serverSide = Lib.COMMONPROXY)
	public static CommonProxy proxy;	
	
	public static CreativeTabs tabTFH = new CreativeTabs("tabTFH") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return ItemManager.tfhPlate;
	    }
	};
	
	static Logger logger;
	static Configuration config;
	private static ObjectStorage configLib = new ObjectStorage();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		logger.info(Lib.INITLOG);
		config = new Configuration(e.getSuggestedConfigurationFile());
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