
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.PemtEntity;
import net.havensgaming.pemts.client.model.Modelnocsy_fpv2_dog;

public class PemtRenderer extends MobRenderer<PemtEntity, Modelnocsy_fpv2_dog<PemtEntity>> {
	public PemtRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnocsy_fpv2_dog(context.bakeLayer(Modelnocsy_fpv2_dog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PemtEntity entity) {
		return new ResourceLocation("pemts:textures/entities/pempttexture.png");
	}

}
