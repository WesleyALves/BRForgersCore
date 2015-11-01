package thefreehigh.mods.DragonTech.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class DragonScale extends Item
{
	public DragonScale()
	{
		setUnlocalizedName("DragonScale");
		setTextureName(Lib.MODID + ":" + "DragonScale");
		setCreativeTab(DragonTech.tabDragonTech);
	}
}
