package pkg45_inputoutputarray;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int jml;
      
        System.out.print("Masukan index : ");
        jml = masuk.nextInt();
         int a [] = new int [jml];
        System.out.println("----------");
        System.out.println("Input");
        System.out.println("----------");
        
        for(int i = 0; i < jml; i++) {
            System.out.print("Index ke "+ i + " : ");
            a[i] = masuk.nextInt();
        }
        System.out.println("Output");
      for (int i = 0; i < jml; i++) {
          System.out.print(a[i]+ " ");
      }
        System.out.println("");
       
       
        
        
        
       
        
        
        
       
        
       
    }
    
}
