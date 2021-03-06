/*
 * Copyright (C) 2015 HanYoungTak
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
package MinTFramework.ExternalDevice;

/**
 * Classification the all devices.
 * Sensor, Network, Control
 *
 * @author HanYoungTak
 */
public enum DeviceClassification {
    SENSOR("SENSOR"), NETWORK("NETWORK"), CONTROL("CONTROL");
    
    private String deviceClassification;
    
    private DeviceClassification(String deviceClass)
    {
        this.deviceClassification = deviceClass;
    }
    
    public String getDeviceClassifcation()
    {
        return deviceClassification;
    }
}
