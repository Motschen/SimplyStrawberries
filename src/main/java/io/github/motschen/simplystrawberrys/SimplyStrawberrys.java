package io.github.motschen.simplystrawberrys;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SimplyStrawberrys implements ModInitializer {

    public static final Item Strawberry = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(2f).build()));
    public static final Item SadStrawberry = new SadStrawberry(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
    public static final Block StrawberryBush = new StrawberryBush();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("simplystrawberrys","strawberry"), Strawberry);
        Registry.register(Registry.ITEM, new Identifier("simplystrawberrys","strawberryseed"), new AliasedBlockItem(StrawberryBush, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("simplystrawberrys","sad_strawberry"), SadStrawberry);
        Registry.register(Registry.BLOCK, new Identifier("simplystrawberrys","strawberrybush"), StrawberryBush);
        LootModifier.init();
    }
}
