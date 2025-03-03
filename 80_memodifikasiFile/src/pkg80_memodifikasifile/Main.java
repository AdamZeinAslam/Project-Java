package pkg80_memodifikasifile;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("File.txt");
            myWriter.write("Halo Adam Zein Aslam");
            myWriter.close();
            System.out.println("File berhasil dibuat");
        } catch (IOException e) {
            System.out.println("Sorry Ada Error");
            e.printStackTrace();
        }
    }
    
}
