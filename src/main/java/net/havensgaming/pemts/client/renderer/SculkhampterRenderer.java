
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.SculkhampterEntity;
import net.havensgaming.pemts.client.model.Modelhampter_Converted;

public class SculkhampterRenderer extends MobRenderer<SculkhampterEntity, Modelhampter_Converted<SculkhampterEntity>> {
	public SculkhampterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhampter_Converted(context.bakeLayer(Modelhampter_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SculkhampterEntity entity) {
		return new ResourceLocation("pemts:textures/entities/sculkhamptertexture.png");
	}

}
