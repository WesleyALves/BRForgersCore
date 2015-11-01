package com.jadarstudios.developercapes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DevCapesHelper { //Helper Classes for Load.
	public static final Logger logger = LogManager.getLogger("CapesLib");
	
	public static InputStream getStreamForURL(URL url) throws IOException {
        InputStream stream = null;
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", System.getProperty("java.version"));
            connection.connect();

            stream = connection.getInputStream();
        return stream;
    }

    public static InputStream getStreamForFile(File file) throws FileNotFoundException {
        InputStream stream = null;
            stream = new FileInputStream(file);
        return stream;
    }
}
