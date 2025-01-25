package pkg30_looping;
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int awal, akhir;
        System.out.print("Awal : ");
        awal = masuk.nextInt();
        System.out.print("Akhir : ");
        akhir = masuk.nextInt();
        
        for(int a = awal; a<= akhir; a++){
            System.out.println(a);
        }
    }
    
}
