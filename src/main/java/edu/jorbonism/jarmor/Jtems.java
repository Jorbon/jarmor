package edu.jorbonism.jarmor;

import edu.jorbonism.jarmor.extensions.JArmorItem;
import edu.jorbonism.jarmor.extensions.JArmorMaterials;
import edu.jorbonism.jarmor.extensions.JDyeableArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShieldItem;

public class Jtems {
    public static final Item DRAGON_SCALE = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item MITHRIL_INGOT = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item MITHRIL_CHAIN = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item MITHRIL_SCALE = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item IRON_CHAIN = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item IRON_SCALE = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item GOLD_CHAIN = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item GOLD_SCALE = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	public static final Item DAEDRA_HEART = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));
	
	
	public static final Item STUDDED_LEATHER_HELMET = new JDyeableArmorItem(JArmorMaterials.STUDDED_LEATHER, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item STUDDED_LEATHER_CHESTPLATE = new JDyeableArmorItem(JArmorMaterials.STUDDED_LEATHER, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item STUDDED_LEATHER_LEGGINGS = new JDyeableArmorItem(JArmorMaterials.STUDDED_LEATHER, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item STUDDED_LEATHER_BOOTS = new JDyeableArmorItem(JArmorMaterials.STUDDED_LEATHER, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item HIDE_HELMET = new JArmorItem(JArmorMaterials.HIDE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item HIDE_CHESTPLATE = new JArmorItem(JArmorMaterials.HIDE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item HIDE_LEGGINGS = new JArmorItem(JArmorMaterials.HIDE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item HIDE_BOOTS = new JArmorItem(JArmorMaterials.HIDE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item IRON_SCALE_HELMET = new JArmorItem(JArmorMaterials.IRON_SCALE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item IRON_SCALE_CHESTPLATE = new JArmorItem(JArmorMaterials.IRON_SCALE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item IRON_SCALE_LEGGINGS = new JArmorItem(JArmorMaterials.IRON_SCALE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item IRON_SCALE_BOOTS = new JArmorItem(JArmorMaterials.IRON_SCALE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item IRON_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT));

	public static final Item DIAMOND_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT));

	public static final Item GOLD_CHAIN_HELMET = new JArmorItem(JArmorMaterials.GOLD_CHAIN, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item GOLD_CHAIN_CHESTPLATE = new JArmorItem(JArmorMaterials.GOLD_CHAIN, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item GOLD_CHAIN_LEGGINGS = new JArmorItem(JArmorMaterials.GOLD_CHAIN, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item GOLD_CHAIN_BOOTS = new JArmorItem(JArmorMaterials.GOLD_CHAIN, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item GOLD_SCALE_HELMET = new JArmorItem(JArmorMaterials.GOLD_SCALE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item GOLD_SCALE_CHESTPLATE = new JArmorItem(JArmorMaterials.GOLD_SCALE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item GOLD_SCALE_LEGGINGS = new JArmorItem(JArmorMaterials.GOLD_SCALE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item GOLD_SCALE_BOOTS = new JArmorItem(JArmorMaterials.GOLD_SCALE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item GOLD_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT));

	public static final Item DRAGON_SCALE_HELMET = new JArmorItem(JArmorMaterials.DRAGON_SCALE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DRAGON_SCALE_CHESTPLATE = new JArmorItem(JArmorMaterials.DRAGON_SCALE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DRAGON_SCALE_LEGGINGS = new JArmorItem(JArmorMaterials.DRAGON_SCALE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DRAGON_SCALE_BOOTS = new JArmorItem(JArmorMaterials.DRAGON_SCALE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DRAGON_SCALE_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT).fireproof());

	public static final Item NETHERITE_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT).fireproof());

	public static final Item MITHRIL_CHAIN_HELMET = new JArmorItem(JArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_CHAIN_CHESTPLATE = new JArmorItem(JArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_CHAIN_LEGGINGS = new JArmorItem(JArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_CHAIN_BOOTS = new JArmorItem(JArmorMaterials.MITHRIL_CHAIN, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item MITHRIL_SCALE_HELMET = new JArmorItem(JArmorMaterials.MITHRIL_SCALE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_SCALE_CHESTPLATE = new JArmorItem(JArmorMaterials.MITHRIL_SCALE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_SCALE_LEGGINGS = new JArmorItem(JArmorMaterials.MITHRIL_SCALE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_SCALE_BOOTS = new JArmorItem(JArmorMaterials.MITHRIL_SCALE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));

	public static final Item MITHRIL_HELMET = new JArmorItem(JArmorMaterials.MITHRIL_PLATE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_CHESTPLATE = new JArmorItem(JArmorMaterials.MITHRIL_PLATE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_LEGGINGS = new JArmorItem(JArmorMaterials.MITHRIL_PLATE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_BOOTS = new JArmorItem(JArmorMaterials.MITHRIL_PLATE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item MITHRIL_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT));

	public static final Item DAEDRIC_HELMET = new JArmorItem(JArmorMaterials.DAEDRIC, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DAEDRIC_CHESTPLATE = new JArmorItem(JArmorMaterials.DAEDRIC, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DAEDRIC_LEGGINGS = new JArmorItem(JArmorMaterials.DAEDRIC, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DAEDRIC_BOOTS = new JArmorItem(JArmorMaterials.DAEDRIC, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof());
	public static final Item DAEDRIC_SHIELD = new ShieldItem((new Item.Settings()).maxDamage(90).group(ItemGroup.COMBAT).fireproof());
}
