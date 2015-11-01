package thefreehigh.mods.DragonTech.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class DragonEgg extends Item {
	public DragonEgg()
	{
		setUnlocalizedName("DragonEgg");
		setTextureName(Lib.MODID + ":" + "DragonEgg");
		setCreativeTab(DragonTech.tabDragonTech);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(!par2World.isRemote)
		{
			par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.DragonEgg.txt"));
		}
		return par1ItemStack;
	}
}
