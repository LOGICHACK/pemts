
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.ShinymaowEntity;
import net.havensgaming.pemts.client.model.Modelnocsy_cat_fallen;

public class ShinymaowRenderer extends MobRenderer<ShinymaowEntity, Modelnocsy_cat_fallen<ShinymaowEntity>> {
	public ShinymaowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnocsy_cat_fallen(context.bakeLayer(Modelnocsy_cat_fallen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShinymaowEntity entity) {
		return new ResourceLocation("pemts:textures/entities/maowtextureshiney.png");
	}

}
