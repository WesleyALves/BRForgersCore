package brazillianforgers.lib.RecipeHelper;

import brazillianforgers.lib.StringHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class Recipe
{
	public enum RecipeType {FURNACE, SHAPED, SHAPELESS, IRECIPE;}
	
	//Common Recipe Values
	public ItemStack output;
	public RecipeType type;
	public String[] tags = {};
	
	//Shaped Recipes
	public String[] shapedRecipeFormat = new String[3];
	public RecipeValue[] shapedRecipeInputs;
	
	//Shapeless Recipes
	public ItemStack[] shapelessInputs;
	
	//Furnace Recipe
	public ItemStack furnaceInput;
	public float furnaceXp;
	
	//IRecipe
	public IRecipe recipe;
	
	/**
	 * Shaped Recipe Definition
	 * @param output Item ({@link ItemStack}) Crafting output
	 * @param recipeForm Format of the Recipe
	 * @param inputs Values for the Recipe Format (RecipeValue[]) Inputs
	 */
	public Recipe(ItemStack output, String[] recipeForm, RecipeValue[] inputs)
	{		this.type = RecipeType.SHAPED;
		this.output = output;
		//this.recipeForm = recipeForm;
		this.shapedRecipeFormat[0] = recipeForm[0];
		this.shapedRecipeFormat[1] = recipeForm[1];
		this.shapedRecipeFormat[2] = recipeForm[2];
		
		RecipeValue[] parsedInputs = {};
		char[] parsedChars = {};
		for (RecipeValue eachInput : inputs)
			if (parsedInputs.length < 10 && StringHelper.find(parsedChars, eachInput.id) != -1)
			{parsedInputs[parsedInputs.length] = eachInput; parsedChars[parsedChars.length] = eachInput.id;};
		this.shapedRecipeInputs = parsedInputs;
	}
	
	/**
	 * Shapeless Recipe Definition
	 * @param output Item ({@link ItemStack}) Crafting output
	 * @param recipeForm Format of the Recipe
	 * @param inputs Items ({@link ItemStack}[]) used in Recipe
	 */
	public Recipe(ItemStack output, ItemStack[] inputs)
	{		this.type = RecipeType.SHAPELESS;
		this.output = output;
		ItemStack[] parsedInputs = {};
		for (ItemStack eachInput : inputs)
			if (parsedInputs.length < 10)
				parsedInputs[parsedInputs.length] = eachInput;
		this.shapelessInputs = parsedInputs;
	}
	
	/**
	 * Furnace Recipe Definition
	 * @param output Item ({@link ItemStack}) Crafting output
	 * @param recipeForm Format of the Recipe
	 * @param inputs Item ({@link ItemStack}) Inputs
	 */
	public Recipe(ItemStack input, ItemStack output, float xp)
	{		this.type = RecipeType.FURNACE;
		this.output = output;
		this.furnaceInput = input;
		this.furnaceXp = xp;
	}
	
	/**
	 * {@link IRecipe} Definition
	 * @param recipe Class that implements {@link IRecipe}
	 */
	public Recipe(IRecipe recipe)
	{		this.type = RecipeType.IRECIPE;
		this.recipe = recipe;
	}
	
	/**
	 * Add a Tag (a String) to the Tag Array
	 * @param tag String Tag
	 */
	public Recipe addTag(String tag)
	{
		if (!doHaveTag(tag)) this.tags[tags.length] = tag;
		
		return this;
	}
	
	/**
	 * Add Tags (in a String Array) to the Tag Array
	 * @param tag String Tag
	 */
	public Recipe addTags(String[] tags)
	{
		for(String tag: tags) addTag(tag);
		return this;
	}
	
	/**
	 * Test if have a Tag
	 * @param tag String Tag
	 */
	public boolean doHaveTag(String tag)
	{
		for(String eachTag: tags) if (eachTag == tag) return true;
		return false;
	}
	
	/**
	 * Remove a Tag from the Tag Array
	 * @param tag String Tag
	 */
	public void removeTag(String tag)
	{
		String[] newTags = {};
		for(int i = 0; i < tags.length; i++) if (tags[i] != tag) newTags[newTags.length] = tags[i];
	}
	
	/**
	 * Parse the Shaped Recipe Params.
	 * @return an Object Array to be used on the GameRegistry, or NULL if this is not a Shaped Recipe
	 */
	public Object[] parseShapedInput()
	{
		if (this.type != RecipeType.SHAPED) return null;
		
		//Starts Parsing a Recipe
		Object[] parsed = {};
		
		//Tries to "Solve" the Recipe  Format
		String[] f = this.shapedRecipeFormat;
		
		for (int i = 0; i < f.length || i < 4; i++)
		{
			if(f[i] != null)
			{
				parsed[parsed.length] = f[i];
			}
		}
		
		RecipeValue[] v = this.shapedRecipeInputs;
		for (int i = 0; i < v.length; i++)
		{
			if(v[i] != null && v[i].item != null)
			{
				parsed[parsed.length] = v[i].id;
				parsed[parsed.length] = v[i].item;
			}
		}
		
		
		return parsed;
	}
	
	/**
	 * Register the Crafting defined for the Recipe
	 */
	public void registerCrafting()
	{
		/* Shaped Recipe */
		if (this.type == RecipeType.SHAPED) 
			recipe = GameRegistry.addShapedRecipe( output, parseShapedInput());
		
		/* Shapeless Recipe */
		if (this.type == RecipeType.SHAPELESS)
			GameRegistry.addShapelessRecipe( output, (Object[])shapelessInputs );
		
		/* Smelting Recipe */
		if (this.type == RecipeType.FURNACE)
			GameRegistry.addSmelting( furnaceInput, output, furnaceXp );
		
		/* IRecipe */
		if (this.type == RecipeType.IRECIPE)
			GameRegistry.addRecipe(recipe);
	}
}
