/**
 * CapesLib by Jadar
 * License: MIT License
 * (https://raw.github.com/jadar/CapesLib/master/LICENSE)
 * version 4.0.0.x
 */
package thefreehigh.lib.CapesLib.user;

import java.util.ArrayList;
import java.util.List;

import thefreehigh.lib.CapesLib.cape.ICape;

/**
 * This player is getting their own cape
 * 
 * @author jadar
 */
public class User {

    public List<ICape> capes;
    public final String username;

    public User(String username) {
        this.username = username;
        this.capes = new ArrayList<ICape>();
    }
}