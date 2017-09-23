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

package jcp.modding.testmod.IGO.blocks;

import jcp.modding.testmod.Reference;
import jcp.modding.testmod.init;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TestBlock2 extends Block {

    public TestBlock2(Material material, float hardness, float resistance, String name, String tool, int lvl, Block.SoundType soundType) {
        super(material);
        setCreativeTab(init.tabJCM);
        setHardness(hardness);
        setResistance(resistance);
        setBlockName(name);
        setHarvestLevel(tool, lvl);
        setBlockTextureName(Reference.MODID + ":" + name);
        setStepSound(soundType);
    }
}
