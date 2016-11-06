package com.ewyboy.powerhouse;

import net.minecraft.block.Block;

/**
 * Created by EwyBoy
 **/
public class BlockLoader {

    public static Block PowerHousing;

    public static void loadBlocks() {
        PowerHousing = new PowerHousing();
    }
}
