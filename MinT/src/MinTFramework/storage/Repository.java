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
package MinTFramework.storage;

import MinTFramework.ExternalDevice.DeviceType;
import MinTFramework.Util.DebugLog;
import MinTFramework.storage.Resource.StoreCategory;
import MinTFramework.storage.datamap.Cache;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author soobin Jeon <j.soobin@gmail.com>, chungsan Lee <dj.zlee@gmail.com>,
 * youngtak Han <gksdudxkr@gmail.com>
 */
public class Repository extends Cache<Resource>{
    DebugLog dl = new DebugLog("Repository");
    public Repository(){}
    
    /**
     * get All Resources by Resource Name
     * @param resName
     * @return 
     */
    public List<Resource> getbyResourceName(String resName){
        ArrayList<Resource> rlist = new ArrayList<>();
        for(Resource res : resources.values()){
            try {
//                System.out.println("s name : "+resName 
//                        +", "+(String)res.getClass().getMethod("getName").invoke(res));
                if(resName.equals(res.getName())){
//                    dl.printMessage("matched : "+resName);
                    rlist.add(res);
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return rlist;
    }
    
    public List<Resource> getbyResourceType(String resourceName) {
        ArrayList<Resource> rlist = new ArrayList<>();
        for(Resource res : resources.values()){
            try {
//                System.out.println("s name : "+resourceName 
//                        +", "+(DeviceType)res.getClass().getMethod("getDeviceType").invoke(res));
                //DeviceType estr = (DeviceType)res.getClass().getMethod("getDeviceType").invoke(res);
                DeviceType estr = res.getDeviceType();
                if(estr.isSameDeivce(resourceName)){
//                    System.out.println("--matched : "+resourceName);
                    rlist.add(res);
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return rlist;
    }
    
    /**
     * get Resources by Store Category
     * @param sc
     * @return 
     */
    public List<Resource> getbyStoreCategory(StoreCategory sc){
        //getStorageDirectory
        ArrayList<Resource> rlist = new ArrayList<>();
        for(Resource res : resources.values()){
            try {
//                StoreCategory estr = (StoreCategory)res.getClass().getMethod("getStorageCategory").invoke(res);
                if(sc.equals(res.getStorageCategory())){
//                    dl.printMessage("matched : "+resName);
                    rlist.add(res);
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return rlist;
    }
}
