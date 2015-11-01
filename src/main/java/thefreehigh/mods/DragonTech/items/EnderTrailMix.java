package thefreehigh.mods.DragonTech.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;

public class EnderTrailMix extends ItemFood {
	
	public EnderTrailMix() {
	    super(1, 2.0f, false);
	    setUnlocalizedName("EnderTrailMix");
		setTextureName(Lib.MODID + ":" + "EnderTrailMix");
		setCreativeTab(DragonTech.tabDragonTech);
		setAlwaysEdible();
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	        if (!world.isRemote)
	        {
	        	
	        }
	}
}
