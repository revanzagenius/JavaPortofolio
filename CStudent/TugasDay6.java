import java.util.Scanner;

public class TugasDay6 {

    void barang1()   
  {
   System.out.println("==Barang1==");
   Scanner input = new Scanner(System.in);

   System.out.println("Masukan Nama Barang :");
   String namaBarang1 = input.nextLine();
   System.out.println("Masukan Jumlah Barang (kg) :");
   Integer jumlahBarang1 = input.nextInt();
   System.out.println("Masukan Harga Satuan /kg :");
   Integer hargaSatuan1 = input.nextInt();

   System.out.println("==Barang2==");

   System.out.println("Masukan Nama Barang :");
   String namaBarang2 = input.nextLine();
   namaBarang2 = input.nextLine();
   System.out.println("Masukan Jumlah Barang (kg) :");
   Integer jumlahBarang2 = input.nextInt();
   System.out.println("Masukan Harga Satuan /kg :");
   Integer hargaSatuan2 = input.nextInt();

   System.out.println("==Barang3==");

   System.out.println("Masukan Nama Barang :");
   String namaBarang3 = input.nextLine();
   namaBarang3 = input.nextLine();
   System.out.println("Masukan Jumlah Barang (kg) :");
   Integer jumlahBarang3 = input.nextInt();
   System.out.println("Masukan Harga Satuan /kg :");
   Integer hargaSatuan3 = input.nextInt();

   System.out.println("==Barang4==");
   
   System.out.println("Masukan Nama Barang :");
   String namaBarang4 = input.nextLine();
   namaBarang4 = input.nextLine();
   System.out.println("Masukan Jumlah Barang (kg) :");
   Integer jumlahBarang4 = input.nextInt();
   System.out.println("Masukan Harga Satuan /kg :");
   Integer hargaSatuan4 = input.nextInt();

   System.out.println("==Barang5==");

   System.out.println("Masukan Nama Barang :");
   String namaBarang5 = input.nextLine();
   namaBarang5 = input.nextLine();
   System.out.println("Masukan Jumlah Barang (kg) :");
   Integer jumlahBarang5 = input.nextInt();
   System.out.println("Masukan Harga Satuan /kg :");
   Integer hargaSatuan5 = input.nextInt();

    System.out.println(namaBarang1 + jumlahBarang1 + " kg " + hargaSatuan1 );
    System.out.println(namaBarang2 + jumlahBarang2 + " kg " + hargaSatuan2 );
    System.out.println(namaBarang3 + jumlahBarang3 + " kg " + hargaSatuan3 );
    System.out.println(namaBarang4 + jumlahBarang4 + " kg " + hargaSatuan4 );
    System.out.println(namaBarang5 + jumlahBarang5 + " kg " + hargaSatuan5 );
 }
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Username :");
    String username = input.nextLine();
    System.out.println("Masukan Password :");
    String password = input.nextLine();

    
    if(username.equals("Harry") && password.equals("Password")){
            System.out.println("Selamat datang Harry, masukan 5 data item yang akan di jual");
            TugasDay6 obj1 = new TugasDay6();

            obj1.barang1();

    } else {
        System.out.println("Username dan Password salah");
    }
}
}

