package pkg66_classdanobject;
import packagebaru.filetiga;


class bahan {
    int x = 2;
}

public class Main {
    public static void main(String[] args) {
        
//  Mengambil data di beda class tapi masih satu file
      bahan obj = new bahan();
        System.out.println(obj.x);
        
//  Mengambil data beda file tapi masih satu package
       BedaFile objdua = new BedaFile();
       System.out.println(objdua.nama);
       
//  Mengambil data dari package yang berbeda
       filetiga objtiga = new filetiga();
       System.out.println(objtiga.alamt);
        
        
    }
    
}
