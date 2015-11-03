package brazillianforgers.lib;

public class ArrayHelper
{
	/**
	 * Find a Object of the defined Type on a Array
	 * @param array Array to Be Searched
	 * @param obj Object to be compared
	 * @return Index of the Object (or -1 if not found)
	 */
	public static <T> int findOnArray(T[] array, T obj) {
		for (int i = 0; i < array.length; i++)
    	{
    		if (array[i]==obj) {return i;}
    	}
    	return -1;
	}
}
