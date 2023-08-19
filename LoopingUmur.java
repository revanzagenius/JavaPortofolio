import java.util.Scanner;

public class LoopingUmur {
    public static void main(String[] args) {
        int tahunLahir;
        int tahunSekarang;
        int umur;

        Scanner input = new Scanner(System.in);
        System.out.println(" Masukan Tahun Lahir = ");
        tahunLahir = input.nextInt();
        System.out.println(" Masukan Tahun Sekarang = ");
        tahunSekarang = input.nextInt();
        umur = tahunSekarang - tahunLahir;

        while (umur >= 1){
            System.out.println(umur + "Tahun pada tahun" + (tahunSekarang));
            // tahunLahir++;
            // ++tahunLahir;
            umur--;
            tahunSekarang--;
          
    
    }
    }
}