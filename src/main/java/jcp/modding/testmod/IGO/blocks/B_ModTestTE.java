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

import jcp.modding.testmod.IGO.TIleEntity.TE_ModTestTE;
import jcp.modding.testmod.IGO.TIleEntity.TestBlockTileEnt;
import jcp.modding.testmod.MainInit;
import jcp.modding.testmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class B_ModTestTE extends TestBlockTileEnt {


    public B_ModTestTE(Material material, float hardness, float resistance, String name, String tool, int lvl, Block.SoundType soundType) {
        super(material);
        setCreativeTab(MainInit.tabJCM);
        setHardness(hardness);
        setResistance(resistance);
        setBlockName(name);
        setHarvestLevel(tool, lvl);
        setBlockTextureName(Reference.MOD_ID + ":" + name);
        setStepSound(soundType);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TE_ModTestTE();
    }
}
