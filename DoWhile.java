import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Integer nomor=0;

    
    
    while (nomor !=4){
        System.out.println("MENU");
        System.out.println("1. Volume Balok");
        System.out.println("2. Volume Bola");
        System.out.println("3. Hitung Umur");
        System.out.println("4. EXIT");
        
        System.out.println("Input Nomor : ");
        nomor = input.nextInt();
        


    switch(nomor){
        case 1:
        System.out.println("Masukan Panjang : ");
        Integer panjang = input.nextInt();
        System.out.println("Masukan Lebar : ");
        Integer lebar = input.nextInt();
        System.out.println("Masukan tinggi : ");
        Integer tinggi = input.nextInt();
        System.out.println("Volume balok = " + panjang * lebar * tinggi);
        System.out.println();
        break;
        case 2:
        System.out.print("Masukkan Phi : ");
        Double phi=input.nextDouble();
        System.out.print("Masukkan Jari-jari (r) : ");
        Double r = input.nextDouble();
        System.out.println("Volume Bola = " + (4 * phi * r * r * r)/3);
        System.out.println();
        break;
        case 3:
        System.out.print("Masukkan Tahun Lahir : ");
        int tahunLahir=input.nextInt();
        System.out.print("Masukkan Tahun Sekarang : ");
        int tahunSekarang = input.nextInt();
        System.out.println("Umur Anda = " + (tahunSekarang - tahunLahir));
        System.out.println();
        break;
        case 4:
        break;
        
    }
    }

    
        
    }
    
}
