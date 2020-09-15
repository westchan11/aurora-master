package me.memeszz.aurora.mixin.accessor;

import net.minecraft.item.ItemStack;

public interface IItemRenderer {

    float getPrevEquippedProgressMainHand();

    void setEquippedProgressMainHand(float progress);

    float getPrevEquippedProgressOffHand();

    void setEquippedProgressOffHand(float progress);

    void setItemStackMainHand(ItemStack stack);

    void setItemStackOffHand(ItemStack stack);


}
