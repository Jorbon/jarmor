package edu.jorbonism.jarmor.extensions;

import java.util.function.Supplier;

import edu.jorbonism.jarmor.Jtems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

public enum JArmorMaterials implements JArmorMaterial {
	HIDE("hide", 5, new int[]{1, 2, 2, 1, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, new int[]{4, 8, 8, 4, 8}, () -> { return Ingredient.ofItems(Items.LEATHER); }),
	LEATHER("leather", 5, new int[]{1, 2, 3, 1, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, new int[]{2, 3, 5, 2, 8}, () -> { return Ingredient.ofItems(Items.LEATHER); }),
	STUDDED_LEATHER("studded_leather", 10, new int[]{2, 3, 4, 2, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, new int[]{7, 11, 14, 8, 8}, () -> { return Ingredient.ofItems(Items.LEATHER); }),
	DIAMOND("diamond", 27, new int[]{2, 4, 6, 2, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f, new int[]{10, 20, 30, 12, 24}, () -> { return Ingredient.ofItems(Items.DIAMOND); }),
	DRAGON_SCALE("dragon_scale", 48, new int[]{2, 5, 6, 3, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 6f, new int[]{6, 16, 20, 10, 16}, () -> { return Ingredient.ofItems(Jtems.DRAGON_SCALE); }),
	MITHRIL_CHAIN("mithril_chain", 27, new int[]{2, 4, 6, 2, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1f, new int[]{0, 0, 0, 0, 0}, () -> { return Ingredient.ofItems(Jtems.MITHRIL_CHAIN); }),
	MITHRIL_SCALE("mithril_scale", 30, new int[]{2, 5, 6, 3, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2f, new int[]{0, 0, 0, 0, 0}, () -> { return Ingredient.ofItems(Jtems.MITHRIL_SCALE); }),
	MITHRIL_PLATE("mithril_plate", 33, new int[]{2, 6, 7, 3, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3f, new int[]{0, 0, 0, 0, 0}, () -> { return Ingredient.ofItems(Jtems.MITHRIL_INGOT); }),
	IRON_CHAIN("iron_chain", 14, new int[]{2, 4, 6, 2, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1f, new int[]{18, 32, 50, 20, 60}, () -> { return Ingredient.ofItems(Jtems.IRON_CHAIN); }),
	IRON_SCALE("iron_scale", 17, new int[]{2, 5, 6, 3, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2f, new int[]{20, 50, 60, 30, 60}, () -> { return Ingredient.ofItems(Jtems.IRON_SCALE); }),
	IRON_PLATE("iron_plate", 20, new int[]{2, 6, 7, 3, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3f, new int[]{23, 60, 82, 35}, () -> { return Ingredient.ofItems(Items.IRON_INGOT); }),
	GOLD_CHAIN("gold_chain", 5, new int[]{1, 2, 4, 1, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0f, new int[]{20, 55, 80, 25, 100}, () -> { return Ingredient.ofItems(Jtems.GOLD_CHAIN); }),
	GOLD_SCALE("gold_scale", 9, new int[]{1, 3, 4, 1, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0f, new int[]{30, 75, 110, 35, 100}, () -> { return Ingredient.ofItems(Jtems.GOLD_SCALE); }),
	GOLD_PLATE("gold_plate", 7, new int[]{1, 3, 5, 2, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, new int[]{40, 85, 125, 50, 100}, () -> { return Ingredient.ofItems(Items.GOLD_INGOT); }),
	NETHERITE("netherite", 37, new int[]{3, 6, 8, 3, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, new int[]{27, 54, 72, 27, 60}, () -> { return Ingredient.ofItems(Items.NETHERITE_INGOT); }),
	DAEDRIC("daedric", 60, new int[]{3, 7, 10, 4, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6f, new int[]{40, 85, 125, 50, 100}, () -> { return Ingredient.ofItems(Jtems.DAEDRA_HEART); }),
	TURTLE("turtle", 25, new int[]{2, 5, 6, 2, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0f, new int[]{10, 20, 16, 6, 16}, () -> { return Ingredient.ofItems(Items.SCUTE); });

	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] protectionAmounts;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final int[] weightAmounts;
	private final Lazy<Ingredient> repairIngredientSupplier;

	private JArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, int[] weightAmounts, Supplier<Ingredient> repairIngredientSupplier) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionAmounts = protectionAmounts;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.weightAmounts = weightAmounts;
		this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
	}

	public static JArmorMaterial fromArmorMaterial(ArmorMaterial m) {
		switch (m.getName()) {
			case "leather": return JArmorMaterials.LEATHER;
			case "chainmail": return JArmorMaterials.IRON_CHAIN;
			case "iron": return JArmorMaterials.IRON_PLATE;
			case "gold": return JArmorMaterials.GOLD_PLATE;
			case "diamond": return JArmorMaterials.DIAMOND;
			case "turtle": return JArmorMaterials.TURTLE;
			case "netherite": return JArmorMaterials.NETHERITE;
			default: return JArmorMaterials.LEATHER;
		}
	}

	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[(slot.getType() == EquipmentSlot.Type.HAND) ? 4 : slot.getEntitySlotId()] * this.durabilityMultiplier;
	}

	public int getProtectionAmount(EquipmentSlot slot) {
		return this.protectionAmounts[(slot.getType() == EquipmentSlot.Type.HAND) ? 4 : slot.getEntitySlotId()];
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredientSupplier.get();
	}

	public String getName() {
		return this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return 0;
	}

	public int getWeight(EquipmentSlot slot) {
		return this.weightAmounts[(slot.getType() == EquipmentSlot.Type.HAND) ? 4 : slot.getEntitySlotId()];
	}
}
