package edu.jorbonism.jarmor.extensions;

import edu.jorbonism.jarmor.Jarmor;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class JEntityAttributes extends EntityAttributes {
    public static final EntityAttribute GENERIC_ENCUMBRANCE = Registry.register(Registry.ATTRIBUTE, new Identifier(Jarmor.MODID, "generic.encumbrance"), (new ClampedEntityAttribute("attribute.name.generic.encumbrance", 0.0D, 0.0D, 10000.0D)).setTracked(true));
}
