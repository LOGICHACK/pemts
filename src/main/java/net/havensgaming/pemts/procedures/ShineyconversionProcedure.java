package net.havensgaming.pemts.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.havensgaming.pemts.init.PemtsModEntities;
import net.havensgaming.pemts.entity.ShinymoffEntity;
import net.havensgaming.pemts.entity.ShinymaowEntity;
import net.havensgaming.pemts.entity.ShineypemtEntity;
import net.havensgaming.pemts.entity.ShineykibblesEntity;
import net.havensgaming.pemts.entity.PemtEntity;
import net.havensgaming.pemts.entity.MoffEntity;
import net.havensgaming.pemts.entity.MaowEntity;
import net.havensgaming.pemts.entity.KibblesEntity;

public class ShineyconversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean canCapture = false;
		if (entity instanceof PemtEntity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ShineypemtEntity(PemtsModEntities.SHINEYPEMT, _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			entity.clearFire();
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			if (entity instanceof MoffEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ShinymoffEntity(PemtsModEntities.SHINYMOFF, _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.clearFire();
				if (!entity.level().isClientSide())
					entity.discard();
			} else {
				if (entity instanceof KibblesEntity) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ShineykibblesEntity(PemtsModEntities.SHINEYKIBBLES, _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					entity.clearFire();
					if (!entity.level().isClientSide())
						entity.discard();
				} else {
					if (entity instanceof MaowEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ShinymaowEntity(PemtsModEntities.SHINYMAOW, _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						if (!entity.level().isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}
