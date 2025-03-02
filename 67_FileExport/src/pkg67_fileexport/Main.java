package pkg67_fileexport;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String nama;
        String extension = ".txt";
        System.out.print("Buar File : ");
        nama = masuk.nextLine();
      try {
          File myobj = new File (nama+extension);
          if(myobj.createNewFile()) {
              System.out.println("File berhasil dibuat ");
          } else {
              System.out.println("File Gagal dibuat ");
          }
      } catch (IOException e) {
          System.out.println("Ini dia error nya ");
          e.printStackTrace();
      }
      
    }
    
}
