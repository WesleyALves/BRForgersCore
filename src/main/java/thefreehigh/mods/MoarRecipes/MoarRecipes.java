package thefreehigh.mods.MoarRecipes;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import thefreehigh.core.TFHHelper;
import thefreehigh.lib.DungeonManager;
import thefreehigh.lib.ObjectStorage;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "MoarRecipes" , version = "0.4" , name = "Moar Recipes", dependencies = "required-after:TFHCore")
public class MoarRecipes
{
	static Logger logger;
	static Configuration config;
	private static ObjectStorage configLib = new ObjectStorage();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		logger.info("Do you said \"MORE RECIPES\"?");
		config = new Configuration(e.getSuggestedConfigurationFile());
		
		if(config.get("RECIPES", "shapeless_recipes", true, "Enable or Disable Shapeless Recipes").getBoolean())
		{
			logger.info("Adding Shapeless Recipes...");
			addShapeless();
		}
		if(config.get("RECIPES", "shaped_recipes", true, "Enable or Disable Shaped Recipes").getBoolean())
		{
			logger.info("Adding Shaped Recipes...");
			addShaped();
		}
		if(config.get("RECIPES", "furnace_recipes", true, "Enable or Disable Furnace Recipes").getBoolean())
		{
			logger.info("Adding Furnaces Recipes...");
			addFurnace();
		}
		if(config.get("DUNGEON", "moreLoot", true, "More Loot Items types in World").getBoolean())
		{
			logger.info("Adding Dungeon Loot...");
			addDungeonLoot();
		}
		//Save Configs
		config.save();
		logger.info("Sucessfully Loaded!");
        logger.info("Thanks " + TFHHelper.getLib().strings.get("username") +" for Playing with MoarRecipes!");
	}
	
	public static void addShapeless()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ice, 2), Blocks.packed_ice);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dispenser, 1) , Blocks.dropper, Items.bow);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dropper, 1) , Item.getItemFromBlock(Blocks.dispenser).setContainerItem(Items.bow));
	}
	
	public static void addShaped()
	{
		GameRegistry.addShapedRecipe(new ItemStack(Items.water_bucket, 1),
				" C ",
				"CBC",
				" C ",
				'C', Blocks.cactus,
				'B', Items.bucket
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.web, 4),
				"S S",
				" S ",
				"S S",
				'S', Items.string
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice, 2),
				"II",
				"II",
				'I', Blocks.ice
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 1),
				"SS",
				"SS",
				'S', Items.stick
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.hopper, 1),
				"S S",
				"SCS",
				" S ",
				'S', Blocks.cobblestone,
				'C', Blocks.chest
		);
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.hopper, 1),
				"S S",
				"SCS",
				" S ",
				'S', Blocks.stone,
				'C', Blocks.chest
		);
	}
	
	public static void addFurnace()
	{
		GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather),  1);
	}
	
	public static void addDungeonLoot()
	{
		DungeonManager.addChestLootToAll(new ItemStack(Blocks.dragon_egg), 1, 1, 1);
		DungeonManager.addChestLootToAll(new ItemStack(Items.nether_star), 1, 1, 1);
		DungeonManager.addChestLootToAll(new ItemStack(Items.clock), 1, 1, 25);
		DungeonManager.addChestLootToAll(new ItemStack(Items.compass), 1, 1, 25);
		DungeonManager.addChestLootToAll(new ItemStack(Items.emerald), 1, 5, 5);
		DungeonManager.addChestLootToAll(new ItemStack(Items.slime_ball, 3), 1, 5, 10);
		DungeonManager.addChestLootToAll(new ItemStack(Blocks.beacon), 1, 1, 1);
	}
}
