
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.MoffEntity;
import net.havensgaming.pemts.client.model.Modelmoff;

public class MoffRenderer extends MobRenderer<MoffEntity, Modelmoff<MoffEntity>> {
	public MoffRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoff(context.bakeLayer(Modelmoff.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoffEntity entity) {
		return new ResourceLocation("pemts:textures/entities/mofftexture.png");
	}

}
