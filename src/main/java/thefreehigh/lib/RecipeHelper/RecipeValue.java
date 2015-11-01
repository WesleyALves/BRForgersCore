package thefreehigh.lib.RecipeHelper;

import net.minecraft.item.ItemStack;

public class RecipeValue
{
	public char id;
	public ItemStack item;
	
	public RecipeValue(char id, ItemStack item)
	{
		this.id = id;
		this.item = item;
	}
}
