//Import Library
import java.util.Scanner;

public class Exam4a {
    public static void main(String[] args) {
    //deklarasi variable
    Integer panjang;
    Integer lebar;
    Integer tinggi;

    //input user
    Scanner input = new Scanner(System.in);
    System.out.println("===WELCOME===");

    //input user panjang
    System.out.println("Masukan Panjang : ");
    panjang = input.nextInt();

    //input user lebar
    System.out.println("Masukan Lebar : ");
    lebar = input.nextInt();

    //input user tinggi
    System.out.println("Masukan Tinggi :");
    tinggi = input.nextInt();
    
    //output
    System.out.println("Hasil Perhitungan Volume Balok Adalah : " + panjang * lebar * tinggi);

    input.close();
    }
}
