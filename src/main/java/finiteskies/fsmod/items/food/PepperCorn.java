package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class PepperCorn extends ItemFood {
	public PepperCorn() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.PEPPERCORN.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.PEPPERCORN.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 15;
    }
}
