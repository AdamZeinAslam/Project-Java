package pkg11_luaspersegi;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s, L, K;
        System.out.print("Masukan sisi : ");
        s = input.nextInt();
        L = s * s;    
        K = 4 * s;
        
        System.out.print("Luas Persegi : " + "s x s = ");
        System.out.println(L);
        System.out.print("Keliling Persegi : " + " 4 x s = ");
        System.out.println(K);
                
                
       
    }
    
}
