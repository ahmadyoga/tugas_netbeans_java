/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_ahmadyoga;

/**
 *
 * @author ahmad
 */
import java.util.*;
public class Tampilan_manual {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        String nama_depan;
        String nama_tengah;
        String nama_belakang;
        String nis;
        String absen;
        
        System.out.print("masukan Nama depan : ");
        nama_depan=s.next();
        System.out.print("masukan Nama tengah : ");
        nama_tengah=s.next();
        System.out.print("masukan Nama belakang : ");
        nama_belakang=s.next();
        System.out.print("masukan NIS : ");
        nis=s.next();
        System.out.print("masukan Nomor absen : ");
        absen=s.next();
        System.out.println("____________________");
        
        String nama = nama_depan+" "+nama_tengah+" "+nama_belakang;
        System.out.println("Nama : "+nama);
        System.out.println("NIS : "+nis);
        System.out.println("Nomor absen : "+absen);
        
        System.out.println("____________________");
        System.out.println("Panjang karakter : "+nama.length());
        System.out.println("Nama besar semua : "+nama.toUpperCase());
    }
}
