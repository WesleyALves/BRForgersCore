package testing;

import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.Recipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingObject implements ICraftable {

	@Override
	public Recipe[] getRecipes() {
		Recipe[] r = {new Recipe(new ItemStack(Items.diamond),new ItemStack(Blocks.dirt))};
		return r;
	}

}
