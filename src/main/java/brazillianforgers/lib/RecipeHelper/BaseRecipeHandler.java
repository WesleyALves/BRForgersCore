package brazillianforgers.lib.RecipeHelper;

/**
 * Every class that extends it will act as a Recipe Handler.
 *
 */
public abstract class BaseRecipeHandler
{
	public static Recipe[] recipes = {};
	
	public static void addToRecipes(ICraftable craftableObject)
	{
		Recipe[] enteredRecipes = craftableObject.getRecipes();
			for (Recipe eachRecipe: enteredRecipes)	recipes[recipes.length] = eachRecipe;
	}
	
	public static void registerRecipes()
	{
		for (Recipe recipe: recipes) recipe.registerCrafting();
	}
}
