package brazillianforgers.core;

import java.util.Random;

import brazillianforgers.lib.ObjectStorage;

/**
 * All things defined from BRForgersCore
 * @author brazillianforgers
 */
public class BRForgersHelper
{
	/**
	 * BrazillianForgersLib unique instance. Get it with BrazillianForgersHelper.getLib()
	 */
	private static BRForgersLib lib;
	
	/**
	 * Get the BrazillianForgersLib instance.
	 * @return the BrazillianForgersLib instance
	 */
    public static BRForgersLib getLib() {
        if (lib == null) {lib = new BRForgersLib(); lib.booleans.put("init",false);}
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
