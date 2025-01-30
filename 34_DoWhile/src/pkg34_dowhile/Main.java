package pkg34_dowhile;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;  
        
        System.out.print("Awal : ");
        awal = masuk.nextInt();
        System.out.print("Akhir : ");
        akhir = masuk.nextInt();
        int a = awal;
    do {
        System.out.println(a);
        a++;
    } while (a <= akhir);
    
}}
    




//   int a = 1;
//       do {
//           System.out.println(a);
//           a++;
//           
//    } while(a <= 10);
//    }   
