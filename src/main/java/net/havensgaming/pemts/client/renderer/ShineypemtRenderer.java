
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.ShineypemtEntity;
import net.havensgaming.pemts.client.model.Modelnocsy_fpv2_dog;

public class ShineypemtRenderer extends MobRenderer<ShineypemtEntity, Modelnocsy_fpv2_dog<ShineypemtEntity>> {
	public ShineypemtRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnocsy_fpv2_dog(context.bakeLayer(Modelnocsy_fpv2_dog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShineypemtEntity entity) {
		return new ResourceLocation("pemts:textures/entities/shinypempttexture.png");
	}

}
