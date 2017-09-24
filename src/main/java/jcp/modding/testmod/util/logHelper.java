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

package jcp.modding.testmod.util;

import cpw.mods.fml.common.FMLLog;
import jcp.modding.testmod.Reference;
import org.apache.logging.log4j.Level;

public class logHelper {

    public static void log(Level loglevel, Object obj){
        FMLLog.log(Reference.MOD_ID, loglevel, String.valueOf(obj));
    }

    public static void all(Object obj) { log(Level.ALL, obj); }
    public static void debug(Object obj) { log(Level.DEBUG, obj); }
    public static void error(Object obj) { log(Level.ERROR, obj); }
    public static void fatal(Object obj) { log(Level.FATAL, obj); }
    public static void info(Object obj) { log(Level.INFO, obj); }
    public static void trace(Object obj) { log(Level.TRACE, obj); }
    public static void off(Object obj) { log(Level.OFF, obj); }
    public static void warn(Object obj) { log(Level.WARN, obj); }
}
