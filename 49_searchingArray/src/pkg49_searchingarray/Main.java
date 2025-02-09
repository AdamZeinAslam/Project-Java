package pkg49_searchingarray;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
       int [] a = {1,2,3,4,5,6,6};
       Scanner masuk = new Scanner(System.in);
       int cari, jml = 0;
        System.out.println("Pencarian Index");
            for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");    
    }
     System.out.println("");
     System.out.print("Cari : ");
     cari = masuk.nextInt();
        for (int i = 0; i < a.length; i++) {
          if (cari == a[i]) {
            System.out.println("Index ke " + i );
            jml++;
        } 
        
        }   
             if (jml == 0) {
                    System.out.println("tidak ada");
                    } 
            System.out.println("");
    } 
  
}
