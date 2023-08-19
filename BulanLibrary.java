 //Libary yang di butuhkan
import java.util.Scanner;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;


public class BulanLibrary {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Nama = ");
        String namaLengkap = input.nextLine();
        System.out.println("Tanggal Lahir = ");
        Integer tanggalLahir = input.nextInt();
        System.out.println("Bulan Lahir = ");
        Integer bulanLahir = input.nextInt();
        System.out.println("Tahun Lahir : ");
        Integer tahunLahir =  input.nextInt();

    String namaBulan = Month.of(bulanLahir).toString(); //out put masih bahasa ingris
    System.out.println(namaBulan);

    //Mengkonfersi dari bahasa ingris ke bahasa indo
    // String bulan = Month.of(bulanLahir).getDisplayName(TextStyle.FULL, new Locale("id","ID"));
    // System.out.println(bulan); 
}
}
