package pkg82_deleatefile;
import java.io.File;


public class Main {

    
    public static void main(String[] args) {
   
         File myobj = new File("anak.txt");
         if (myobj.delete()) {
             System.out.println("Behasil Dihapus"+myobj.getName());
         } else {
             System.out.println("GAGAL dihapus");
         }
     } 
     }
 
    

