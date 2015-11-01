package thefreehigh.mods.DragonTech.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import thefreehigh.lib.MathUtils;
import thefreehigh.mods.DragonTech.items.*;
import thefreehigh.mods.DragonTech.items.armor.*;

public class ItemManager
{
	//Item List
	public static Item enderStar;
	public static Item dragonStar;
	public static Item dragonScale;
	public static Item dragonEgg;
	public static Item soulbinder;
	public static Item dragonScaleHelmet;
	public static Item dragonScaleChestplate;
	public static Item dragonScaleLeggings;
	public static Item dragonScaleBoots;
	public static Item enderTrailMix;
	
	//Init Method
	public static void init()
	{
		addItems();
		//addDungeonLoot(d);
	}
	
	private static void addItems()
	{
		enderStar = new EnderStar();
		GameRegistry.registerItem(enderStar, "enderStar");
		
		dragonStar = new DragonStar();
		GameRegistry.registerItem(dragonStar, "dragonStar");
		
		dragonScale = new DragonScale();
		GameRegistry.registerItem(dragonScale, "dragonScale");
		
		dragonEgg = new DragonEgg();
		GameRegistry.registerItem(dragonEgg, "dragonEgg");
		
		soulbinder = new Soulbinder();
		GameRegistry.registerItem(soulbinder, "soulbinder");
		
		dragonScaleHelmet = new ScalesArmor("DragonScaleHelmet", 0);
		GameRegistry.registerItem(dragonScaleHelmet, "dragonScaleHelmet");
		
		dragonScaleChestplate = new ScalesArmor("DragonScaleChestplate", 1);
		GameRegistry.registerItem(dragonScaleChestplate, "dragonScaleChestplate");
		
		dragonScaleLeggings = new ScalesArmor("DragonScaleLeggings", 2);
		GameRegistry.registerItem(dragonScaleLeggings, "dragonScaleLeggings");
		
		dragonScaleBoots = new ScalesArmor("DragonScaleBoots", 3);
		GameRegistry.registerItem(dragonScaleBoots, "dragonScalesBoots");
		
		enderTrailMix = new EnderTrailMix();
		GameRegistry.registerItem(enderTrailMix, "enderTrailMix");
	}
	
	/*private static void addDungeonLoot(int d)
	{
		d = MathUtils.clamp(d, 1, 3);
		ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH,
			new WeightedRandomChestContent(new ItemStack(dragonEgg), 1, 1, d * d * d * 4));
		
		ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH,
			new WeightedRandomChestContent(new ItemStack(nightnyEgg), 1, 1, d * d * 12));
		
		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY,
			new WeightedRandomChestContent(new ItemStack(dragonEgg), 1, 1, d * d * d * 3));
		
		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY,
			new WeightedRandomChestContent(new ItemStack(nightnyEgg), 1, 1, d * d * 10));
		
		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR,
			new WeightedRandomChestContent(new ItemStack(dragonEgg), 1, 1, d * d * d * 2));
		
		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR,
			new WeightedRandomChestContent(new ItemStack(nightnyEgg), 1, 1, d * d * 5));
		
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST,
			new WeightedRandomChestContent(new ItemStack(nightnyEgg), 1, 1, d * d * d * 2));
	}*/
}
