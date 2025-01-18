package pkg19_ternarry;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
      /*
       [type data] nama = [kondisi]?"Terpenuhi":Tdk Terpenuhi"  
      */ 
//      contoh :
//      int a = 10;
//      String hasil = a >= 0?"positif":"Negatif";
//        System.out.println(hasil);

           Scanner input = new Scanner(System.in);
           
           int a;
           int kkm = 75;
           System.out.print("Masukan Nilai : ");
           
           a = input.nextInt();
           String hasil = a >= kkm?"Lulus":"Tidak Lulus";
          System.out.println("Kamu dinyatakan" + " " + hasil);
           


         
    }
    
}
