package edu.jorbonism.jarmor.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import edu.jorbonism.jarmor.Jarmor;
import edu.jorbonism.jarmor.Jtems;
import edu.jorbonism.jarmor.extensions.JArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Mixin(Items.class)
public class ItemsMixin {
    @ModifyArgs(method = "register(Lnet/minecraft/util/Identifier;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/registry/Registry;register(Lnet/minecraft/util/registry/Registry;Lnet/minecraft/util/Identifier;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;"))
    public void convertToJarmor(Args args) {
        Item item = args.get(2);

        if (item instanceof ArmorItem) {
            args.set(2, JArmorItem.fromArmorItem((ArmorItem)item));

            if (((ArmorItem)item).getSlotType() == EquipmentSlot.HEAD) {
                switch (((ArmorItem)item).getMaterial().getName()) {
                    case "chainmail":
                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_helmet"), Jtems.STUDDED_LEATHER_HELMET);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_chestplate"), Jtems.STUDDED_LEATHER_CHESTPLATE);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_leggings"), Jtems.STUDDED_LEATHER_LEGGINGS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "studded_leather_boots"), Jtems.STUDDED_LEATHER_BOOTS);
                    
                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_helmet"), Jtems.HIDE_HELMET);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_chestplate"), Jtems.HIDE_CHESTPLATE);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_leggings"), Jtems.HIDE_LEGGINGS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "hide_boots"), Jtems.HIDE_BOOTS);
                    break;
                    case "iron":
                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_helmet"), Jtems.IRON_SCALE_HELMET);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_chestplate"), Jtems.IRON_SCALE_CHESTPLATE);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_leggings"), Jtems.IRON_SCALE_LEGGINGS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale_boots"), Jtems.IRON_SCALE_BOOTS);
                    break;
                    case "diamond":
                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_shield"), Jtems.IRON_SHIELD);
                    break;
                    case "gold":
                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "diamond_shield"), Jtems.DIAMOND_SHIELD);

                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_helmet"), Jtems.GOLD_CHAIN_HELMET);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_chestplate"), Jtems.GOLD_CHAIN_CHESTPLATE);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_leggings"), Jtems.GOLD_CHAIN_LEGGINGS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain_boots"), Jtems.GOLD_CHAIN_BOOTS);

                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_helmet"), Jtems.GOLD_SCALE_HELMET);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_chestplate"), Jtems.GOLD_SCALE_CHESTPLATE);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_leggings"), Jtems.GOLD_SCALE_LEGGINGS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale_boots"), Jtems.GOLD_SCALE_BOOTS);
                    break;
                    case "netherite":
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_shield"), Jtems.GOLD_SHIELD);

                    Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_helmet"), Jtems.DRAGON_SCALE_HELMET);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_chestplate"), Jtems.DRAGON_SCALE_CHESTPLATE);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_leggings"), Jtems.DRAGON_SCALE_LEGGINGS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_boots"), Jtems.DRAGON_SCALE_BOOTS);
		            Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale_shield"), Jtems.DRAGON_SCALE_SHIELD);
                    break;
                }
            }
        } else if (item instanceof ShieldItem) {
            
        }
    }
}
