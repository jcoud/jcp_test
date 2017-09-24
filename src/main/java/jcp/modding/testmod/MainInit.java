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
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import jcp.modding.testmod.IGO.jcmBlocks_init;
import jcp.modding.testmod.IGO.jcmTileEntitys_init;
import jcp.modding.testmod.proxy.iProxy;
import jcp.modding.testmod.util.logHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION, dependencies = Reference.DEPENDENCIES)
public class MainInit {

    @Mod.Instance(Reference.MOD_ID)
    public static MainInit instance = new MainInit();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static iProxy proxy;

    @Mod.EventHandler
    public static void preInint(FMLPreInitializationEvent event) {
        logHelper.info("TEST 123 TEXT ==============================");

        jcmBlocks_init.init();
        jcmTileEntitys_init.init();
    }

    @Mod.EventHandler
    public static void Inint(FMLInitializationEvent event) {
        System.out.println("JCM INIT. STEP 2");
    }

    @Mod.EventHandler
    public static void postInint(FMLPostInitializationEvent event) {
        System.out.println("JCM POST INIT. STEP 3");
    }


    public static CreativeTabs tabJCM = new CreativeTabs("jcm_tab") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(jcmBlocks_init.test_block_1).getItem();
        }
    };


}
