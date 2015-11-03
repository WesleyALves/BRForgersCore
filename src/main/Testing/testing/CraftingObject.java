package testing;

import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.IRecipeHandler;
import brazillianforgers.lib.RecipeHelper.Recipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingObject implements ICraftable {

	@Override
	public Recipe getRecipe() {
		return new Recipe(new ItemStack(Items.diamond),new ItemStack(Blocks.dirt));
	}

	@Override
	public void addToRecipeHandler(IRecipeHandler r) {
		r.addToRecipes(this);
	}

}
