
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.GreyhampterEntity;
import net.havensgaming.pemts.client.model.Modelhampter_Converted;

public class GreyhampterRenderer extends MobRenderer<GreyhampterEntity, Modelhampter_Converted<GreyhampterEntity>> {
	public GreyhampterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhampter_Converted(context.bakeLayer(Modelhampter_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreyhampterEntity entity) {
		return new ResourceLocation("pemts:textures/entities/hamptertexture.png");
	}

}
