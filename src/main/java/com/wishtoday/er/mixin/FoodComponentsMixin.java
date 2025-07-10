package com.wishtoday.er.mixin;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
            .nutrition(6)
            .saturationModifier(1.2F)
            .alwaysEdible()
            .build();
}
