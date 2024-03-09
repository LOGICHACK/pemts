
package net.havensgaming.pemts.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.havensgaming.pemts.procedures.SaucedProcedure;

public class SpicedMobEffect extends MobEffect {
	public SpicedMobEffect() {
		super(MobEffectCategory.HARMFUL, -10079488);
	}

	@Override
	public String getDescriptionId() {
		return "effect.pemts.spiced";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SaucedProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
