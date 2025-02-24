package pkg63_tryandcatch;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        int x, y, z;
        String ulang = null;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Variabel X : ");
        x = masuk.nextInt();
        System.out.print("Masukan Variabel Y : ");
        y = masuk.nextInt();  
        do {
          try {
            z = x / y;
            System.out.println("Hasilnya : " + z);
        } catch (Exception e) {
            System.out.println("Ini errornya : ");
            e.printStackTrace();
        }  
            System.out.print("ulangi (Y/N) : ");
            ulang = masuk.next();
        } while (ulang.equalsIgnoreCase("Y")); {
        System.out.println("Program selesai");
    }
        
        
    } 
    
    
}
