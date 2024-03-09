/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.havensgaming.pemts.item.SunflowerseedItem;
import net.havensgaming.pemts.item.SkullItem;
import net.havensgaming.pemts.item.SeasoningItem;
import net.havensgaming.pemts.item.LhmaskItem;
import net.havensgaming.pemts.item.KibbleItem;
import net.havensgaming.pemts.item.HandItem;
import net.havensgaming.pemts.item.FuudItem;
import net.havensgaming.pemts.item.FleshItem;
import net.havensgaming.pemts.PemtsMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PemtsModItems {
	public static Item PEMT_SPAWN_EGG;
	public static Item FUUD;
	public static Item SKULL;
	public static Item FLESH;
	public static Item HAND;
	public static Item SEASONING;
	public static Item SUNFLOWERSEED;
	public static Item KIBBLE;
	public static Item KIBBLEORE;
	public static Item KIBBLES_SPAWN_EGG;
	public static Item MOFF_SPAWN_EGG;
	public static Item BAIT;
	public static Item LHMASK;
	public static Item MAOW_SPAWN_EGG;

	public static void load() {
		PEMT_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "pemt_spawn_egg"), new SpawnEggItem(PemtsModEntities.PEMT, -16711936, -16750951, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(PEMT_SPAWN_EGG));
		FUUD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "fuud"), new FuudItem());
		SKULL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "skull"), new SkullItem());
		FLESH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "flesh"), new FleshItem());
		HAND = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "hand"), new HandItem());
		SEASONING = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "seasoning"), new SeasoningItem());
		SUNFLOWERSEED = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "sunflowerseed"), new SunflowerseedItem());
		KIBBLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "kibble"), new KibbleItem());
		KIBBLEORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "kibbleore"), new BlockItem(PemtsModBlocks.KIBBLEORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(KIBBLEORE));
		KIBBLES_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "kibbles_spawn_egg"), new SpawnEggItem(PemtsModEntities.KIBBLES, -39322, -3407872, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(KIBBLES_SPAWN_EGG));
		MOFF_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "moff_spawn_egg"), new SpawnEggItem(PemtsModEntities.MOFF, -10027060, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(MOFF_SPAWN_EGG));
		BAIT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "bait"), new BlockItem(PemtsModBlocks.BAIT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(content -> content.accept(BAIT));
		LHMASK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "lhmask"), new LhmaskItem());
		MAOW_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PemtsMod.MODID, "maow_spawn_egg"), new SpawnEggItem(PemtsModEntities.MAOW, -16711732, -13057, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(MAOW_SPAWN_EGG));
	}

	public static void clientLoad() {
	}
}
