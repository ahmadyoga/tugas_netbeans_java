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
public class MmenggabungkanString {
    public static void main(String[] args){
        String str;
        String a;
        String b;
        a="smk";
        b="wonosobo";
        System.out.println("(tanpa spasi) sekolahku : "+a+b);
        System.out.println("(dengan spasi) sekolahku : " + a +" "+b);
        str="Selamat datang "+"Siswa RPL";
        System.out.println(str);
        str +="\nSMKN 1 Wonosobo";
        System.out.println(str);
    }
}
