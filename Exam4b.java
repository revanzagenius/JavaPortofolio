//import library
import java.util.Scanner;

public class Exam4b {
    public static void main (String[] args){
    
    //input user
    Scanner input = new Scanner(System.in);
    System.out.println("Menghitung Waktu Tempuh");
    
    //input user
    System.out.println("Masukan Kecepatan : ");
    int kecepatan = input.nextInt();
    
    //input user
    System.out.println("Masukan jarak : ");
    int jarak = input.nextInt();
    
    //output system
    System.out.println("Jarak : " + jarak + " Dapat di tempuh dalam :" + ( jarak / kecepatan ) + " Apabila Kecepatan : " + kecepatan);
    
    input.close();
    }
}
