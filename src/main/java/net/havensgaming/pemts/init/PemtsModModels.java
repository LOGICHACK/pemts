
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.havensgaming.pemts.client.model.Modelnocsy_fpv2_dog;
import net.havensgaming.pemts.client.model.Modelnocsy_cat_fallen;
import net.havensgaming.pemts.client.model.Modelmoff;
import net.havensgaming.pemts.client.model.Modelkibbles;
import net.havensgaming.pemts.client.model.Modelhampter_Converted;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PemtsModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelkibbles.LAYER_LOCATION, Modelkibbles::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelhampter_Converted.LAYER_LOCATION, Modelhampter_Converted::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelnocsy_cat_fallen.LAYER_LOCATION, Modelnocsy_cat_fallen::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelmoff.LAYER_LOCATION, Modelmoff::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelnocsy_fpv2_dog.LAYER_LOCATION, Modelnocsy_fpv2_dog::createBodyLayer);
	}
}
