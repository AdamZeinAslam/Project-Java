package pkg54_methodparameter;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        String nm, tgl;
        int ur;
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Nama : ");
        nm = masuk.nextLine();
        System.out.print("Asal : ");
        tgl = masuk.nextLine();
        System.out.print("Umur : ");
        ur = masuk.nextInt();
        siswa (nm, ur, tgl);
    }
     static void siswa(String nama, int umur, String asal){
        System.out.println(nama + " berumur " + umur + " dan berasl dari " + asal);
   
    }
    
}
