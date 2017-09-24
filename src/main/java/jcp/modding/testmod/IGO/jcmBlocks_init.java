/**************************************************************************************************
 * A testmod for testing.                                                                         *
 * Copyright (C) 2017 Jcoud                                                                       *
 *                                                                                                *
 * This program is free software: you can redistribute it and/or modify                           *
 * it under the terms of the GNU General Public License as published by                           *
 * the Free Software Foundation, either version 3 of the License, or                              *
 * (at your option) any later version.                                                            *
 *                                                                                                *
 * This program is distributed in the hope that it will be useful,                                *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of                                 *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                                  *
 * GNU General Public License for more details.                                                   *
 *                                                                                                *
 * You should have received a copy of the GNU General Public License                              *
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.                          *
 **************************************************************************************************/

package jcp.modding.testmod.IGO;

import jcp.modding.testmod.IGO.blocks.B_ModTestTE;
import jcp.modding.testmod.IGO.blocks.TestBlock1;
import jcp.modding.testmod.IGO.blocks.TestBlock2;
import jcp.modding.testmod.util.RegHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class jcmBlocks_init {

    public static Block test_block_1;
    public static Block test_block_2;

    public static Block b_modtestTE;

    public static void init() {

        test_block_1 = new TestBlock1(Material.iron, 5f, 10f, "test_block_1", "axe", 3, Block.soundTypeMetal);
        reg(test_block_1);
        test_block_2 = new TestBlock2(Material.iron, 5f, 10f, "test_block_2", "axe", 3, Block.soundTypeMetal);
        reg(test_block_2);

        b_modtestTE = new B_ModTestTE(Material.iron, 10f, 20f,"b_modtestTE", "pickaxe", 3, Block.soundTypeGlass);
        reg(b_modtestTE);

    }

    public static void reg(Block block) {
        RegHelper.reg(block);
    }

}
