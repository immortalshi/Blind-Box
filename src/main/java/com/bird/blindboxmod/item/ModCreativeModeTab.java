package com.bird.blindboxmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BB_TAB = new CreativeModeTab("blindboxtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.GOLD_COIN.get());
        }
    };
}
