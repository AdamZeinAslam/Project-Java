package pkg90_rataratanilaisiswa;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner masuk = new Scanner(System.in);
//       Menginputan bilangan
       System.out.print("Jumlah Bilangan : ");
       int angka = masuk.nextInt();
       
//       Deklarasi Variabel
       double total = 0;
       double rata = 0;
       
//         Proses memasukan bilangan
       for (int i = 1; i <= angka; i++) {
           System.out.print("Bilangan - " + i + " : ");
           double nilai = masuk.nextInt();
           total += nilai;
       }
//       Membuat rumus mencari rata-rata
        rata = total/angka;
        System.out.println("Rata-rata: "+total + " / " + angka + " = " + rata);
        System.out.println("");
       
//        Tampilkan Hasil
       if (rata < 75) {
           System.out.println("DIBAWAH STANDAR");
       } else {
           System.out.println("SESUAI STANDAR");
       }
    }
    
}
