package thefreehigh.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "TFHCapeWrapper", name = "\"Capes from TFH\" Wrapper", version = "1.1")
public class TFHCapeWrapper
{
	static boolean TFHCoreLoaded = false;
	
	static Logger logger;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		TFHCoreLoaded = Loader.isModLoaded("TFHCore");
		if (TFHCoreLoaded)
		{
			logger.error("Detected TFHCORE in Minecraft!!");
			logger.error("TFHCapes Wrapper disabled!!!");
			logger.error("Please Delete the \"" + e.getSourceFile() + "\" file at your \"mods\" folder.");
		}
	}
	

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
    	if (TFHCoreLoaded)
    	{
    		
    		return;
    	}
    	
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
        	logger.info("Detected we're in Clientside. Start Loading...");
        	logger.info("'Capes from TFH' Loading Below:");
        	if(TFHCapes.loadCapes("TFHCapeWrapper"))
        	{
        		logger.info("'Capes from TFH' successfully loaded!");
        	}
        	else
        	{
        		logger.error("'Capes from TFH' not successfully loaded.");
        	}
        }
        else
    	{
        	logger.info("Detected we're in Serverside.");
    		logger.error("'Capes from TFH' not loaded as we're a Clientside mod in a Server.");
    	}
    }
}