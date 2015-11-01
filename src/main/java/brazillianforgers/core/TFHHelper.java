package brazillianforgers.core;

import java.util.Random;

import brazillianforgers.lib.ObjectStorage;

/**
 * All things defined from BRForgersCore
 * @author brazillianforgers
 */
public class TFHHelper
{
	/**
	 * TFHLib unique instance. Get it with TFHHelper.getLib()
	 */
	private static TFHLib lib;
	
	/**
	 * Get the TFHLib instance.
	 * @return the TFHLib instance
	 */
    public static TFHLib getLib() {
        if (lib == null) {lib = new TFHLib(); lib.booleans.put("init",false);}
        return lib;
    }
    
    /**
	 * A "Common" Random() for the Mods
	 */
	public static Random randomGen;
	
	/**
	 * Variable that is setted to TRUE at the End of the Variable initialization
	 */
	static boolean varInitDone = false;
	
	/**
	 * Check if the Variables have been Initializated
	 * @return
	 */
	public static boolean varInitDone()
	{
		return varInitDone;
	}
}
