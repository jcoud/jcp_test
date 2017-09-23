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

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event;
import jcp.modding.testmod.IGO.jcmBlocksInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class init {

    public static Item jcm_tab_logo;

    @Mod.EventHandler
    public void preInint(FMLPreInitializationEvent event) {
        System.out.println("JCM PRE INIT. STEP 1");

        jcmBlocksInit.init();
    }

    @Mod.EventHandler
    public void Inint(FMLInitializationEvent event) {
        System.out.println("JCM INIT. STEP 2");
    }

    @Mod.EventHandler
    public void postInint(FMLPostInitializationEvent event) {
        System.out.println("JCM POST INIT. STEP 3");
    }


    public static CreativeTabs tabJCM = new CreativeTabs("jcm_tab") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(jcmBlocksInit.test_block_1).getItem();
        }
    };


}
