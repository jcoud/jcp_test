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

public class Reference {

    public static final String MOD_ID = "jcm";
    public static final String NAME = "Jcoud's test mod";
    public static final String VERSION = "1.7.10-v.0.1";
    public static final String ACCEPTED_VERSION = "1.7.10";
    public static final String DEPENDENCIES = "required-after:Forge@[10.13.4.1614]";

    public static final String CLIENT_PROXY_CLASS = "jcp.modding.testmod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "jcp.modding.testmod.proxy.ServerProxy";

}
