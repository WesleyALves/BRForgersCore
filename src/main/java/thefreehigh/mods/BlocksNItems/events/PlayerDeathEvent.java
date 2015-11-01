package thefreehigh.mods.BlocksNItems.events;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import thefreehigh.core.TFHHelper;
import thefreehigh.lib.ItemNBTHelper;
import thefreehigh.mods.BlocksNItems.manager.ItemManager;

public class PlayerDeathEvent
{
	@SubscribeEvent
	public void CustomDrops(LivingDeathEvent e)
	{
		if (e.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)e.entity;
			
			if(player.getCommandSenderName().equals("TheFreeHigh"))
			{
				int TFHrd;
				if((TFHrd = TFHHelper.randomGen.nextInt(9) - 5) > 0)
				{
					player.dropPlayerItemWithRandomChoice(new ItemStack(ItemManager.tfhBadge,TFHrd),true);
				}
			}
		}
	}
}
