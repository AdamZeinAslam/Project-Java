
package pkg8_inputdata;
import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, alamat, kampus = null;
        int umur;
////            
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        System.out.print("Asal Kampus : ");
        kampus = input.nextLine();
        System.out.print("Umur : ");
        umur = input.nextInt();
        
        System.out.println("--------------");
        System.out.println(nama + " " + "Bersasal Dari" + " " + alamat);
        System.out.println("Dia Kuliah Di" + " " + kampus );
        
        
        
    }
    
}
