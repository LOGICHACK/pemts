
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.havensgaming.pemts.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.havensgaming.pemts.entity.WinterhamEntity;
import net.havensgaming.pemts.entity.SuitmanEntity;
import net.havensgaming.pemts.entity.ShinymoffEntity;
import net.havensgaming.pemts.entity.ShinymaowEntity;
import net.havensgaming.pemts.entity.ShineypemtEntity;
import net.havensgaming.pemts.entity.ShineykibblesEntity;
import net.havensgaming.pemts.entity.SculkhampterEntity;
import net.havensgaming.pemts.entity.PemtEntity;
import net.havensgaming.pemts.entity.OraneghampterEntity;
import net.havensgaming.pemts.entity.MoffEntity;
import net.havensgaming.pemts.entity.MaowEntity;
import net.havensgaming.pemts.entity.KibblesEntity;
import net.havensgaming.pemts.entity.GreyhampterEntity;
import net.havensgaming.pemts.entity.CreamhampterEntity;
import net.havensgaming.pemts.PemtsMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class PemtsModEntities {
	public static EntityType<PemtEntity> PEMT;
	public static EntityType<ShineypemtEntity> SHINEYPEMT;
	public static EntityType<OraneghampterEntity> ORANEGHAMPTER;
	public static EntityType<WinterhamEntity> WINTERHAM;
	public static EntityType<CreamhampterEntity> CREAMHAMPTER;
	public static EntityType<GreyhampterEntity> GREYHAMPTER;
	public static EntityType<KibblesEntity> KIBBLES;
	public static EntityType<MoffEntity> MOFF;
	public static EntityType<ShinymoffEntity> SHINYMOFF;
	public static EntityType<ShineykibblesEntity> SHINEYKIBBLES;
	public static EntityType<SculkhampterEntity> SCULKHAMPTER;
	public static EntityType<MaowEntity> MAOW;
	public static EntityType<ShinymaowEntity> SHINYMAOW;
	public static EntityType<SuitmanEntity> SUITMAN;

	public static void load() {
		PEMT = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "pemt"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, PemtEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		PemtEntity.init();
		FabricDefaultAttributeRegistry.register(PEMT, PemtEntity.createAttributes());
		SHINEYPEMT = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "shineypemt"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, ShineypemtEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ShineypemtEntity.init();
		FabricDefaultAttributeRegistry.register(SHINEYPEMT, ShineypemtEntity.createAttributes());
		ORANEGHAMPTER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "oraneghampter"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, OraneghampterEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		OraneghampterEntity.init();
		FabricDefaultAttributeRegistry.register(ORANEGHAMPTER, OraneghampterEntity.createAttributes());
		WINTERHAM = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "winterham"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, WinterhamEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		WinterhamEntity.init();
		FabricDefaultAttributeRegistry.register(WINTERHAM, WinterhamEntity.createAttributes());
		CREAMHAMPTER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "creamhampter"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, CreamhampterEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CreamhampterEntity.init();
		FabricDefaultAttributeRegistry.register(CREAMHAMPTER, CreamhampterEntity.createAttributes());
		GREYHAMPTER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "greyhampter"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, GreyhampterEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GreyhampterEntity.init();
		FabricDefaultAttributeRegistry.register(GREYHAMPTER, GreyhampterEntity.createAttributes());
		KIBBLES = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "kibbles"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, KibblesEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		KibblesEntity.init();
		FabricDefaultAttributeRegistry.register(KIBBLES, KibblesEntity.createAttributes());
		MOFF = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "moff"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, MoffEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		MoffEntity.init();
		FabricDefaultAttributeRegistry.register(MOFF, MoffEntity.createAttributes());
		SHINYMOFF = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "shinymoff"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, ShinymoffEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ShinymoffEntity.init();
		FabricDefaultAttributeRegistry.register(SHINYMOFF, ShinymoffEntity.createAttributes());
		SHINEYKIBBLES = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "shineykibbles"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, ShineykibblesEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ShineykibblesEntity.init();
		FabricDefaultAttributeRegistry.register(SHINEYKIBBLES, ShineykibblesEntity.createAttributes());
		SCULKHAMPTER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "sculkhampter"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SculkhampterEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(256).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SculkhampterEntity.init();
		FabricDefaultAttributeRegistry.register(SCULKHAMPTER, SculkhampterEntity.createAttributes());
		MAOW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "maow"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, MaowEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		MaowEntity.init();
		FabricDefaultAttributeRegistry.register(MAOW, MaowEntity.createAttributes());
		SHINYMAOW = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "shinymaow"),
				FabricEntityTypeBuilder.create(MobCategory.AMBIENT, ShinymaowEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ShinymaowEntity.init();
		FabricDefaultAttributeRegistry.register(SHINYMAOW, ShinymaowEntity.createAttributes());
		SUITMAN = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(PemtsMod.MODID, "suitman"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SuitmanEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SuitmanEntity.init();
		FabricDefaultAttributeRegistry.register(SUITMAN, SuitmanEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
