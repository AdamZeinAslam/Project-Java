package pkg65_splitstring;


public class Main {

  
    public static void main(String[] args) {
        String ttl = ("Bogor, 11 Maret 2005 ");
//         Bikin pemisah agar nama bogor dipisah dari yg lain
        String[] split = ttl.split(", ");
        
//        Bikin pemisah yang kedua 
        String[] splitspasi = split[1].split(" ");
         
//        Deklarasikan Variabel
        String tmpt = split[0];
        String tgl = splitspasi[0];
        String bln = splitspasi[1];
        String thn = splitspasi[2];

//        Tampilkan ke layar
        System.out.println("Tempat \t: " + tmpt);
         System.out.println("Tanggal\t: " + tgl);
          System.out.println("Bulan \t: " + bln);
           System.out.println("Tahun \t: " + thn);
        
    }
    
    
}
