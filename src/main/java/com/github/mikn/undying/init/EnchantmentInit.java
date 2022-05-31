package com.github.mikn.undying.init;

import com.github.mikn.undying.enchantment.UndyingEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;

public class EnchantmentInit {
    public static final Enchantment UNDYING = new UndyingEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.CHEST);
}