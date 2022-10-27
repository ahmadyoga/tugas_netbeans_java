package yoga;

import javax.swing.JOptionPane;

public class Latihan {
    public static void main(String[] args) {
    String angka_string;
    angka_string = JOptionPane.showInputDialog(null,"masukan nilai anda 1-100","angka 1-100", JOptionPane.QUESTION_MESSAGE);
    Int angka;
    angka= Integer.parseInt(angka_string);
    String pesan;
    if(angka > 100){
        pesan="anda tidak membaca perintah";
    } else if(angka >=90){
        pesan =" nilai anda S";
    } else if(angka >=70){
        pesan=" nilai anda B";
    } else if( angka >=60){
        pesan="nilai anda C";
    } else if(angka >=40){
        pesan="nilai anda D";
    } else{
        pesan="anda tidak lulus ! Silahkan ulangi lagi";
    }
    JOptionPane.showMessageDialog(null, pesan, "nilai anda", JOptionPane.INFORMATION_MESSAGE);
    }
}
