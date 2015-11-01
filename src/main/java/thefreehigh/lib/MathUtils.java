package thefreehigh.lib;

/**
 * Some useful Math-Utility functions 
 * @author TheFreeHigh
 */
public class MathUtils
{
	/**
	 * Calculates the Next Power of 2 from the Value
	 * @param v the Value
	 * @return The Next Power of 2
	 */
	public static int getNextPowerOf2(int v)
	{
		v--;
		v |= v >> 1;
		v |= v >> 2;
		v |= v >> 4;
		v |= v >> 8;
		return v++;
	}
	
	/**
	 * Check if the Value is a Power of 2
	 * @param v the Value
	 * @return True if is a Power of 2 or False if not
	 */
	public static boolean isPowerOf2(int v)
	{
		return (v & (v - 1)) == 0;
	}
	
	/**
	 * Round the Value to the Next Power of 2
	 * @param v the Value
	 * @return the Rounded-to-Power-of-2 value
	 */
	public static int RoundToPowerOf2(int v)
	{
		return ((v & (v - 1)) == 0) ? v : getNextPowerOf2(v);
	}
	
	/**
	 * Math.clamp() Implementation for Float
	 * @param val the Value
	 * @param min the Minimal Value
	 * @param max the Maximal Value
	 * @return the Clamped Value
	 */
	public static float clamp(float val, float min, float max) {
	    return Math.max(min, Math.min(max, val));
	}
	
	/**
	 * Math.clamp() Implementation for Integers
	 * @param val the Value
	 * @param min the Minimal Value
	 * @param max the Maximal Value
	 * @return the Clamped Value
	 */
	public static int clamp(int val, int min, int max) {
	    return Math.max(min, Math.min(max, val));
	}
}
