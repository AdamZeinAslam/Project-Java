package pkg27_switchcase;
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
       int data = masuk.nextInt();
       switch (data){
           case 1:
               System.out.println("Adam");
               break;
           case 2:
               System.out.println("Zein");
               break;
           default:
               System.out.println("Salah");
       } 
    }
    
}
