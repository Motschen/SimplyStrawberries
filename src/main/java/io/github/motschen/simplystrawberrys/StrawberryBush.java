package io.github.motschen.simplystrawberrys;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;

public class StrawberryBush extends CropBlock {

    public StrawberryBush() {
        super(FabricBlockSettings.copy(Blocks.BEETROOTS));
    }

}
