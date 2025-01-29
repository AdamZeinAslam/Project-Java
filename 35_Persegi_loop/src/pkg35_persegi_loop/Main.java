package pkg35_persegi_loop;
import java.util.Scanner;
public class Main {
    
    /*
    jadi logic nya gini :
    i = 1
    j = 1
    j++ = 2
    j++ = 3
    j++ = 4 (empat tidak kurang sama dengan 3)
    maka, dia turun ke sout yg prinln
    terus,
    i++ = 2 (apakah 2 < jml? Ya) maka, balik lagi
    j = 1
    j++ = 2
    dan seterusnya......
    
    o o o o
    o o o o
    */

   
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int jml = masuk.nextInt();
        for (int i = 1; i<= jml; i++ ) {
            for(int j = 1; j <= jml; j++ ){
                System.out.print("* ");
            }
            System.out.println("o ");
    }
        System.out.println("");
    } 
    
}
