
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.WinterhamEntity;
import net.havensgaming.pemts.client.model.Modelhampter_Converted;

public class WinterhamRenderer extends MobRenderer<WinterhamEntity, Modelhampter_Converted<WinterhamEntity>> {
	public WinterhamRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhampter_Converted(context.bakeLayer(Modelhampter_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WinterhamEntity entity) {
		return new ResourceLocation("pemts:textures/entities/winterhamptertexture.png");
	}

}
