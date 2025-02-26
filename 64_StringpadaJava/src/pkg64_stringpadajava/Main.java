package pkg64_stringpadajava;


public class Main {

   
    public static void main(String[] args) {
       String nama = "Adam Zein Aslam";
        System.out.println("1. Jml Karakter = " + nama.length());
        System.out.println("2. UpperCase = " + nama.toUpperCase());
        System.out.println("3. LowerCase = " + nama.toLowerCase());
        System.out.println("4. Mengambil Karakter = " + nama.charAt(0));
        String[] kata = nama.split(" ");
        System.out.println("5. Kata depan = " + kata[0]);
        System.out.println("6. Kata Belakang = " + kata[1]);
    }
    
}
