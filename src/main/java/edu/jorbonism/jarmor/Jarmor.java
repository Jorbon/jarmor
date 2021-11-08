package edu.jorbonism.jarmor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/*
TO DO:
implement effects of weight
	hunger penalties curve
	movement speed curve
		walking
		sprinting
		swimming
	rocket boosting
	sneaking nameplate
	sinking speed in fluids
	
fix shield models (BuiltinModelItemRenderer)
LivingEntity and PlayerEntity mixins to standardize shield behavior
make shields count as armor
crafting recipes
loot tables
nice textures
nice sounds
*/

public class Jarmor implements ModInitializer {

	public static final String MODID = "jarmor";
	public static final double KB_RESIST_PER_WEIGHT = 0.002;
	public static final double WEIGHT_FULL_SPEED = 100;
	public static final double WEIGHT_HALF_SPEED = 300;
	public static final double WEIGHT_MAX_EXHAUSTION = 300;
	public static final double MAX_EXHAUSTION = 1.5;
	public static final double MIN_EXHAUSTION = 0.5;


	public static double getKBResist(double weight) {
		return weight * KB_RESIST_PER_WEIGHT;
	}

	public static double getSpeedMultiplier(double weight) {
		if (weight <= WEIGHT_FULL_SPEED) return 1;
		return 1 - (weight - WEIGHT_FULL_SPEED) / (weight - 2*WEIGHT_FULL_SPEED + WEIGHT_HALF_SPEED);
	}

	public static double getExhaustionMultiplier(double weight) {
		if (weight >= WEIGHT_MAX_EXHAUSTION) return MAX_EXHAUSTION;
		double a = weight / WEIGHT_MAX_EXHAUSTION - 1;
		return MAX_EXHAUSTION + (MIN_EXHAUSTION - MAX_EXHAUSTION) * a*a;
	}


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_chain"), Jtems.IRON_CHAIN);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "iron_scale"), Jtems.IRON_SCALE);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_chain"), Jtems.GOLD_CHAIN);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "gold_scale"), Jtems.GOLD_SCALE);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "dragon_scale"), Jtems.DRAGON_SCALE);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_ingot"), Jtems.MITHRIL_INGOT);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_chain"), Jtems.MITHRIL_CHAIN);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "mithril_scale"), Jtems.MITHRIL_SCALE);
		Registry.register(Registry.ITEM, new Identifier(Jarmor.MODID, "daedra_heart"), Jtems.DAEDRA_HEART);

		System.out.println("Jarmor initialized!");
	}
}
