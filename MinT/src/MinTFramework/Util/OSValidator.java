/*
 * Copyright (C) 2015 Software&System Lab. Kangwon National University.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package MinTFramework.Util;

/**
 *
 * @author soobin Jeon <j.soobin@gmail.com>, chungsan Lee <dj.zlee@gmail.com>,
 * youngtak Han <gksdudxkr@gmail.com>
 */
public class OSValidator {
  
    private static String OS = System.getProperty("os.name").toLowerCase();
    
    public static void printOS(){
        System.out.println("OS: "+OS);
    }
    public static boolean isWindows() {
  
        return (OS.indexOf("win") >= 0);
  
    }
  
    public static boolean isMac() {
  
        return (OS.indexOf("mac") >= 0);
  
    }
  
    public static boolean isUnix() {
  
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
  
    }
  
    public static boolean isSolaris() {
  
        return (OS.indexOf("sunos") >= 0);
  
    }
}
