
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.havensgaming.pemts.PemtsMod;

public class PemtsModPotions {
	public static Potion SAUCE;

	public static void load() {
		SAUCE = Registry.register(BuiltInRegistries.POTION, new ResourceLocation(PemtsMod.MODID, "sauce"), new Potion(new MobEffectInstance(PemtsModMobEffects.SPICED, 3600, 0, false, true)));
	}
}
