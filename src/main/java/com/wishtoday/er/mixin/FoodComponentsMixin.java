package com.wishtoday.er.mixin;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(FoodComponents.class)
public class FoodComponentsMixin {
    @Final
    @Shadow
    @Mutable
    public static FoodComponent ENCHANTED_GOLDEN_APPLE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F)
            .alwaysEdible()
            .build();
}
