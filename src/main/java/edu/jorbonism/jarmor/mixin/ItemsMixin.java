package edu.jorbonism.jarmor.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import edu.jorbonism.jarmor.Jarmor;
import edu.jorbonism.jarmor.Jtems;
import edu.jorbonism.jarmor.extensions.JArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Mixin(Items.class)
public class ItemsMixin {
	@Inject(method = "register(Lnet/minecraft/util/Identifier;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;", at = @At(value = "HEAD"), cancellable = true)
	private static void convertToJarmor(Identifier id, Item item, CallbackInfoReturnable<Item> ci) {
		if (item instanceof BlockItem) ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);

		if (item instanceof ArmorItem) {
			ci.setReturnValue(Registry.register(Registry.ITEM, id, JArmorItem.fromArmorItem((ArmorItem)item)));

			if (((ArmorItem)item).getSlotType() == EquipmentSlot.FEET) {
				switch (((ArmorItem)item).getMaterial().getName()) {
				case "leather":
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_helmet"), Jtems.STUDDED_LEATHER_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_chestplate"), Jtems.STUDDED_LEATHER_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_leggings"), Jtems.STUDDED_LEATHER_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_boots"), Jtems.STUDDED_LEATHER_BOOTS);
					
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_helmet"), Jtems.HIDE_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_chestplate"), Jtems.HIDE_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_leggings"), Jtems.HIDE_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_boots"), Jtems.HIDE_BOOTS);
				break; case "chainmail":
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_helmet"), Jtems.IRON_SCALE_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_chestplate"), Jtems.IRON_SCALE_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_leggings"), Jtems.IRON_SCALE_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_boots"), Jtems.IRON_SCALE_BOOTS);
				break; case "iron":
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_shield"), Jtems.IRON_SHIELD);
				break; case "diamond":
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "diamond_shield"), Jtems.DIAMOND_SHIELD);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_helmet"), Jtems.GOLD_CHAIN_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_chestplate"), Jtems.GOLD_CHAIN_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_leggings"), Jtems.GOLD_CHAIN_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_boots"), Jtems.GOLD_CHAIN_BOOTS);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_helmet"), Jtems.GOLD_SCALE_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_chestplate"), Jtems.GOLD_SCALE_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_leggings"), Jtems.GOLD_SCALE_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_boots"), Jtems.GOLD_SCALE_BOOTS);
				break; case "gold":
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_shield"), Jtems.GOLD_SHIELD);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_helmet"), Jtems.DRAGON_SCALE_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_chestplate"), Jtems.DRAGON_SCALE_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_leggings"), Jtems.DRAGON_SCALE_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_boots"), Jtems.DRAGON_SCALE_BOOTS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_shield"), Jtems.DRAGON_SCALE_SHIELD);
				break; case "netherite":
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "netherite_shield"), Jtems.NETHERITE_SHIELD);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_chain_helmet"), Jtems.MITHRIL_CHAIN_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_chain_chestplate"), Jtems.MITHRIL_CHAIN_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_chain_leggings"), Jtems.MITHRIL_CHAIN_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_chain_boots"), Jtems.MITHRIL_CHAIN_BOOTS);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_scale_helmet"), Jtems.MITHRIL_SCALE_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_scale_chestplate"), Jtems.MITHRIL_SCALE_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_scale_leggings"), Jtems.MITHRIL_SCALE_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_scale_boots"), Jtems.MITHRIL_SCALE_BOOTS);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_helmet"), Jtems.MITHRIL_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_chestplate"), Jtems.MITHRIL_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_leggings"), Jtems.MITHRIL_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_boots"), Jtems.MITHRIL_BOOTS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_shield"), Jtems.MITHRIL_SHIELD);

					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "daedric_helmet"), Jtems.DAEDRIC_HELMET);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "daedric_chestplate"), Jtems.DAEDRIC_CHESTPLATE);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "daedric_leggings"), Jtems.DAEDRIC_LEGGINGS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "daedric_boots"), Jtems.DAEDRIC_BOOTS);
					Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "daedric_shield"), Jtems.DAEDRIC_SHIELD);
				break;
				}
			}

			ci.cancel();
		} else if (item instanceof ShieldItem) {
			
		}
	}
}
