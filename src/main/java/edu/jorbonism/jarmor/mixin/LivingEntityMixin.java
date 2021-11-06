package edu.jorbonism.jarmor.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import edu.jorbonism.jarmor.extensions.JEntityAttributes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
	LivingEntityMixin(EntityType<? extends LivingEntity> type, World world) { super(type, world); }
	
	@Inject(method = "createLivingAttributes()Lnet/minecraft/entity/attribute/DefaultAttributeContainer/Builder;", at = @At("HEAD"), cancellable = true)
	private static void createLivingAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> ci) {
		ci.setReturnValue(DefaultAttributeContainer.builder().add(EntityAttributes.GENERIC_MAX_HEALTH).add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE).add(EntityAttributes.GENERIC_MOVEMENT_SPEED).add(EntityAttributes.GENERIC_ARMOR).add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS).add(JEntityAttributes.GENERIC_ENCUMBRANCE));
		ci.cancel();
	}

	@Inject(method = "travel(Lnet/minecraft/util/math/Vec3d;)V", at = @At("HEAD"), cancellable = true)
	private void travelWithWeight(Vec3d movementInput, CallbackInfo ci) {
		
	}

}
