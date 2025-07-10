package com.wishtoday.er.mixin;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

import static net.minecraft.component.type.ConsumableComponents.food;

@Mixin(ConsumableComponents.class)
public class ConsumableComponentsMixin {
    @Shadow
    @Mutable
    @Final
    public static final ConsumableComponent ENCHANTED_GOLDEN_APPLE = food()
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 4),
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0),
                                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0),
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3)
                            )
                    )
            )
            .build();
}
