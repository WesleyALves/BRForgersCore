package brazillianforgers.lib.RecipeHelper;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class Recipe
{
	public enum RecipeType {
		FURNACE, SHAPED, SHAPELESS, IRECIPE;
	}
	
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
	 * Shaped Recipe
	 * @param output Item (ItemStack) Crafting output
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
		this.shapedRecipeInputs = inputs;
	}
	
	/**
	 * Shaped Recipe
	 * @param output Item (ItemStack) Crafting output
	 * @param recipeForm Format of the Recipe
	 * @param inputs Items (ItemStack[]) used in Recipe
	 */
	public Recipe(ItemStack output, ItemStack[] inputs)
	{		this.type = RecipeType.SHAPELESS;
		this.output = output;
		this.shapelessInputs = inputs;
	}
	
	/**
	 * Furnace Recipe
	 * @param output Item (ItemStack) Crafting output
	 * @param recipeForm Format of the Recipe
	 * @param inputs Item (ItemStack) Inputs
	 */
	public Recipe(ItemStack input, ItemStack output, float xp)
	{		this.type = RecipeType.FURNACE;
		this.output = output;
		this.furnaceInput = input;
		this.furnaceXp = xp;
	}
	public Recipe(IRecipe recipe)
	{		this.type = RecipeType.IRECIPE;
		this.recipe = recipe;
	}
	
	public Recipe addTag(String tag)
	{
		this.tags[tags.length] = tag;
		
		return this;
	}
	
	public boolean haveTag(String tag)
	{
		for(String eachTag: tags) if (eachTag == tag) return true;
		return false;
	}
	
	public Object[] parseShapedInput()
	{
		//Starts Parsing a Recipe
		Object[] parsed = {};
		
		if (this.type != RecipeType.SHAPED) return parsed;
		
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
