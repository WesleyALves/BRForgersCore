/**
 * CapesLib by TheFreeHigh
 * a Rewrite of Jadar's DeveloperCapes
 * License: MIT License
 * (https://raw.github.com/jadar/CapesLib/master/LICENSE)
 * version 3.3.0.0
 */
package thefreehigh.lib.CapesLib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonSyntaxException;

import net.minecraftforge.common.MinecraftForge;
import thefreehigh.lib.CapesLib.cape.CapeConfig;
import thefreehigh.lib.CapesLib.cape.CapeConfigManager;

/**
 * Exception-Handled for CapesLib
 * @author TheFreeHigh
 */
public class HandledCapesLib {
    
	public static final Logger logger = LogManager.getLogger("Exception-Handled CapesLib");
	
    public int loadCapes(String jsonString)
    {
    	try {
        	return CapesLib.getInstance().loadCapes(jsonString);
		} catch (JsonSyntaxException e) {
			logger.error("Error Loading Capes: ",e);
		}
    	return -1;
    }
    
    public int loadCapes(InputStream stream)
    {
    	try {
			return CapesLib.getInstance().loadCapes(stream);
		} catch (JsonSyntaxException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (NullPointerException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (IOException e) {
			logger.error("Error Loading Capes: ",e);
		}
    	return -1;
    }
    
    public int loadCapes(URL url)
    {
    	try {
			return CapesLib.getInstance().loadCapes(url);
		} catch (JsonSyntaxException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (NullPointerException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (IOException e) {
			logger.error("Error Loading Capes: ",e);
		}
    	return -1;
    }
    
    public int loadCapes(File jsonFile)
    {
    	try {
			return CapesLib.getInstance().loadCapes(jsonFile);
		} catch (JsonSyntaxException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (NullPointerException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (FileNotFoundException e) {
			logger.error("Error Loading Capes: ",e);
		} catch (IOException e) {
			logger.error("Error Loading Capes: ",e);
		}
    	return -1;
    }
}
