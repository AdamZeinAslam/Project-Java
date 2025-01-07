package pkg10_operatotaritmatika;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int a, b, c;
        System.out.print("masukan a : ");
            a = input.nextInt();
        System.out.print("Masukan b : ");
            b = input.nextInt();
            c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        
        c = b - a;
        System.out.println(a + " - " + b + " = " + c);
        c = b * a;
        System.out.println(a + " * " + b + " = " + c);
        c = a / b;
        System.out.println(a + " : " + b + " = " + c);
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);
    }
    
}
