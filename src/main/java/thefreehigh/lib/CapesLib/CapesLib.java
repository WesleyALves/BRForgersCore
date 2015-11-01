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
import thefreehigh.lib.*;
import thefreehigh.lib.CapesLib.cape.*;
import thefreehigh.lib.CapesLib.user.*;

/**
 *  'CapesLib', a TheFreeHigh rewrite of 'DeveloperCapes' by jadar
 * @author TheFreeHigh
 */
public class CapesLib
{
	/**
	 * 'CapesLib' instance
	 */
	private static CapesLib instance;
	
	/**
	 * 'CapesLib' Logger
	 */
    public static final Logger logger = LogManager.getLogger("CapesLib");
    
    /**
     * 'CapesLib' declaration
     */
    protected CapesLib() {MinecraftForge.EVENT_BUS.register(new RenderEventHandler());}

    /**
     * Get the CapesLib instance, or create a new one
     * @return the 'CapesLib' Instance
     */
    public static CapesLib getInstance() {
        if (instance == null) {instance = new CapesLib();}
        return instance;
    }
    
    /**
     * Load Capes using a JSON String
     * @param JsonString JSON String
     * @return the CapeConfigManager ID of the Capes loaded from this
     * @throws JsonSyntaxException JSON String malformed.
     */
    public int loadCapes(String JsonString) throws JsonSyntaxException
    {
    	int id = -1;
        
    	CapeConfig config = CapeConfigManager.getInstance().parse(JsonString);

        try {
            id = CapeConfigManager.getUniqueId();
            CapeConfigManager.getInstance().addConfig(id, config);
        } catch (CapeConfigManager.InvalidCapeConfigIdException e) {
            e.printStackTrace();
        }
        return id;
    }
    
    /**
     * Load Capes using a InputStream (that should have a JSON String)
     * @param JsonStream a JSON String InputStream
     * @return the CapeConfigManager ID of the Capes loaded from this
     * @throws JsonSyntaxException JSON String malformed.
     * @throws NullPointerException Null Pointer from InputStream
     * @throws IOException Error from InputStream
     */
    public int loadCapes(InputStream JsonStream) throws JsonSyntaxException, NullPointerException, IOException
    { return this.loadCapes(StringHelper.getStringFromStream(JsonStream)); }
    
    /**
     * 
     * @param url
     * @return
     * @throws JsonSyntaxException
     * @throws NullPointerException
     * @throws IOException
     */
    public int loadCapes(URL url) throws JsonSyntaxException, NullPointerException, IOException
    { return this.loadCapes(StringHelper.getStringFromURL(url)); }
    
    /*
     * 
     */
    public int loadCapes(File jsonFile) throws JsonSyntaxException, NullPointerException, IOException, FileNotFoundException
    { return this.loadCapes(StringHelper.getStringFromFile(jsonFile)); }
}