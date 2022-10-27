/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoga;

/**
 *
 * @author User
 */
public class PosisiKarakter {
    public static void main(String[] args){
        String str1 ="Teknik Informatika SMK N 1 Wonosobo";
        System.out.println(str1.indexOf("Teknik"));
        System.out.println(str1.indexOf("Teknik",10));
        System.out.println(str1.lastIndexOf("SMK"));
        System.out.println(str1.lastIndexOf("SMK",10));
        System.out.println(str1.lastIndexOf("SMK",20));
        System.out.println(str1.indexOf(97));
        System.out.println(str1.indexOf(97,7));
        System.out.println(str1.lastIndexOf(97));
        System.out.println(str1.lastIndexOf(97,7));
    }
}
