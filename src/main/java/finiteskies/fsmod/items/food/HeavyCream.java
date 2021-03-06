package finiteskies.fsmod.items.food;

import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class HeavyCream extends ItemFood{

	public HeavyCream() {
		super(5, 0.7F, false);
		setUnlocalizedName(Reference.FiniteItems.HEAVYCREAM.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.HEAVYCREAM.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
		//add give jar back when crafting with this item in table
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 128;
    }
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300, 1));
        super.onFoodEaten(stack, worldIn, player);
    }
}
