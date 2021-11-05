package edu.jorbonism.jarmor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/*
TO DO:
LivingEntity and PlayerEntity mixins to standardize shield behavior
implement effects of weight
make shields count as armor
crafting recipes
loot tables
make shield models work
nice textures
nice sounds
*/

public class Jarmor implements ModInitializer {

	public static final String MODID = "jarmor";

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "iron_chain"), Jtems.IRON_CHAIN);
		Registry.register(Registry.ITEM, new Identifier(MODID, "iron_scale"), Jtems.IRON_SCALE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "gold_chain"), Jtems.GOLD_CHAIN);
		Registry.register(Registry.ITEM, new Identifier(MODID, "gold_scale"), Jtems.GOLD_SCALE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "dragon_scale"), Jtems.DRAGON_SCALE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_ingot"), Jtems.MITHRIL_INGOT);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_chain"), Jtems.MITHRIL_CHAIN);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_scale"), Jtems.MITHRIL_SCALE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "daedra_heart"), Jtems.DAEDRA_HEART);

		Registry.register(Registry.ITEM, new Identifier(MODID, "netherite_shield"), Jtems.NETHERITE_SHIELD);

		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_chain_helmet"), Jtems.MITHRIL_CHAIN_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_chain_chestplate"), Jtems.MITHRIL_CHAIN_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_chain_leggings"), Jtems.MITHRIL_CHAIN_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_chain_boots"), Jtems.MITHRIL_CHAIN_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_scale_helmet"), Jtems.MITHRIL_SCALE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_scale_chestplate"), Jtems.MITHRIL_SCALE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_scale_leggings"), Jtems.MITHRIL_SCALE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_scale_boots"), Jtems.MITHRIL_SCALE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_helmet"), Jtems.MITHRIL_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_chestplate"), Jtems.MITHRIL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_leggings"), Jtems.MITHRIL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_boots"), Jtems.MITHRIL_BOOTS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "mithril_shield"), Jtems.MITHRIL_SHIELD);

		Registry.register(Registry.ITEM, new Identifier(MODID, "daedric_helmet"), Jtems.DAEDRIC_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MODID, "daedric_chestplate"), Jtems.DAEDRIC_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MODID, "daedric_leggings"), Jtems.DAEDRIC_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "daedric_boots"), Jtems.DAEDRIC_BOOTS);
		Registry.register(Registry.ITEM, new Identifier(MODID, "daedric_shield"), Jtems.DAEDRIC_SHIELD);
		

		System.out.println("Jarmor initialized!");
	}
}
