
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.havensgaming.pemts.potion.SuffacateMobEffect;
import net.havensgaming.pemts.potion.SpicedMobEffect;
import net.havensgaming.pemts.PemtsMod;

public class PemtsModMobEffects {
	public static MobEffect SUFFACATE;
	public static MobEffect SPICED;

	public static void load() {
		SUFFACATE = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(PemtsMod.MODID, "suffacate"), new SuffacateMobEffect());
		SPICED = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(PemtsMod.MODID, "spiced"), new SpicedMobEffect());
	}
}
