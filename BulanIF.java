import java.util.Scanner;

public class BulanIF {
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
    
    if (bulanLahir == 1){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Januari " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 2){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Februari " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 3){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Maret " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 4){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " April " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 5){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Mei " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 6){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Juni " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 7){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " July " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 8){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Agustus " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 9){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " September " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 10){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Oktober " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 11){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " November " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else if (bulanLahir == 12){
        System.out.println("Nama Saya " + namaLengkap +" Lahir " +tanggalLahir + " Desember " + tahunLahir + " Berumur " + (tahunLahir - 2023));
    }else{
        System.out.println("Format Bulan Salah");
    }
}
}
