
package pkg52_looparraymultidimensi;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String [][] kota ={
          {"Adam", "Bogor"},
          {"Zein", "Jakarta"},
          {"Aslam", "Bandung"}
              
      };
          for (int i = 0; i < kota.length; i++) {
          for (int j = 0; j < kota[i].length; j++) {
               System.out.println(kota[i][j]);
          }
         
      }
        
      
    }
    
}
