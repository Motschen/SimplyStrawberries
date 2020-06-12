package io.github.motschen.simplystrawberrys;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;

public class LootModifier {

    public static void init() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (id.getPath().contains("chests") && id.getPath().contains("village")) {
                FabricLootPoolBuilder strawberry = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootTableRange.between(0, 5))
                    .withCondition(RandomChanceLootCondition.builder(1.0f).build())
                    .with(ItemEntry.builder(SimplyStrawberrys.Strawberry));
                supplier.pool(strawberry);
            }
        });
    }
}