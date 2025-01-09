
package pkg12_luaspersegipanjang;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p, L, K;
        System.out.print("Masukan angka : ");
        p = input.nextInt();
        L = p * p;
        K = 4 * p;
        
        System.out.print("Luas Persegi Panjang : ");
        System.out.println(L);
        System.out.print("Keliling : ");
        System.out.println(K);
      
    }
    
}
