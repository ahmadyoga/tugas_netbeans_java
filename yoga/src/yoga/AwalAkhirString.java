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
public class AwalAkhirString {
    public static void main(String[] args) {
        String str1 = "Teknik Informatika SMK N 1 Sintoga";
        System.out.println(str1.startsWith("Teknik"));
        System.out.println(str1.endsWith("Informatika"));
        System.out.println(str1.startsWith("Inf",1));
        System.out.println(str1.startsWith("Info",2));
        System.out.println(str1.startsWith("Infor",3));
        System.out.println(str1.startsWith("mat",7));
        System.out.println(str1.startsWith("mat",6));
        System.out.println(str1.startsWith("mat",5));
        System.out.println(str1.endsWith("SMK")); 
        System.out.println(str1.startsWith("SMK"));
    }
}
