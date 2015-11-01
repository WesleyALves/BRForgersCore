package thefreehigh.mods.BlocksNItems.manager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void init()
	{
		addShapeless(); addShaped(); addFurnace();
	}
	
	public static void addShapeless()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.dragonBlock, 1), Blocks.iron_block, BlockManager.ornateOrangeBlock, ItemManager.dragonShape);
	}
	
	public static void addShaped()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.dragonShape, 1),
				"IIB",
				"BBB",
				"BII",
				'B', Blocks.iron_block,
				'I', Items.iron_ingot
		);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.tfhPlate, 1),
				"YII",
				"IOI",
				"IIR",
				'Y', new ItemStack(Items.dye,1,11),
				'O', new ItemStack(Items.dye,1,14),
				'R', new ItemStack(Items.dye,1,1),
				'I', Items.iron_ingot
		);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.tfhBlock, 1),
				"PPP",
				"PPP",
				"PPP",
				'P', ItemManager.tfhPlate
		);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.ornateOrangeBlock, 1),
				"OYY",
				"ORO",
				"YYO",
				'O', new ItemStack(Blocks.wool, 1, 1),
				'Y', new ItemStack(Blocks.wool, 1, 4),
				'R', new ItemStack(Blocks.wool, 1, 14)
		);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.ornateOrangeBlock, 1),
				"YOO",
				"YRY",
				"OOY",
				'O', new ItemStack(Blocks.wool, 1, 1),
				'Y', new ItemStack(Blocks.wool, 1, 4),
				'R', new ItemStack(Blocks.wool, 1, 14)
		);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.fakeRedstoneBlock, 6),
				"WWW",
				"GRG",
				"CCC",
				'W', new ItemStack(Blocks.wool,1,14),
				'C', new ItemStack(Blocks.stained_hardened_clay,1,14),
				'R', Blocks.redstone_block,
				'G', Blocks.glass
		);
	}
	
	public static void addFurnace()
	{
		//GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather),  1);
	}
}
