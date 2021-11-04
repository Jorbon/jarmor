package edu.jorbonism.jarmor.extensions;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.Item;

public class JDyeableArmorItem extends JArmorItem implements DyeableItem {
	public JDyeableArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Item.Settings settings) {
		super(armorMaterial, equipmentSlot, settings);
	}
}
