/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoga;

import javax.swing.JOptionPane;

/**
 *
 * @author ahmad
 */
public class Yoga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String angka_string;
        angka_string =JOptionPane.showInputDialog(null,"masukan nilai anda 1-100","angka 1-100",JOptionPane.QUESTION_MESSAGE);
        int angka;
        angka = Integer.parseInt(angka_string);
        String pesan;
        if(angka > 100){
            pesan="anda tidak melihat instruksi";
        }else if(angka >=90){
            pesan="Nilai anda A";
        } else if(angka >=70){
            pesan="Nilai anda B";
        } else if( angka >=60){
            pesan="nilai anda C";
        } else if( angka >= 40){
            pesan="nilai anda D";
        } else{
            pesan="anda tidak lulus silahkan mengulang";
        }
        JOptionPane.showMessageDialog(null,pesan, "Nilai anda", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
