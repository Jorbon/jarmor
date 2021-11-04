package edu.jorbonism.jarmor.extensions;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;

public interface JArmorMaterial extends ArmorMaterial {
	int getWeight(EquipmentSlot slot);
}
