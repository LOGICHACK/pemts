package net.havensgaming.pemts.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.havensgaming.pemts.init.PemtsModMobEffects;
import net.havensgaming.pemts.init.PemtsModItems;
import net.havensgaming.pemts.init.PemtsModEntities;
import net.havensgaming.pemts.entity.SuitmanEntity;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class LhmaskRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PemtsModItems.LHMASK);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, new ItemStack(PemtsModItems.LHMASK));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(PemtsModItems.LHMASK));
			}
		}
		(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 10);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 400) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("The Mask Feels Tight"), true);
						new Object() {
							private int ticks = 0;

							public void startDelay(LevelAccessor world) {
								ServerTickEvents.END_SERVER_TICK.register((server) -> {
									this.ticks++;
									if (this.ticks == 400) {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Its closing your mouth"), true);
										entity.setAirSupply(5);
										new Object() {
											private int ticks = 0;

											public void startDelay(LevelAccessor world) {
												ServerTickEvents.END_SERVER_TICK.register((server) -> {
													this.ticks++;
													if (this.ticks == 400) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("You Can't breath"), true);
														entity.setAirSupply(0);
														if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
															_entity.addEffect(new MobEffectInstance(PemtsModMobEffects.SUFFACATE, 400, 1));
														return;
													}
												});
											}
										}.startDelay(world);
										new Object() {
											private int ticks = 0;

											public void startDelay(LevelAccessor world) {
												ServerTickEvents.END_SERVER_TICK.register((server) -> {
													this.ticks++;
													if (this.ticks == 600) {
														if (world instanceof ServerLevel _level) {
															Entity entityToSpawn = new SuitmanEntity(PemtsModEntities.SUITMAN, _level);
															entityToSpawn.moveTo(x, y, z, 0, 0);
															entityToSpawn.setYBodyRot(0);
															entityToSpawn.setYHeadRot(0);
															entityToSpawn.setDeltaMovement(0, 0, 0);
															if (entityToSpawn instanceof Mob _mobToSpawn)
																_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
															_level.addFreshEntity(entityToSpawn);
														}
														if (entity instanceof LivingEntity _entity)
															_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
																@Override
																public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
																	String _translatekey = "death.attack." + "lhmask";
																	if (this.getEntity() == null && this.getDirectEntity() == null) {
																		return _msgEntity.getKillCredit() != null
																				? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
																				: Component.translatable(_translatekey, _msgEntity.getDisplayName());
																	} else {
																		Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
																		ItemStack _itemstack = ItemStack.EMPTY;
																		if (this.getEntity() instanceof LivingEntity _livingentity)
																			_itemstack = _livingentity.getMainHandItem();
																		return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
																				? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
																				: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
																	}
																}
															}, 50);
														return;
													}
												});
											}
										}.startDelay(world);
										return;
									}
								});
							}
						}.startDelay(world);
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
