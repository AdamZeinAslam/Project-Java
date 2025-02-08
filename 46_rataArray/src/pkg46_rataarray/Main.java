package pkg46_rataarray;


public class Main {

   
    public static void main(String[] args) {
      
       int[] a = {1, 2, 3};
       int total = 0;
       double rata = 0;
       int jml = a.length;
        System.out.print("Deret Angka :  ");
       for (int i = 0; i < jml; i++) {
            System.out.print(a[i]+ " ");
            total += a[i];
 
       }
        System.out.println(""); 
        System.out.println("Total = " + total);
        rata = total/jml;
        System.out.print("rata-rata = " + rata);
        System.out.println(" ");
    } 
    
    
}
