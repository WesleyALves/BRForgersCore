package thefreehigh.mods.DTHighlands;

import thefreehigh.core.CoreLib;

public class Lib {
	//Mod Identity
	public static final String MODID = "DTHighlands";
	public static final String VERSION = "1.0";
	public static final String MODNAME = "DragonTech: Highlands";
	public static final String DEPS = "required-after:TFHCore" + ";required-after:DragonTech";
	
	//Helpet
	public static final String TEXTURE_PATH = MODID + ":";

	//Easter Eggs
	public static final String INITLOG = "ROAR! DragonTech: Highlands is Loading";
	
	//Proxy Identity
	public static final String COMMONPROXY = "thefreehigh.mods.DTHighlands.proxy.CommonProxy";
	public static final String CLIENT = "thefreehigh.mods.DTHighlands.proxy.ClientProxy";
}
