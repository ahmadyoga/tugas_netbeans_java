/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.*;

/**
 *
 * @author ahmad
 */
public class TestHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set set = new HashSet();
        
        set.add("Blitar");
        set.add("Jember");
        set.add("Jombang");
        set.add("Malang");
        set.add("Probolinggo");
        set.add("Malang");
        
        System.out.println(set);
        
        Iterator<String> iterator = set.iterator();
         
         while(iterator.hasNext()){
             System.out.print(iterator.next().toUpperCase() + " ");
         }
    }
    
}