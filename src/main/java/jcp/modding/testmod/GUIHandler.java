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

package jcp.modding.testmod;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.omg.CORBA.Object;

public class GUIHandler implements IGuiHandler {

    public enum GuiIDs{
        TEST_ID;
    }


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (GuiIDs.values()[ID]){
            case TEST_ID:
                return null;
        }
        throw new IllegalArgumentException("[SERVER] * No GUI with ID " + ID + " *");
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (GuiIDs.values()[ID]){
            case TEST_ID:
                return null;
        }
        throw new IllegalArgumentException("[CLIENT] * No GUI with ID " + ID + " *");
    }
}

