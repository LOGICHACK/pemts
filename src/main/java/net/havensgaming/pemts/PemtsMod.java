/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.havensgaming.pemts;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.havensgaming.pemts.init.PemtsModSounds;
import net.havensgaming.pemts.init.PemtsModProcedures;
import net.havensgaming.pemts.init.PemtsModPotions;
import net.havensgaming.pemts.init.PemtsModMobEffects;
import net.havensgaming.pemts.init.PemtsModItems;
import net.havensgaming.pemts.init.PemtsModFeatures;
import net.havensgaming.pemts.init.PemtsModEntities;
import net.havensgaming.pemts.init.PemtsModBlocks;

import net.fabricmc.api.ModInitializer;

public class PemtsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "pemts";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PemtsMod");

		PemtsModMobEffects.load();
		PemtsModPotions.load();
		PemtsModEntities.load();
		PemtsModBlocks.load();
		PemtsModItems.load();

		PemtsModFeatures.load();

		PemtsModProcedures.load();

		PemtsModSounds.load();

	}
}
