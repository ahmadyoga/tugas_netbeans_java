/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoga;

/**
 *
 * @author ahmad
 */
public class String9 {
    public static void main(String[] args) {
String str="Teknik Informatika SMK N 1 WONOSOBO";
char[] arraystr=str.toCharArray();
System.out.println("String : " +str);
System.out.println("String Baru [toCharArray]: ");
for (int i=0; i<arraystr.length ; i++){
System.out.println(arraystr[i]);
}
System.out.println("String Baru [getChars]: ");
char[] getstr=new char[10];
str.getChars(5,13,getstr,0);
for (int i=0; i<getstr.length ; i++){
System.out.println(getstr[i]);
}
} 
}
