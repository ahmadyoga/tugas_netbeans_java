/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author ahmad
 */
public class PercobaanHashMap {
    public static void main(String[] args){
        HashMap hMap;
        hMap = new HashMap();
        
        hMap.put("1","Adi");
        hMap.put("2","Bagus");
        hMap.put("3","Sinta");
        System.out.println(hMap);
        
        Collection c = hMap.values();
        Iterator itr = c.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
        
        System.out.println("Total HashMap adalah : " +hMap.size());
        
        System.out.println("========================================");
        
        Object obj = hMap.remove("2");
        System.out.println(obj + " dihapus dari HashMap");
        System.out.println("total Hashmap adalah : "+hMap.size());
        System.out.println(hMap);
        
        System.out.println("=============================");
        
        hMap.clear();
        System.out.println("Total HashMap adalah : " +hMap.size());
    }
    
}
