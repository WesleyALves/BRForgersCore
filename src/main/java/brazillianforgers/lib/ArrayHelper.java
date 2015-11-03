package brazillianforgers.lib;

import brazillianforgers.lib.RecipeHelper.Recipe;

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
	
	public static <T> T[] addToArray(T[] array, T obj) {
		array[array.length] = obj;
		return array;
	}
	
	public static <T> T[] mergeArrays(T[] newArray, T[]... arrays) {
		for(T[] eachArray : arrays)
			for(T eachObject : eachArray)
				newArray[newArray.length] = eachObject;
		return newArray;
				
	}
	
	public static <T> T[] removeFromArray(T[] array, T[] newArray, T obj, boolean NotMode) {
		for(T eachObject : array)
			if ((eachObject == obj) != NotMode)
				newArray[newArray.length] = eachObject;
		return newArray;
	}
}
