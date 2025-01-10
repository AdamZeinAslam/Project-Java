package pkg13_bilangaprima;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
//        Menginputkan Bilangan
        System.out.print("Bilangan : ");
        int angka = masuk.nextInt();
        
//        Deklarasi Variabel
        int hasil = 0;
        
//        Proses mencari prima
        for (int i = 2; i<= angka; i++) {
            if (angka % i == 0) {
                hasil++;
            }  
        }
//        Tampilkan hasil
        if (hasil == 1) {
            System.out.println("Prima");
        } else {
            System.out.println("Bukan Prima");
        }
    }
    
}
