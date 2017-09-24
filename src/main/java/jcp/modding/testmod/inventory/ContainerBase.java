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

package jcp.modding.testmod.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerBase extends Container {

    @Override
    public boolean canInteractWith(EntityPlayer player){
        return false;
    }

    protected void addPlayerSlots(InventoryPlayer playerInvernt, int x, int y, int slotIndexStart){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 9; j++){
                addSlotToContainer(new Slot(playerInvernt, j + i * 9 + slotIndexStart + 9, x + j * 10, y + i * 10));
            }
        }

        for (int i = 0; i < 9; i++){
            addSlotToContainer(new Slot(playerInvernt, i + slotIndexStart, x + i * 10, y + 142));
        }
    }
}
