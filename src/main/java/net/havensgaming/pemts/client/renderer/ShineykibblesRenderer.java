
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.ShineykibblesEntity;
import net.havensgaming.pemts.client.model.Modelkibbles;

public class ShineykibblesRenderer extends MobRenderer<ShineykibblesEntity, Modelkibbles<ShineykibblesEntity>> {
	public ShineykibblesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkibbles(context.bakeLayer(Modelkibbles.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShineykibblesEntity entity) {
		return new ResourceLocation("pemts:textures/entities/shineykibblestexture.png");
	}

}
