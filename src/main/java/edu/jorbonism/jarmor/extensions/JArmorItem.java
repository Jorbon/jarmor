package edu.jorbonism.jarmor.extensions;

import java.util.UUID;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.Item;

public class JArmorItem extends ArmorItem {
	private static final UUID[] MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"), UUID.fromString("26d12d90-c029-4b9c-a2bf-c088cfc99afd")};
	public static final double KB_RESIST_PER_WEIGHT = 0.002;
	
	protected int weight;
	protected final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

	public JArmorItem(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
		super(material, slot, settings);

		if (material instanceof JArmorMaterial) this.weight = ((JArmorMaterial)material).getWeight(slot);
		else this.weight = 0;

		Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
		UUID uUID = MODIFIERS[(slot.getType() == EquipmentSlot.Type.HAND) ? 4 : slot.getEntitySlotId()];
		builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUID, "Armor modifier", (double)this.getProtection(), EntityAttributeModifier.Operation.ADDITION));
		builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uUID, "Armor toughness", (double)this.getToughness(), EntityAttributeModifier.Operation.ADDITION));
		builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uUID, "Armor knockback resistance", this.weight * KB_RESIST_PER_WEIGHT, EntityAttributeModifier.Operation.ADDITION));
		builder.put(JEntityAttributes.GENERIC_ENCUMBRANCE, new EntityAttributeModifier(uUID, "Armor encumbrance", (double)this.weight, EntityAttributeModifier.Operation.ADDITION));
  
		this.attributeModifiers = builder.build();
	}

	public static JArmorItem fromArmorItem(ArmorItem m) {
		JArmorMaterial j = JArmorMaterials.fromArmorMaterial(m.getMaterial());
		Item.Settings settings = (new Item.Settings()).group(m.getGroup());
		if (m.isFireproof()) settings.fireproof();

		if (m instanceof DyeableArmorItem)
			return new JDyeableArmorItem(j, m.getSlotType(), settings);
		return new JArmorItem(j, m.getSlotType(), settings);
	}
}
