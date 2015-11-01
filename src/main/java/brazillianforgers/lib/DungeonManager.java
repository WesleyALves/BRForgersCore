package brazillianforgers.lib;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

/**
 * A Manager for Dungeon Loot. Use it on a CommonProxy or a Manager
 * @author brazillianforgers
 */
public class DungeonManager {
	
	/**
	 * All Dungeon Chests in ChestGenHooks, in a Array.
	 */
	public static String[] dungeonChests = {
			ChestGenHooks.BONUS_CHEST,ChestGenHooks.VILLAGE_BLACKSMITH,
			ChestGenHooks.DUNGEON_CHEST,ChestGenHooks.MINESHAFT_CORRIDOR,
			ChestGenHooks.PYRAMID_DESERT_CHEST,ChestGenHooks.PYRAMID_JUNGLE_CHEST,ChestGenHooks.PYRAMID_JUNGLE_DISPENSER,
			ChestGenHooks.STRONGHOLD_CORRIDOR,ChestGenHooks.STRONGHOLD_CROSSING,ChestGenHooks.STRONGHOLD_LIBRARY
	};
	
	/**
	 * Add Loot to a Dungeon Chests
	 * @param id the ID of the String in the DungeonChest Array
	 * @param item the ItemStack to be added
	 * @param minAmount Minimum Amount of the Loot
	 * @param maxAmount Maximum Amount of the Loot
	 * @param chance The Chance (1=Rarest,100=Commonest) of the Loot
	 */
	public static void addChestLoot(int id, ItemStack item, int minAmount, int maxAmount, int chance)
	{
		ChestGenHooks.getInfo(dungeonChests[id]).addItem(new WeightedRandomChestContent(item, minAmount, maxAmount, chance));
	}
	
	/**
	 * Add Loot to a Dungeon Chests
	 * @param id the the String of the Chest Loot (in the DungeonChest Array)
	 * @param item the ItemStack to be added
	 * @param minAmount Minimum Amount of the Loot
	 * @param maxAmount Maximum Amount of the Loot
	 * @param chance The Chance (1=Rarest,100=Commonest) of the Loot
	 */
	public static void addChestLoot(String id, ItemStack item, int minAmount, int maxAmount, int chance)
	{
		ChestGenHooks.getInfo(id).addItem(new WeightedRandomChestContent(item, minAmount, maxAmount, chance));
	}
	
	/**
	 * Add Loot to Multiple Dungeon Chests
	 * @param ids Array of IDS of the Chest Loots (in the DungeonChest Array)
	 * @param item the ItemStack to be added
	 * @param minAmount Minimum Amount of the Loot
	 * @param maxAmount Maximum Amount of the Loot
	 * @param chance The Chance (1=Rarest,100=Commonest) of the Loot
	 */
	public static void addChestLoot(int[] ids, ItemStack item, int minAmount, int maxAmount, int chance)
	{
		WeightedRandomChestContent chest = new WeightedRandomChestContent(item, minAmount, maxAmount, chance);
		for(int i = 0; i < ids.length; i++)
		{
			ChestGenHooks.getInfo(dungeonChests[ids[i]]).addItem(chest);
		}
	}
	
	/**
	 * Add Loot to All Dungeon Chests
	 * @param item the ItemStack to be added
	 * @param minAmount Minimum Amount of the Loot
	 * @param maxAmount Maximum Amount of the Loot
	 * @param chance The Chance (1=Rarest,100=Commonest) of the Loot
	 */
	public static void addChestLootToAll(ItemStack item, int minAmount, int maxAmount, int chance)
	{
		WeightedRandomChestContent chest = new WeightedRandomChestContent(item, minAmount, maxAmount, chance);
		for(int i = 0; i < dungeonChests.length; i++)
		{
			ChestGenHooks.getInfo(dungeonChests[i]).addItem(chest);
		}
	}
}
