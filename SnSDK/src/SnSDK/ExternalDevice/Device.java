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
package SnSDK.ExternalDevice;

import java.util.ArrayList;

/**
 *
 * @author soobin Jeon <j.soobin@gmail.com>, chungsan Lee <dj.zlee@gmail.com>,
 * youngtak Han <gksdudxkr@gmail.com>
 */
public class Device {

    protected ArrayList<PortPinSet> ppSet = new ArrayList<>();
    private String Library_Name = null;

    public Device(String _LibName) {
        super();
        Library_Name = _LibName;
    }

    /**
     * Initiallize Sensor
     * - It loads library
     */
    public void initDevice() {
        LoadLibrary();
    }

    /**
     * Load Library
     *
     * @return true, Library Load Success
     */
    protected boolean LoadLibrary() {
        try {
            System.loadLibrary(Library_Name);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    protected String getLibraryName() {
        return this.Library_Name;
    }
    
    /**
     * Regist using Port, Pin number
     * - add port, pin set
    */
    public void registPortPin(int port, int pin)
    {
        ppSet.add(new PortPinSet(port, pin));
    }
    
    public void registUARTPortPin(int uartNumber)
    {
        PortPinSet uartTx = null;
        PortPinSet uartRx = null;
        switch(uartNumber)
        {
            case 1:
                uartTx = new PortPinSet(9, 24);
                uartRx = new PortPinSet(9, 26);
                break;
            case 2:
                uartTx = new PortPinSet(9, 21);
                uartRx = new PortPinSet(9, 22);
                break;
            case 4:
                uartTx = new PortPinSet(9, 13);
                uartRx = new PortPinSet(9, 11);
                break;
            case 5:
                uartTx = new PortPinSet(8, 37);
                uartRx = new PortPinSet(8, 38);
                break;
        }
        ppSet.add(uartTx);
        ppSet.add(uartRx);
    }
    
    public void registADCPortPin(int adcNumber)
    {
        PortPinSet adcPPS = null;
        switch(adcNumber)
        {
            case 0:
                adcPPS = new PortPinSet(9, 39);
                break;
            case 1:
                adcPPS = new PortPinSet(9, 40);
                break;
            case 2:
                adcPPS = new PortPinSet(9, 37);
                break;
            case 3:
                adcPPS = new PortPinSet(9, 38);
                break;
            case 4:
                adcPPS = new PortPinSet(9, 33);
                break;
            case 5:
                adcPPS = new PortPinSet(9, 36);
                break;
            case 6:
                adcPPS = new PortPinSet(9, 35);
                break;
        }
    
        ppSet.add(adcPPS);
    }

    public ArrayList<PortPinSet> getPortPinList()
    {
        return ppSet;
    }

}
