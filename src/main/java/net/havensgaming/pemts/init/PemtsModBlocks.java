
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.havensgaming.pemts.block.KibbleoreBlock;
import net.havensgaming.pemts.block.BaitBlock;
import net.havensgaming.pemts.PemtsMod;

public class PemtsModBlocks {
	public static Block KIBBLEORE;
	public static Block BAIT;

	public static void load() {
		KIBBLEORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PemtsMod.MODID, "kibbleore"), new KibbleoreBlock());
		BAIT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PemtsMod.MODID, "bait"), new BaitBlock());
	}

	public static void clientLoad() {
		KibbleoreBlock.clientInit();
		BaitBlock.clientInit();
	}
}
