package thefreehigh.mods.BlocksNItems.items.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;
import net.minecraftforge.common.util.EnumHelper;
import thefreehigh.lib.StringHelper;
import thefreehigh.mods.DragonTech.DragonTech;
import thefreehigh.mods.DragonTech.Lib;
import thefreehigh.mods.DragonTech.manager.ItemManager;
 
public class TFHArmor extends ItemArmor implements ISpecialArmor
{
	public static ArmorMaterial ARMOR_DSCALE = EnumHelper.addArmorMaterial("ARMOR_DSCALE", 20, new int[] {3, 8, 6, 3}, 30);
	
	public String textureName = "dragonScaleArmor";
	
	public TFHArmor(String unlocalizedName, int armorType)
	{
		super(ARMOR_DSCALE, 0, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(DragonTech.tabDragonTech);
		this.setTextureName(Lib.MODID + ":" + unlocalizedName);
	}
	
	public String getArmorTexture(ItemStack armorPiece, Entity entity, int slot, String layer)
	{
		/*if((armorPiece.getItem() == ItemManager.dragonScaleHelmet) || (armorPiece.getItem() == ItemManager.dragonScaleChestplate) || (armorPiece.getItem() == ItemManager.dragonScaleBoots))
		{
			return "tutorialmod:textures/models/armor/tutorialArmor_1.png";
		}
		if(armorPiece.getItem() == ItemManager.dragonScaleLeggings)
		{
			return "tutorialmod:textures/models/armor/tutorialArmor_2.png";
		}*/
		return Lib.MODID + ":textures/models/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
		if(source == source.inFire || source == source.lava || source == source.onFire) { //Check for fire damage, you can use other types of damage too.
			return new ArmorProperties(1, 1, MathHelper.floor_double(damage * .25D));
		}
		return new ArmorProperties(0, 0, 0);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armorPiece, int slot) {
		if(armorPiece.getItem() == ItemManager.dragonScaleHelmet)
		{
			return 3;
		}
		if(armorPiece.getItem() == ItemManager.dragonScaleChestplate)
		{
			return 8;
		}
		if(armorPiece.getItem() == ItemManager.dragonScaleLeggings)
		{
			return 6;
		}
		if (armorPiece.getItem() == ItemManager.dragonScaleBoots)
		{
			return 3;
		}
		return 0;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
		stack.damageItem(damage * 2, entity);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if (itemStack != null)
		{
			if (itemStack.getItem().equals(ItemManager.dragonScaleHelmet)){
				player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 40));
			}
			if (itemStack.getItem().equals(ItemManager.dragonScaleChestplate)){
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 40));
			
				if (
					player.getCurrentArmor(3) != null &&
					player.getCurrentArmor(3).getItem().equals(ItemManager.dragonScaleHelmet) &&
					player.getCurrentArmor(2) != null &&
					player.getCurrentArmor(2).getItem().equals(ItemManager.dragonScaleChestplate) &&
					player.getCurrentArmor(1) != null &&
					player.getCurrentArmor(1).getItem().equals(ItemManager.dragonScaleLeggings) &&
					player.getCurrentArmor(0) != null &&
					player.getCurrentArmor(0).getItem().equals(ItemManager.dragonScaleBoots)
				)
				{
					player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 40));
					player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 40));
					player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 40));
				}
			}
			if (itemStack.getItem().equals(ItemManager.dragonScaleLeggings)){
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 40));
			}
			if (itemStack.getItem().equals(ItemManager.dragonScaleBoots)){
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 40));
			}
		}
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
		return stack.getItem() == ItemManager.dragonScale; //Alllows certain items to repair this armor.
	}
}