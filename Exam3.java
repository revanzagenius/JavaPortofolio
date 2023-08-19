import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
    String namaLengkap;
    String jenisKelamin;
    Long tahunKelahiran;
    String bulanKelahiran;
    Integer tanggalKelahiran;
    String tempatKelahiran;
    String alamatTinggal;
    String namaFakultas;
    String namaJurusan;
        
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Nama Lengkap :");
    namaLengkap = input.nextLine();                               
    System.out.println("Masukan Jenis Kelamin :");
    jenisKelamin = input.nextLine();
    System.out.println("Masukan Tahun Kelahiran :");
    tahunKelahiran = input.nextLong();
    System.out.println("Masukan Bulan Kelahiran :");
    bulanKelahiran = input.nextLine();
    input.nextLine();//int mau ke string /switch type data harus 2x
    System.out.println("Masukan Tanggal Kelahiran :");
    tanggalKelahiran = input.nextInt();
    System.out.println("Masukan Tempat Kelahiran :");
    tempatKelahiran = input.nextLine();
    input.nextLine();
    System.out.println("Masukan Alamat Tinggal :");
    alamatTinggal = input.nextLine();
    System.out.println("Masukan Nama Fakultas :");
    namaFakultas = input.nextLine();
    System.out.println("Masukan Nama Jurusan :");
    namaJurusan = input.nextLine();

    
    
    System.out.println("Nama anda : " + namaLengkap);
    System.out.println("Jenis Kelamin :" + jenisKelamin);
    System.out.println("Tempat & tanggal Lahir : " + tempatKelahiran + tanggalKelahiran + bulanKelahiran + tahunKelahiran);
    System.out.println("umur anda : " + (2023 - tahunKelahiran) + " Tahun");
    System.out.println("Alamat : " + alamatTinggal);
    System.out.println("Fakultas : " + namaFakultas);
    System.out.println("Jurusan : " + namaJurusan);

    input.close();
 }
} 
    

