
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.CreamhampterEntity;
import net.havensgaming.pemts.client.model.Modelhampter_Converted;

public class CreamhampterRenderer extends MobRenderer<CreamhampterEntity, Modelhampter_Converted<CreamhampterEntity>> {
	public CreamhampterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhampter_Converted(context.bakeLayer(Modelhampter_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CreamhampterEntity entity) {
		return new ResourceLocation("pemts:textures/entities/europianhamptertexture.png");
	}

}
