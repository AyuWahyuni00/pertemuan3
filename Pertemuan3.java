/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kondisi ;
        kondisi = JOptionPane.showInputDialog(null, "silahkan silih kondisi:[biodata, kalkulator]}");
        Pertemuan3 per = new Pertemuan3();
        if (kondisi.equals("biodata")){
            per.biodata();
        }else if (kondisi.equals ("kalkulator")){
            per.kalkulator();
    }
    }
void biodata(){
//    deklarasi variabel
    String nama_depan, nama_belakang, tempat, tanggal_lahir, alamat, matkul, grade;
    int nilai, nohp;

//input dengan JOptionPane
     nama_depan = JOptionPane.showInputDialog (null, "masukkan nama depan anda:");
     nama_belakang = JOptionPane.showInputDialog (null, "masukkan nama belakang anda:");
     tempat = JOptionPane.showInputDialog (null, "masukkan tempat lahir anda:");
     tanggal_lahir = JOptionPane.showInputDialog (null, "masukkan tanggal lahir anda:");
     alamat = JOptionPane.showInputDialog (null, "masukkan alamat anda:");
     matkul = JOptionPane.showInputDialog (null, "masukkan mata kuliah anda:");
     nama_depan = JOptionPane.showInputDialog (null, "masukkan nama depan anda:");
     nilai = Integer.parseInt(JOptionPane.showInputDialog (null, "masukkan nilai anda:"));
     nohp = Integer.parseInt(JOptionPane.showInputDialog (null, "masukkan nohp anda:"));
//hitung gradenya
     if (nilai >90 && nilai <=100){
         grade = "A";   
     }else if (nilai >80 && nilai <=90){
         grade = "B+";   
     }else if (nilai >70 && nilai <=80){
         grade = "B";   
     }else if (nilai >60 && nilai <=70){
         grade = "C+";   
     }else if (nilai >50 && nilai <=60){
         grade = "C";   
     }else if (nilai >40 && nilai <=50){
         grade = "D";   
     }else {
         grade ="E";
     }
// cetak hasilnya
     System.out.println("grade:" +grade);
//output popup
     JOptionPane.showMessageDialog (null, "====biodata====\n"
     +"nama:" +nama_depan+ "" +nama_belakang + "\n"
     +"tempat/tanggal_lahir:" +tempat+ "/" +tanggal_lahir + "\n"
     +"no hp:" +nohp+ "\n"
     +"nama mata kuliah saat ini:" +matkul+ "\n"
     +"alamat:" +alamat+ "\n"
     +"nilai angka:" +nilai+ "\n"
     +"nilai huruf:" +grade+ "\n"
     );
}
void kalkulator(){
//deklarasi variable
    String bil1, bil2 ;
    int nilai1, nilai2;
    
//input kalkulator menggunakan JOptionPane
    bil1 =JOptionPane.showInputDialog(null, "masukkan bilangan1=");
    bil2 =JOptionPane.showInputDialog(null, "masukkan bilangan2=");
    nilai1 =Integer.parseInt(JOptionPane.showInputDialog(null, "masukkan nilai1="));
    nilai2 =Integer.parseInt(JOptionPane.showInputDialog(null, "masukkan nilai2="));
    
    int tambah = nilai1 + nilai2 ;
    int kurang = nilai1 - nilai2 ;
    int kali = nilai1 * nilai2 ;
    int bagi = nilai1 / nilai2 ;
    
//output popup
    JOptionPane.showMessageDialog (null, "hasil dari" +nilai1+ "+" +nilai2+ "adalah" +tambah);
    JOptionPane.showMessageDialog (null, "hasil dari" +nilai1+ "-" +nilai2+"adalah" +kurang);
    JOptionPane.showMessageDialog (null, "hasil dari" +nilai1+ "*" +nilai2+ "adalah" +kali);
    JOptionPane.showMessageDialog (null, "hasil dari" +nilai1+ "/" +nilai2+ "adalah" +bagi);
}
        
}
