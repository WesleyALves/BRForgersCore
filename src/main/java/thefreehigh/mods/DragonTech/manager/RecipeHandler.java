package thefreehigh.mods.DragonTech.manager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import thefreehigh.mods.DragonTech.DragonTech;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	/* Init Method */
	public static void init()
	{
		boolean aM = DragonTech.configLib.booleans.get("MAIN_adventureMode");
		int[] d = {0,
			!aM ? DragonTech.configLib.integers.get("CRAFTING_main") : -1,
			!aM ? DragonTech.configLib.integers.get("CRAFTING_cloning") : -1,
			!aM ? DragonTech.configLib.integers.get("CRAFTING_materials") : -1,
			DragonTech.configLib.integers.get("CRAFTING_armor"),
			DragonTech.configLib.integers.get("CRAFTING_util"),
			DragonTech.configLib.booleans.get("COMPAT_VanillaToDragonEgg") ? 1 : 0,
			aM ? 1 : 0
		};
		
		MainRecipes(d[1]);
		CloningRecipes(d[2]);
	}
	
	/* SAMPLE Recipes Method */
	public static void SampleRecipes(int d)
	{
		/* Easy Recipes */
		if(d == 0 || d == 1)
		{}
		
		/* Normal Recipes */
		if(d == 0 || d == 2)
		{}
		
		/* Hard Recipes */
		if(d == 0 || d == 3)
		{}
		
		/* Adventure Recipes */
		if(d == 4)
		{}
		
		/* Common Recipes */
		if (d != -1 || d != 4)
		{}
		
		/* Not Hard Recipes */
		if (d != 1 && d != 4 && d!= 3)
		{}
	}
	
	/* Main Recipes */
	public static void MainRecipes(int d)
	{
		/* Easy Recipes */
		if(d == 0 || d == 1)
		{
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.livingObsidian, 4),
				"OPO",
				"PEP",
				"OPO",
				'O', Blocks.obsidian,
				'P', Items.ender_pearl,
				'E', Items.ender_eye
			);
		}
		
		/* Normal Recipes */
		if(d == 0 || d == 2)
		{
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.livingObsidian, 4),
				"OEO",
				"ESE",
				"OEO",
				'O', Blocks.obsidian,
				'S', Items.nether_star,
				'E', Items.ender_eye
			);
		}
		
		/* Hard Recipes */
		if(d == 0 || d == 3)
		{
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.enderStar, 1),
				"ESE",
				"DMD",
				"ESE",
				'S', Items.nether_star,
				'E', Items.ender_eye,
				'M', Blocks.emerald_block,
				'D', Blocks.diamond_block
			);
		
			GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonStar, 1),
				"OSO",
				"SDS",
				"OSO",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(Item.getItemFromBlock(Blocks.dragon_egg)),
				'S', ItemManager.enderStar
			);
		
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.livingObsidian, 4),
				"OEO",
				"ESE",
				"OEO",
				'O', Blocks.obsidian,
				'S', ItemManager.enderStar,
				'E', Items.ender_eye
			);
		
		}
		
		/* Common Recipes */
		if (d != -1)
		{
			GameRegistry.addShapedRecipe(new ItemStack(BlockManager.livingObsidian, 4),
				"OOO",
				"ODO",
				"OOO",
				'O', Blocks.obsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(Item.getItemFromBlock(Blocks.dragon_egg))
			);
		}
		
		/* Not Hard Recipes */
		if (d != 1 && d!= 3)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_star,2), ItemManager.enderStar.setContainerItem(Items.ender_eye));
			GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.enderStar,4), ItemManager.dragonStar.setContainerItem(Items.ender_eye));
		}
	}
	
	/* Cloning Recipes */
	public static void CloningRecipes(int d)
	{
		/* Easy Recipes */
		if(d == 0 || d == 1)
		{
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.dragon_egg, 1),
				"OOO",
				"ODO",
				"OOO",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(Item.getItemFromBlock(Blocks.dragon_egg))
			);
		}
		
		/* Normal Recipes */
		if(d == 0 || d == 2)
		{
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.dragon_egg, 1),
				"OOO",
				"ODO",
				"OSO",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(Item.getItemFromBlock(Blocks.dragon_egg)),
				'S', Items.nether_star
			);
		}

		/* Hard Recipes */
		if(d == 0 || d == 3)
		{
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.dragon_egg, 1),
				"OOO",
				"ODO",
				"OSO",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(Item.getItemFromBlock(Blocks.dragon_egg)),
				'S', ItemManager.dragonStar
			);
		}
	}	
	
	/* SAMPLE Recipes Method */
	public static void MaterialRecipes(int d)
	{
		/* Easy Recipes */
		if(d == 0 || d == 1)
		{}
		
		/* Normal Recipes */
		if(d == 0 || d == 2)
		{}
		
		/* Hard Recipes */
		if(d == 0 || d == 3)
		{}
		
		/* Adventure Recipes */
		if(d == 4)
		{}
		
		/* Common Recipes */
		if (d != -1 || d != 4)
		{}
		
		/* Not Hard Recipes */
		if (d != 1 && d != 4 && d!= 3)
		{}
	}
	
	public static void addCommonRecipes() //Recipes that are the same independent from Difficulty
	{
		
		
		/*GameRegistry.addShapedRecipe(new ItemStack(ItemManager.soulbinder, 1),
				"MPM",
				"GWG",
				"SES",
				'M', Items.speckled_melon,
				'P', Items.ender_pearl,
				'G', Items.ghast_tear,
				'W', Items.nether_wart,
				'S', Items.string,
				'E', Items.ender_eye
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonWing, 1),
				"SSS",
				"SS ",
				"SD ",
				'S', ItemManager.dragonScale,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(Item.getItemFromBlock(Blocks.dragon_egg))
		);*/
		
		//Ender Trail Mix
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.enderTrailMix, 2), Items.ender_pearl, Items.ender_pearl, Items.ender_eye, Items.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.enderTrailMix, 8), Items.ender_pearl, Items.ender_pearl, Items.ender_eye, Items.sugar, Items.glowstone_dust, Items.redstone, Items.gunpowder, new ItemStack(Items.dye,1,15), Items.wheat);
	}
	
	public static void addEasyRecipes() //Recipes of Easy Difficulty
	{
		//Scales
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScale, 32),
				" OO",
				"ODO",
				"OO ",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(ItemManager.dragonEgg)
		);
		
		/*//D.Soulbinder
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonSoulbinder, 1),
				" S ",
				"WDW",
				" T ",
				'S', ItemManager.soulbinder,
				'D', Blocks.dragon_egg,
				'W', ItemManager.dragonWing,
				'T', ItemManager.dragonScale
		);*/
		
		//Nightny
		/*GameRegistry.addShapedRecipe(new ItemStack(ItemManager.nightnyEgg, 1),
				"PFP",
				"ADA",
				"SES",
				'E', Items.ender_eye,
				'D', Blocks.dragon_egg,
				'A', Items.apple,
				'P', new ItemStack(Items.potionitem,1,8261),
				'S', ItemManager.dragonScale,
				'F', new ItemStack(Blocks.red_flower,1,2)
		);*/
		
		//Armor
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleHelmet, 1),
				"DDD",
				"D D",
				"   ",
				'D', ItemManager.dragonScale
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleChestplate, 1),
				"D D",
				"DDD",
				"DDD",
				'D', ItemManager.dragonScale
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleLeggings, 1),
				"DDD",
				"D D",
				"D D",
				'D', ItemManager.dragonScale
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleBoots, 1),
				"   ",
				"D D",
				"D D",
				'D', ItemManager.dragonScale
		);
	}
	
	public static void addNormalRecipes() //Recipes of Normal Difficulty
	{
		//Scales
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScale, 32),
				" OM",
				"ODO",
				"MO ",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(ItemManager.dragonEgg),
				'M', Blocks.diamond_block
		);
		
		/*//D.Soulbinder
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonSoulbinder, 1),
				" S ",
				"WDW",
				" T ",
				'S', ItemManager.soulbinder,
				'D', Blocks.dragon_egg,
				'W', ItemManager.dragonWing,
				'T', Items.nether_star
		);*/
		
		//Nightny Egg
		/*GameRegistry.addShapedRecipe(new ItemStack(ItemManager.nightnyEgg, 1),
				"PFP",
				"ADA",
				"SES",
				'E', Items.nether_star,
				'D', Blocks.dragon_egg,
				'A', Items.golden_apple,
				'P', new ItemStack(Items.potionitem,1,8229),
				'S', ItemManager.dragonScale,
				'F', new ItemStack(Blocks.red_flower,1,2)
		);*/
		
		//Armor
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleHelmet, 1),
				"DSD",
				"DGD",
				"   ",
				'D', ItemManager.dragonScale,
				'S', Items.nether_star,
				'G', Blocks.glass_pane
		);
				
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleChestplate, 1),
				"D D",
				"DSD",
				"DDD",
				'D', ItemManager.dragonScale,
				'S', Items.nether_star
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleLeggings, 1),
				"DSD",
				"D D",
				"D D",
				'D', ItemManager.dragonScale,
				'S', Items.nether_star
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleBoots, 1),
				"D D",
				"D D",
				"WSW",
				'D', ItemManager.dragonScale,
				'S', Items.nether_star,
				'W', Blocks.wool
		);
	}
	
	public static void addHardRecipes() //Recipes of Hard Difficulty
	{
		//Scales
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScale, 32),
				"SMO",
				"MDM",
				"OMS",
				'O', BlockManager.livingObsidian,
				'D', Item.getItemFromBlock(Blocks.dragon_egg).setContainerItem(ItemManager.dragonEgg),
				'M', Blocks.diamond_block,
				'S', ItemManager.dragonStar
		);
		
		/*//D.Soulbinder
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonSoulbinder, 1),
				" S ",
				"WDW",
				" T ",
				'S', ItemManager.soulbinder,
				'D', Blocks.dragon_egg,
				'W', ItemManager.dragonWing,
				'T', ItemManager.dragonStar
		);*/
		
		//Nightny
		/*GameRegistry.addShapedRecipe(new ItemStack(ItemManager.nightnyEgg, 1),
				"PFP",
				"ADA",
				"SES",
				'E', ItemManager.dragonStar,
				'D', Blocks.dragon_egg,
				'A', new ItemStack(Items.golden_apple,1,1),
				'P', new ItemStack(Items.potionitem,1,8261),
				'S', ItemManager.dragonScale,
				'F', new ItemStack(Blocks.red_flower,1,2)
		);*/
		
		//Armor
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleHelmet, 1),
				"DSD",
				"DGD",
				"   ",
				'D', ItemManager.dragonScale,
				'S', ItemManager.enderStar,
				'G', Blocks.stained_glass_pane
		);
				
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleChestplate, 1),
				"D D",
				"DSD",
				"DDD",
				'D', ItemManager.dragonScale,
				'S', ItemManager.dragonStar
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleLeggings, 1),
				"DSD",
				"D D",
				"D D",
				'D', ItemManager.dragonScale,
				'S', ItemManager.enderStar
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonScaleBoots, 1),
				"D D",
				"D D",
				"WSW",
				'D', ItemManager.dragonScale,
				'S', ItemManager.dragonStar,
				'W', Blocks.wool
		);
	}
	
	public static void addNotHardRecipes() //Recipes of Difficulties != Hard
	{
		//Uncrafting Hard Crafs
		GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_star,2), ItemManager.enderStar.setContainerItem(Items.ender_eye));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.enderStar,4), ItemManager.dragonStar.setContainerItem(Items.ender_eye));
	}
}
