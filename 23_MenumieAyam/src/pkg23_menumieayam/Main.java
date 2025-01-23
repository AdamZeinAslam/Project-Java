package pkg23_menumieayam;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String menu = null;
        int pilihan, harga = 0;
        int porsi = 0;
        
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Bakso \n2. Mie Ayam\n3. Jus");
        System.out.println("======================");
        System.out.print("Masukan Pilihan : ");
        pilihan = masuk.nextInt();
        System.out.print("Berapa porsi : ");
        porsi = masuk.nextInt();
        
        
    if(pilihan == 1){
        menu = "Bakso";
        harga = 5000;
        porsi = harga * porsi;
    } else if (pilihan == 2){
        menu = "Mie Ayam";
        harga = 2000;
        porsi = harga * porsi;
    } else if (pilihan == 3) {
        menu = "Jus";
        harga = 1000;
        porsi = harga * porsi;
    }
        System.out.println(menu);
        System.out.println("Rp." + harga + "/Porsi");
        System.out.println("Total Bayar : Rp." + porsi);
        
}}
