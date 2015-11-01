package thefreehigh.mods.BlocksNItems.manager;

import net.minecraftforge.common.MinecraftForge;
import thefreehigh.mods.BlocksNItems.events.*;

public class EventHandler {
	public static void init()
	{
		MinecraftForge.EVENT_BUS.register(new PlayerDeathEvent());
	}
}
