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
 *
 * @author HanYoungTak
 */
public enum DeviceType {
    TEMPERATURE("TEMPERATURE"), 
    HUMIDITY("HUMIDITY"), 
    TEMPHUMI("TEMPHUMI"), 
    ULTRASONIC("ULTRASONIC"), 
    MAGNETIC("MAGNETIC"), 
    GYRO("GYRO"), 
    SERVMOTOR("SERVMOTOR"), 
    DUST("DUST"),
    CO2("CO2"),
    PHOTOGRAPH("PHOTOGRAPH"),
    LED("LED"),
    ILLUMINATION("ILLUMINATION"),
    
    BLE("BLE"),
    WIFI("WIFI"), 
    NFC("NFC"), 
    BLUETOOTH("BLUETOOTH"),
    
    NONE("NONE");
    
    private String deviceType;
    
    private DeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }
    
    public String getDeviceTypeString()
    {
        return deviceType;
    }
    
    public DeviceType getDeviceType(DeviceType type){
        return DeviceType.valueOf(type.getDeviceTypeString());
    }
    
    public boolean isSameDeivce(String dname){
        return deviceType.equals(dname);
    }
    
    public static DeviceType getDeviceType(String dtype){
        for(DeviceType dt : DeviceType.values()){
            if(dt.getDeviceTypeString().equals(dtype))
                return dt;
        }
        return NONE;
    }
}
