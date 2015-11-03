package brazillianforgers.lib.RecipeHelper;

public class RecipeHelper {
	/**
	 * Filter the Recipes in the Array
	 * @param recipes {@link Recipe} Array
	 * @param tag {@link String} tag
	 * @param NotMode If TRUE, Only the Recipes that don't have the Tag will be picked up
	 * @return A Filtered Recipes Array
	 */
	public static Recipe[] filterTags(Recipe[] recipes, String tag, boolean NotMode)
	{
		Recipe[] filterRecipes = {};
		for(Recipe eachRecipe : filterRecipes) if (eachRecipe.doHaveTag(tag) != NotMode) filterRecipes[filterRecipes.length] = eachRecipe;
		return filterRecipes;
	}
	
	/**
	 * Filter the Recipes in the Array
	 * @param recipes {@link Recipe} Array
	 * @param tag {@link String} tags in a Array
	 * @param NotMode If TRUE, Only the Recipes that don't have the Tag will be picked up
	 * @return A Filtered Recipes Array
	 */
	public static Recipe[] filterTags(Recipe[] recipes, String[] tags, boolean NotMode)
	{
		Recipe[] filterRecipes = recipes;
		
		for (String tag: tags) filterRecipes = filterTags(filterRecipes,tag,NotMode);
		
		return filterRecipes;
	}
	
	/**
	 * Register all Recipes in a Array
	 * @param recipes {@link Recipe} Array
	 */
	public static void registerAll(Recipe[] recipes)
	{
		for (Recipe recipe: recipes) recipe.registerCrafting();
	}
}
