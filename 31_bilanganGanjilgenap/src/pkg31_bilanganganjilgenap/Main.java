package pkg31_bilanganganjilgenap;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Bilangan Genap");
        int awal, akhir;
        
        System.out.print("Awal : ");
        awal = masuk.nextInt();
        System.out.print("Akhir : ");
        akhir = masuk.nextInt();
       
       for(int a = awal; a <= akhir; a+= 2) {
           if (a % 2 == 1) {
                  continue;
              }
           System.out.print(a + " ");
           } 
           System.out.println("");
       }
          
    }
    

