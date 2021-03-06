package finiteskies.fsmod.entity;


import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityAlpaca extends EntityAnimal {

	public EntityAlpaca(World worldIn) {
		super(worldIn);		
		/*		
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(0, new EntityAITempt(this, 0.3d, Items.BEETROOT_SEEDS, false));
		this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityPlayer.class, 2.0f, 0.4d, 0.4d));
		this.tasks.addTask(1, new EntityAIWander(this, 0.3d));
		this.tasks.addTask(2, new EntityAILookIdle(this)); 
		*/
		this.setSize(2.0F, 2.0F);
	}
    @Override
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAITempt(this, 1.25D, Items.CARROT, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));

        
    }
	public boolean isAIEnabled() {
		return true;
	}
	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }
	protected Item getDropItem() {
		return Items.STRING;
	
	}
	protected void dropRareItem() {
		this.dropItem(Items.LEATHER, 5);
	}
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SHEEP_AMBIENT;
		
	}
	protected SoundEvent getHurtSound() {
		return SoundEvents.ENTITY_SHEEP_HURT;
		
	}
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SHEEP_DEATH;
		
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		
		return new EntityAlpaca(this.world);
	}
	@Override
    public float getEyeHeight()
    {
        return this.isChild() ? this.height : 0.4F;
    }

}

