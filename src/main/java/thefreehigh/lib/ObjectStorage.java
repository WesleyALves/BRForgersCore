package thefreehigh.lib;

import java.util.HashMap;
import java.util.Map;

/**
 * ObjectLib: a Multiple-use Multiple-type HashMaps.
 */
public class ObjectStorage
{
    public ObjectStorage() {}
	
	public Map<String, Boolean> booleans = new HashMap<String, Boolean>();
	public Map<String, String> strings = new HashMap<String, String>();
	public Map<String, Integer> integers = new HashMap<String, Integer>();
	public Map<String, Float> floats = new HashMap<String, Float>();
	public Map<String, ObjectStorage> libs = new HashMap<String, ObjectStorage>();
	public Map<String, Map> maps = new HashMap<String, Map>();
}
