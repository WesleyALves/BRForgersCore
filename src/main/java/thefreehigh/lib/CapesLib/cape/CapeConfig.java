/**
 * CapesLib by Jadar
 * License: MIT License
 * (https://raw.github.com/jadar/CapesLib/master/LICENSE)
 * version 4.0.0.x
 */
package thefreehigh.lib.CapesLib.cape;

import java.util.HashMap;

import thefreehigh.lib.CapesLib.user.Group;
import thefreehigh.lib.CapesLib.user.User;

/**
 * The players that need to be outfitted are stored here
 * 
 * @author jadar
 */
public class CapeConfig {
    public HashMap<String, Group> groups;
    public HashMap<String, User> users;

    public CapeConfig() {
        groups = new HashMap<String, Group>();
        users = new HashMap<String, User>();
    }
}