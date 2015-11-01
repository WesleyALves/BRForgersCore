/**
 * CapesLib by Jadar
 * License: MIT License
 * (https://raw.github.com/jadar/CapesLib/master/LICENSE)
 * version 4.0.0.x
 */
package thefreehigh.lib.CapesLib;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import thefreehigh.lib.CapesLib.cape.ICape;
import thefreehigh.lib.CapesLib.user.User;
import thefreehigh.lib.CapesLib.user.UserManager;

/**
 * This is not the class you are looking for.
 * 
 * @author jadar
 */
public class RenderEventHandler {

    @SubscribeEvent
    public void renderPlayer(RenderPlayerEvent.Specials.Pre event) {
        AbstractClientPlayer player = (AbstractClientPlayer) event.entityPlayer;

        UserManager manager = UserManager.getInstance();
        User user = manager.getUser(player.getCommandSenderName());
        if (user == null) return;

        ICape cape = user.capes.get(0);
        if (cape == null) return;

        boolean flag = cape.isTextureLoaded(player);
        if (!flag) {
            cape.loadTexture(player);
        }
    }
}