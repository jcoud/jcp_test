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

import jcp.modding.testmod.IGO.blocks.TestBlock1;
import jcp.modding.testmod.RegHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class jcmBlocksInit {

    public static Block test_block_1;

    public static void init() {

        test_block_1 = new TestBlock1(Material.wood, 1f, 10f, "test_block_1", "pickaxe", 1, Block.soundTypeWood);
        reg(test_block_1);

    }

    public static void reg(Block block) {
        RegHelper.reg(block);
    }

}
