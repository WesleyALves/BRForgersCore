/**
 * CapesLib by TheFreeHigh
 * a Rewrite of Jadar's DeveloperCapes
 * License: MIT License
 * (https://raw.github.com/jadar/CapesLib/master/LICENSE)
 * version 3.3.0.0
 */
package com.jadarstudios.developercapes;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonSyntaxException;

import thefreehigh.lib.CapesLib.*;

/**
 * DeveloperCapes is a library for Minecraft. It allows developers to quickly add capes for players they specify. DevCapes uses Minecraft Forge.
 * Due to Rewrite by TheFreeHigh, this class is a Mask API for old mods. All mods that used this API will be handled by the new CapesLib API.
 *
 * @author TheFreeHigh
 */
public class DevCapes { //Mask API. All is handled at the new one.
    private static DevCapes instance;
    
    public static final Logger logger = LogManager.getLogger("CapesLib (DevCapes Mask)");

    public DevCapes() {}

    public static DevCapes getInstance() {
        if (instance == null) {
            instance = new DevCapes();
        }
        return instance;
    }

    public InputStream getStreamForURL(URL url) {
        try {
			return DevCapesHelper.getStreamForURL(url);
		} catch (IOException e) {
			logger.error("Exception at getStreamForURL(URL url): ", e);
		}
		return null;
    }

    public InputStream getStreamForFile(File file) {
        try {
			return DevCapesHelper.getStreamForFile(file);
		} catch (FileNotFoundException e) {
			logger.error("Exception at getStreamForFile(File file): ", e);
		}
		return null;
    }

    @Deprecated
    public int registerConfig(String jsonURL, String identifier) {
        return this.registerConfig(jsonURL);
    }

    public int registerConfig(String jsonUrl) {
        try {
			return CapesLib.getInstance().loadCapes(new URL(jsonUrl));
		} catch (JsonSyntaxException e) {
			logger.error("Exception at registerConfig(String jsonUrl): ", e);
		} catch (NullPointerException e) {
			logger.error("Exception at registerConfig(String jsonUrl): ", e);
		} catch (MalformedURLException e) {
			logger.error("Exception at registerConfig(String jsonUrl): ", e);
		} catch (IOException e) {
			logger.error("Exception at registerConfig(String jsonUrl): ", e);
		}
		return -1;
    }

    @Deprecated
    public int registerConfig(URL url, String identifier) {
        return this.registerConfig(url);
    }

    public int registerConfig(URL jsonUrl) {
        try {
			return CapesLib.getInstance().loadCapes(jsonUrl);
		} catch (JsonSyntaxException e) {
			logger.error("Exception at registerConfig(URL jsonUrl):", e);
		} catch (NullPointerException e) {
			logger.error("Exception at registerConfig(URL jsonUrl):", e);
		} catch (IOException e) {
			logger.error("Exception at registerConfig(URL jsonUrl):", e);
		}
		return 0;
    }

    private static void silentClose(InputStream is) {
        try {is.close();} catch (IOException ignored) {}
    }
}