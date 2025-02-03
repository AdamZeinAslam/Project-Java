package pkg42_fibonaci;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        System.out.print("Masukan berapa deret fibonaci?  ");
        int n = masuk.nextInt();
        System.out.print(n + " Deret Fibonaci = ");
        int fn;
        for (int i = 1; i < n; i++  ) {
            fn = f1 + f2;
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
        }
        System.out.println("");
    }
    
}
