package io.github.motschen.simplystrawberrys;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;

public class StrawberryBush extends CropBlock {

    public StrawberryBush() {
        super(FabricBlockSettings.copy(Blocks.BEETROOTS).build());
    }

}
