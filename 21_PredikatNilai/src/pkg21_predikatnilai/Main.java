package pkg21_predikatnilai;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int nilai = masuk.nextInt();
        
        String kondisi = 
                nilai >= 9 ? "Sangat Baik":
                nilai >= 7 ? "Baik":
                nilai >= 5 ? "Cukup":
                nilai >= 3 ? "kurang":
                "Tidak Lulus";
        System.out.println("Anda Dinyatakan" + " " + kondisi);
                
    }
    
}
