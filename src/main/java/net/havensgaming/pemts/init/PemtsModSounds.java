
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PemtsModSounds {
	public static SoundEvent ANGY = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "angy"));
	public static SoundEvent NEUTREL = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "neutrel"));
	public static SoundEvent ANGGY = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "anggy"));
	public static SoundEvent AMNIENT = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "amnient"));
	public static SoundEvent SQUEK = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "squek"));
	public static SoundEvent WEIRD = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "weird"));
	public static SoundEvent KIBBLNOISE = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "kibblnoise"));
	public static SoundEvent LHSREAM = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "lhsream"));
	public static SoundEvent LUNASCREAM = SoundEvent.createVariableRangeEvent(new ResourceLocation("pemts", "lunascream"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "angy"), ANGY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "neutrel"), NEUTREL);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "anggy"), ANGGY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "amnient"), AMNIENT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "squek"), SQUEK);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "weird"), WEIRD);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "kibblnoise"), KIBBLNOISE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "lhsream"), LHSREAM);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pemts", "lunascream"), LUNASCREAM);
	}
}
