package brazillianforgers.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemHelper
{
	public static Item toItem(Block block)
	{
		return Item.getItemFromBlock(block);
	}
	
	public static Item toItem(ItemStack stack)
	{
		return stack.getItem();
	}
	
	public static Block toBlock(Item item)
	{
		return Block.getBlockFromItem(item);
	}
	
	public static Block toBlock(ItemStack stack)
	{
		return toBlock(stack.getItem());
	}
}
