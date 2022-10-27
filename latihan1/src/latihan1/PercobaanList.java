/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ahmad
 */
public class PercobaanList {
    public static void main(String[] args) {
        List list=new ArrayList();
        
        list.add("Apel");
        list.add("Strawberry");
        list.add("Durian");
        list.add("Jeruk");
        list.add("Anggur");
        
        System.out.println(list);
        System.out.println("list ke-2 :"+list.get(2));
        System.out.println("list ke-0 : "+list.get(0));
        
        System.out.println("Daftar buah-buahan: ");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
    }
}
