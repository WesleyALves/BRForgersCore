package thefreehigh.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import cpw.mods.fml.common.Mod;
import thefreehigh.lib.StringHelper;
import thefreehigh.lib.CapesLib.CapesLib;
/**
 * "TFHCapes" Module of TFHCore
 * @author TheFreeHigh
 */
public class TFHCapes {
	static boolean loaded = false;
	static final Logger logger = LogManager.getLogger("Capes from TFH");
	static String loaderMod;

	/**
	 * Load the TFHCapes from TFH Capes Server and add to your game
	 */
	public static boolean loadCapes(String modid)
	{
		if (!loaded) {
			logger.info("Start loading 'Capes from TFH' via '"+modid+"'..");

        	//Error vars
			final String[] stages = {"Check Connection","Get Server Link","Loading"};
        	int stage = 0;
        	
        	//All in a Try Statement
        	try {
        		//Stage 1: Check Connection
        		logger.info("[1]> Checking for Connection at Server... ");
        		stage = 1;
    	       	URLConnection pointer = new URL("http://tfh.16mb.com/capes.pointer").openConnection();
    	       	pointer.setRequestProperty("User-Agent", System.getProperty("java.version"));
    	       	pointer.connect();
    	       	logger.info("Success!");
    	       	
    	       	
    	       	//Stage 2: Get Pointer Link
    	       	logger.info("[2]> Getting Cape Server from Pointer... ");
    	       	stage = 2;
    	       	URL capeServerLink =  new URL(StringHelper.getStringFromStream(pointer.getInputStream()));
    	       	logger.info("Success!");
    	       	
    	       	//Stage 3: The Loading
    	       	logger.info("[3]> Loading Capes...");
    	       	CapesLib.getInstance().loadCapes(capeServerLink);
				logger.info("Success!");
				loaded = true;
				loaderMod = modid;
				logger.info("Capes from TFH Loaded!");
        		return true;
    	       	
        	}
        	catch(Exception e)
        	{
        		String a = stage == 3 ? "Loading" : "Pre-Loading";
        		logger.fatal("Can't Load Capes due to an error at " + a +".");
        		logger.info(" (Send the error below to the Modder)");
        		logger.error(e.toString());
        		logger.error("(Error at '" + stages[stage] + "' Stage ["+ String.valueOf(stage) +"])");
        		logger.fatal("Capes from TFH not Loaded.");
			}
        	return false;
        } else {
        	logger.info("Mod '"+modid+"' tried to load 'Capes from TFH', but this has already been loaded by Mod '"+loaderMod+"'..");
		}
		return true;
	}
	
	public static boolean isLoaded()
	{
		return loaded;
	}
}
