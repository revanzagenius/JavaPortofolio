package OOPJAVA.TugasDay18.ExamNomor1;
import java.util.ArrayList;//library yang di gunakan agar kita bisa memanggil ArayList
import java.util.Scanner;//dlibrary yang di gunakan agar kita bisa menggunakan Scanner
public class Demo {
   static ArrayList<Staf> listStaff = new ArrayList<Staf>(); //untuk menggunakan ArrayList staf
    public static void main(String[] args) {//4 Mantra Java
        
    Scanner input = new Scanner(System.in); //Membuat Scanner dengan variable input

    int nomor = 0; //menginisialisasikan variable nomor dengan 0

    while(nomor !=4) { //perulangan java while yang dimana ketika hasil nya tidak sama dengan 3 maka system akan terus looping
        System.out.println();//Untuk menampilkan menu
        System.out.println("MENU");
        System.out.println("1. Input Data Staff");
        System.out.println("2. Tampilkan Laporan Staff");
        System.out.println("3. Hapus Karyawan (By.id)");
        System.out.println("4. Exit");
        
        System.out.println();
        System.out.print("Input nomor : "); //Scanner yang di gunakan untuk menginput nomor pada pilihan
        int menu = input.nextInt();
        
        switch(menu) { //Yang di gunakan untuk memberikan tampilan sesuai dengan input dari user
          case 1 :
            inputData();//memanggil objek input data
            break;
          case 2 :
            tampilLaporan(); //memanggil objek tampilLaporan
            break;
          case 3 :
            System.out.println("System Shutdown"); //Apabila user memilih nomor 3 maka sistem akan menampilkan System Shutdown
            break;
        }
    }    
}

  static void inputData(){ // untuk menginputkan data
  Scanner input = new Scanner(System.in);
  String idKaryawan , nama , jabatan ;
  System.out.println("Masukan ID Karyawan : ");   
  idKaryawan = input.nextLine();

  System.out.println("Masukan Nama : ");
  nama = input.nextLine();

  System.out.println("Masukan Jabatan : ");
  jabatan = input.nextLine();

  Staf staf = new Staf(idKaryawan, nama , jabatan);
  listStaff . add(staf);
}
  static void tampilLaporan() { // untuk menampilkan laporan hasil data yang di inputkan
  System.out.println("ID\tNama\t\tJabatan");
  
  for (Staf staff : listStaff) {
      System.out.printf("%s\t%-10s\t%s\n", staff.idKaryawan, staff.nama, staff.jabatan);
  }
  
  System.out.println();
}
}