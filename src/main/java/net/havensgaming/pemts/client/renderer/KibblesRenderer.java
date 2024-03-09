
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.KibblesEntity;
import net.havensgaming.pemts.client.model.Modelkibbles;

public class KibblesRenderer extends MobRenderer<KibblesEntity, Modelkibbles<KibblesEntity>> {
	public KibblesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkibbles(context.bakeLayer(Modelkibbles.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KibblesEntity entity) {
		return new ResourceLocation("pemts:textures/entities/kibblestexture.png");
	}

}
