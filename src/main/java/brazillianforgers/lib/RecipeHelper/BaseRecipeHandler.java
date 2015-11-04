package brazillianforgers.lib.RecipeHelper;

/**
 * Every class that extends it will act as a Recipe Handler.
 *
 */
public abstract class BaseRecipeHandler
{
	public Recipe[] recipes = {};
	
	public void addToRecipes(ICraftable craftableObject)
	{
		Recipe[] enteredRecipes = craftableObject.getRecipes();
			for (Recipe eachRecipe: enteredRecipes)	recipes[recipes.length] = eachRecipe;
	}
	
	public void registerRecipes()
	{
		for (Recipe recipe: recipes) recipe.registerCrafting();
	}
}
