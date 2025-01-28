package pkg32_whilefor;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;
        
        
        System.out.print("Awal : ");
        awal = masuk.nextInt();
        System.out.print("Akhir : ");
        akhir = masuk.nextInt();
        if (akhir > awal){
            System.out.println("Maaf Salah");
        } else {
            int a = awal;
        while (a >= akhir){
            System.out.println(a);
            a--;
        }
        }
        
        System.out.println(" ");

    }}


//
////     int a = 1;
////      while (a <= 10) {
////          System.out.println(a);
////          a++;
////      }
//      
//    }
//    
//}
