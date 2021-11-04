package edu.jorbonism.jarmor.mixin;

import java.util.Iterator;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import edu.jorbonism.jarmor.extensions.JArmorItem;
import edu.jorbonism.jarmor.extensions.JArmorMaterials;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {
	
	@Inject(method = "wearsGoldArmor(Lnet/minecraft/entity/LivingEntity;)Z", at = @At("HEAD"), cancellable = true)
	public static void wearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> ci) {
		Iterable<ItemStack> iterable = entity.getArmorItems();
		Iterator<ItemStack> iterator = iterable.iterator();

		Item item;
		while(iterator.hasNext()) {
			ItemStack itemStack = (ItemStack)iterator.next();
			item = itemStack.getItem();
			
			if ((item instanceof JArmorItem && (
						((ArmorItem)item).getMaterial() == JArmorMaterials.GOLD_CHAIN
					 || ((ArmorItem)item).getMaterial() == JArmorMaterials.GOLD_SCALE
					 || ((ArmorItem)item).getMaterial() == JArmorMaterials.GOLD_PLATE
				)) || (item instanceof ArmorItem && ((ArmorItem)item).getMaterial() == ArmorMaterials.GOLD)) {

				ci.setReturnValue(true);
				ci.cancel();
			}
		}

		ci.setReturnValue(false);
		ci.cancel();


	}
}
