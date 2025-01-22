package pkg22_ifelse;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Total Belaja : ");
      double total = masuk.nextDouble();
        System.out.println("Belanja = Rp"+total);
        if(total >= 200000) {
            System.out.println("Dapat diskon 20%");
            double diskon = 20 * total / 100;
            total -= diskon;
            System.out.println(diskon);
        } else if (total >= 100000){
            System.out.println("Dapat diskon 10%");
            double diskon = 10 * total / 100;
            total -= diskon;
        } else {
            System.out.println("Dapat diskon 5%");
            double diskon = 5 * total / 100;
            total -= diskon;
            
        }
        System.out.println(total);
    }
    
}
