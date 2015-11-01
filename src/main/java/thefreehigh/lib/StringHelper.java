package thefreehigh.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *  String Helper functions (Mostly toString methods)
 * @author TheFreeHigh
 */
public class StringHelper {
	/**
	 * Get the content from a InputStream and outputs a String
	 * @param stream the InputStream going to be used
	 * @return Content from InputStream
	 * @throws IOException
	 */
	public static String getStringFromStream(InputStream stream) throws IOException
    {
    	return IOUtils.toString(stream, "UTF-8");
    }
    
	/**
	 * Get the Content from a File and outputs a String
	 * @param file the File going to be read
	 * @return Content from File
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
    public static String getStringFromFile(File file) throws FileNotFoundException, IOException
    {
    	return getStringFromStream(new FileInputStream(file));
    }
    
    /**
     * Get the Content from a URL and outputs a String
     * @param url the URL to Get Content to
     * @return Content from the URL
     * @throws IOException
     */
    public static String getStringFromURL(URL url) throws IOException
    {
        URLConnection c = url.openConnection();
        c.setRequestProperty("User-Agent", System.getProperty("java.version"));
        c.connect();
        return getStringFromStream(c.getInputStream());
    }
    
    /**
     * Capitalize the First Letter of the String
     * @param str the String to Be Capitalized
     * @return the Capitalized String
     */
    public static String Capitalize(String str)
    {
    	return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    /**
     * Find a String on a Array
     * @param array the String Array
     * @param str the String to be searched
     * @return the Index of the String (or -1 if not found)
     */
    public static int find(String[] array, String str)
    {
    	for (int i = 0; i < array.length; i++)
    	{
    		if (array[i]==str) {return i;}
    	}
    	return -1;
    }
}
