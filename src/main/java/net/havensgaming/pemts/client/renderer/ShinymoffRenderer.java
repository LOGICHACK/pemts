
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.ShinymoffEntity;
import net.havensgaming.pemts.client.model.Modelmoff;

public class ShinymoffRenderer extends MobRenderer<ShinymoffEntity, Modelmoff<ShinymoffEntity>> {
	public ShinymoffRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoff(context.bakeLayer(Modelmoff.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShinymoffEntity entity) {
		return new ResourceLocation("pemts:textures/entities/shineymofftexture.png");
	}

}
