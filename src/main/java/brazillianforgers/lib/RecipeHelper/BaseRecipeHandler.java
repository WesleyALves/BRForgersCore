package brazillianforgers.lib.RecipeHelper;

public abstract class BaseRecipeHandler implements IRecipeHandler
{
	public Recipe[] recipes = {};
	
	public void addToRecipes(ICraftable craftableObject)
	{
		recipes[recipes.length] = craftableObject.getRecipe();
	}
	
	public void registerRecipes()
	{
		for (Recipe recipe: recipes) recipe.registerCrafting();
	}
}
