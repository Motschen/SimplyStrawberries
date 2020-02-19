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
                FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder();
                builder.withRolls(UniformLootTableRange.between(0, 5));
                builder.withCondition(RandomChanceLootCondition.builder(1.0f));
                builder.withEntry(ItemEntry.builder(SimplyStrawberrys.Strawberry));
                supplier.withPool(builder);
            }
        });
    }
}