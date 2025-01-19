package pkg20_ganjilgenap;
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
//        Menginputkan Bilangan
       Scanner masuk = new Scanner(System.in);
       System.out.print("Bilangan : ");
       int angka = masuk.nextInt();
       
//       Deklarasi variabel 
       int hasil = angka % 2;
       
//       Menampilkan hasil
       if (hasil == 0) {
           System.out.println("Genap");
       } else {
           System.out.println("Ganjil");
       }
       
    }
    
}
