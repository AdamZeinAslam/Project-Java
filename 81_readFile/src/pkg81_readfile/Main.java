package pkg81_readfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
           try {
//            Membaca File
            File myobj = new File("baru.txt");
            Scanner reader = new Scanner(myobj);
            
//            Mencetak File
         while (reader.hasNextLine()) {
             String data = reader.nextLine();
             System.out.println(data);
           } 
         reader.close();
        
       } catch (FileNotFoundException e) {
           System.out.println("Ada Error" + e.getMessage());
           e.printStackTrace();
       }
//           
    }
        
          
            }
        
        
       
     
    

