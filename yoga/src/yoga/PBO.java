/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_ahmadyoga;

/**
 *
 * @author ahmad yoga w.
 */
public class PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama_depan= "ahmad";
        String nama_belakang= "yoga witdodo";
        String nis= "13742";
        String absen= "10";
        
        String nama = nama_depan+" " + nama_belakang;
        System.out.println("Nama : "+nama);
        System.out.println("NIS :"+nis);
        System.out.println("Nomor absen : "+absen);
        System.out.println("____________________");
        System.out.println("Jumlah karakter dari nama : "+nama.length());
        System.out.println("Nama besar semua : "+nama.toUpperCase());
    }
    
}
