
package net.havensgaming.pemts.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.havensgaming.pemts.entity.MaowEntity;
import net.havensgaming.pemts.client.model.Modelnocsy_cat_fallen;

public class MaowRenderer extends MobRenderer<MaowEntity, Modelnocsy_cat_fallen<MaowEntity>> {
	public MaowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnocsy_cat_fallen(context.bakeLayer(Modelnocsy_cat_fallen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaowEntity entity) {
		return new ResourceLocation("pemts:textures/entities/maowtexture2.png");
	}

}
