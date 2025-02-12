
package pkg53_prosedurdanfungsi;


public class Main {
    
//    Prosedur
    static void siswa() {
        String nama = "Adam";
        int umur = 19;
        System.out.println(nama + " " + umur + " TH");
    }
//    Fungsi
      static String asal() {
          String daerah = "Bogor";
          int nomor = 77;
          return daerah + " " +nomor;
      }
    
    
    public static void main(String[] args) {
      siswa();
      System.out.println(asal());
    }
    
}
