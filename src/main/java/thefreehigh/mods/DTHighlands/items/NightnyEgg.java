package thefreehigh.mods.DTHighlands.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import thefreehigh.mods.DTHighlands.DTHighlands;
import thefreehigh.mods.DTHighlands.Lib;

public class NightnyEgg extends Item {
	public NightnyEgg()
	{
		setUnlocalizedName("NightnyEgg");
		setTextureName(Lib.MODID + ":" + "NightnyEgg");
		setCreativeTab(DTHighlands.tabDTHighLands);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(!par2World.isRemote)
		{
			par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.NightnyEgg.txt"));
		}
		return par1ItemStack;
	}
}
