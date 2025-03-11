package pkg91_mencarinilai;
//import java.util.Scanner;
//
//public class Main {
//
//   
//    public static void main(String[] args) {
//        Scanner masuk = new Scanner(System.in);
//        int cari = 0, jumlah = 0;
//        int angka = 0;
//        
//        
//        System.out.print("Jumlah Bilangan : ");
//        angka = masuk.nextInt();
//        
//        int[] bilangan = new int[angka];
//        
//
//       for (int i = 1; i <= angka; i++) {
//           System.out.print("Bilangan - " + i + " : ");
//           jumlah = masuk.nextInt();
//                     
//       }
//       System.out.print("Cari Bilangan : ");
//          cari = masuk.nextInt();
//        //   Proses pencarian 
//        boolean ditemukan = true;
//        for (int i = 0; i < angka; i++) {
//            if (bilangan[i] == cari) {
//                
//                ditemukan = true;  
//                break;
//            }
//        }
//         
//          
//       if (ditemukan) {
//           System.out.println("DITEMUKAN");
//       } else {
//           System.out.println("TIDAK DITEMUKAN");
//       }
//    }
//    
//}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah bilangan
        System.out.print("Jumlah Bilangan: ");
        int jumlahBilangan = input.nextInt();
        
        // Membuat array untuk menyimpan bilangan
        int[] bilangan = new int[jumlahBilangan];
        
        // Input bilangan ke dalam array
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Bilangan ke-" + (i+1) + ": ");
            bilangan[i] = input.nextInt();
        }
        
        // Input bilangan yang ingin dicari
        System.out.print("Cari Bilangan: ");
        int bilanganDicari = input.nextInt();
        
        // Mencari bilangan dalam array
        boolean ditemukan = false;
        for (int i = 0; i < jumlahBilangan; i++) {
            if (bilangan[i] == bilanganDicari) {
                ditemukan = true;
                break;
            }
        }
        
        // Menampilkan hasil
        if (ditemukan) {
            System.out.println("DITEMUKAN");
        } else {
            System.out.println("TIDAK DITEMUKAN");
        }
    }
}
