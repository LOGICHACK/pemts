
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.havensgaming.pemts.client.renderer.WinterhamRenderer;
import net.havensgaming.pemts.client.renderer.SuitmanRenderer;
import net.havensgaming.pemts.client.renderer.ShinymoffRenderer;
import net.havensgaming.pemts.client.renderer.ShinymaowRenderer;
import net.havensgaming.pemts.client.renderer.ShineypemtRenderer;
import net.havensgaming.pemts.client.renderer.ShineykibblesRenderer;
import net.havensgaming.pemts.client.renderer.SculkhampterRenderer;
import net.havensgaming.pemts.client.renderer.PemtRenderer;
import net.havensgaming.pemts.client.renderer.OraneghampterRenderer;
import net.havensgaming.pemts.client.renderer.MoffRenderer;
import net.havensgaming.pemts.client.renderer.MaowRenderer;
import net.havensgaming.pemts.client.renderer.KibblesRenderer;
import net.havensgaming.pemts.client.renderer.GreyhampterRenderer;
import net.havensgaming.pemts.client.renderer.CreamhampterRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PemtsModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(PemtsModEntities.PEMT, PemtRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.SHINEYPEMT, ShineypemtRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.ORANEGHAMPTER, OraneghampterRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.WINTERHAM, WinterhamRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.CREAMHAMPTER, CreamhampterRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.GREYHAMPTER, GreyhampterRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.KIBBLES, KibblesRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.MOFF, MoffRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.SHINYMOFF, ShinymoffRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.SHINEYKIBBLES, ShineykibblesRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.SCULKHAMPTER, SculkhampterRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.MAOW, MaowRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.SHINYMAOW, ShinymaowRenderer::new);
		EntityRendererRegistry.register(PemtsModEntities.SUITMAN, SuitmanRenderer::new);
	}
}
