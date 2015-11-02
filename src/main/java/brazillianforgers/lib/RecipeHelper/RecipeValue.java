package brazillianforgers.lib.RecipeHelper;

import net.minecraft.item.ItemStack;

public class RecipeValue
{
	public char id;
	public ItemStack item;
	
	/**
	 * Recipe Value Definition. Used by {@link Recipe}() to Define the Values of a Shaped Recipe
	 * @param id Indentification {@link Character}
	 * @param item {@link ItemStack} Value
	 */
	public RecipeValue(char id, ItemStack item)
	{
		this.id = id;
		this.item = item;
	}
}
