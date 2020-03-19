package io.github.motschen.simplystrawberrys;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SadStrawberry extends Item {

    public SadStrawberry(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand){
        PlayerEntity.playSound(SoundEvents.ENTITY_GHAST_AMBIENT, 1.0F, 1.0F);
        PlayerEntity.addMessage(new LiteralText("Instagram: @motschenyt @vxle_ntin"), true);
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
    }

}
