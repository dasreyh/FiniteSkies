// Date: 8/13/2016 5:43:15 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package finiteskies.fsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelEntityMusketBullet extends ModelBase
{
    ModelRenderer body;
    ModelRenderer chest;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer tail;
    protected float childYOffset = 13.0F;
    protected float childZOffset = 0.0F;
  
  public ModelEntityMusketBullet()
  {
	    textureWidth = 128;
	    textureHeight = 64;
      
    body = new ModelRenderer(this, 0, 0);
    body.addBox(-5F, 0F, 0F, 10, 10, 24);
    body.setRotationPoint(0F, 6F, -12F);
    body.setTextureSize(128, 64);
    body.mirror = true;
    setRotation(body, 0F, 0F, 0F);
    chest = new ModelRenderer(this, 44, 0);
    chest.addBox(-3F, -12F, -2F, 6, 15, 6);
    chest.setRotationPoint(0F, 10F, -11F);
    chest.setTextureSize(128, 64);
    chest.mirror = true;
    setRotation(chest, 0F, 0F, 0F);
    neck = new ModelRenderer(this, 94, 9);
    neck.addBox(-2.5F, -2F, -1.533333F, 5, 2, 3);
    neck.setRotationPoint(0F, -2F, -10F);
    neck.setTextureSize(128, 64);
    neck.mirror = true;
    setRotation(neck, 0F, 0F, 0F);
    head = new ModelRenderer(this, 93, 0);
    head.addBox(-2.5F, -4F, -2F, 5, 4, 4);
    head.setRotationPoint(0F, -4F, -10F);
    head.setTextureSize(128, 64);
    head.mirror = true;
    setRotation(head, 0F, 0F, 0F);
    nose = new ModelRenderer(this, 74, 9);
    nose.addBox(-1.5F, -2F, -4F, 3, 2, 2);
    nose.setRotationPoint(0F, -4F, -10F);
    nose.setTextureSize(128, 64);
    nose.mirror = true;
    setRotation(nose, 0F, 0F, 0F);
    ear1 = new ModelRenderer(this, 115, 0);
    ear1.addBox(-1F, -2F, 0F, 1, 2, 1);
    ear1.setRotationPoint(-1F, -8F, -11F);
    ear1.setTextureSize(128, 64);
    ear1.mirror = true;
    setRotation(ear1, 0F, 0F, 0F);
    ear2 = new ModelRenderer(this, 121, 0);
    ear2.addBox(0F, -2F, 0F, 1, 2, 1);
    ear2.setRotationPoint(1F, -8F, -11F);
    ear2.setTextureSize(128, 64);
    ear2.mirror = true;
    setRotation(ear2, 0F, 0F, 0F);
    leg1 = new ModelRenderer(this, 69, 18);
    leg1.addBox(-1.5F, 0F, -1.533333F, 3, 10, 3);
    leg1.setRotationPoint(3F, 14F, -9F);
    leg1.setTextureSize(128, 64);
    leg1.mirror = true;
    setRotation(leg1, 0F, 0F, 0F);
    leg2 = new ModelRenderer(this, 82, 18);
    leg2.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
    leg2.setRotationPoint(-3F, 14F, -9F);
    leg2.setTextureSize(128, 64);
    leg2.mirror = true;
    setRotation(leg2, 0F, 0F, 0F);
    leg3 = new ModelRenderer(this, 95, 18);
    leg3.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
    leg3.setRotationPoint(3F, 14F, 8F);
    leg3.setTextureSize(128, 64);
    leg3.mirror = true;
    setRotation(leg3, 0F, 0F, 0F);
    leg4 = new ModelRenderer(this, 108, 18);
    leg4.addBox(-1.5F, 0F, -1.5F, 3, 10, 3);
    leg4.setRotationPoint(-3F, 14F, 8F);
    leg4.setTextureSize(128, 64);
    leg4.mirror = true;
    setRotation(leg4, 0F, 0F, 0F);
    tail = new ModelRenderer(this, 72, 0);
    tail.addBox(-2.466667F, -2.466667F, -2F, 5, 4, 3);
    tail.setRotationPoint(0F, 7F, 12F);
    tail.setTextureSize(128, 64);
    tail.mirror = true;
    setRotation(tail, 0F, 0F, 0.0174533F);
      convertToChild(head, ear1);
      convertToChild(head, ear2);   
      convertToChild(head, nose);
//      convertToChild(neck, head);
      convertToChild(neck, head);
      convertToChild(body, chest);
     }  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    neck.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    tail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.rotateAngleX = f4 * 0.017453292F;
    this.neck.rotateAngleY = f3 * 0.017453292F;
    this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }
  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
     // move child rotation point to be relative to parent
     parChild.rotationPointX -= parParent.rotationPointX;
     parChild.rotationPointY -= parParent.rotationPointY;
     parChild.rotationPointZ -= parParent.rotationPointZ;
     // make rotations relative to parent
     parChild.rotateAngleX -= parParent.rotateAngleX;
     parChild.rotateAngleY -= parParent.rotateAngleY;
     parChild.rotateAngleZ -= parParent.rotateAngleZ;
     // create relationship
     parParent.addChild(parChild);
  }

}

