package pkg39_faktorial;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan bilangan faktorial : ");
        int angka = masuk.nextInt();
        int hasil = 1;
        
        
        
        System.out.println("n \t n!");
        System.out.println("--------------");
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
            System.out.println(i + "\t" + hasil);
        }
            System.out.println("---------------");
    }}
   
