package I.O;
import java.util.*;
import java.io.*;

//Membuat Objek Mahasiswa
class DataMahasiswa {
    int id;
    String nama;
    int nilai;  

//Konstruktor Data Mahasiswa
    DataMahasiswa (int id,String nama, int nilai){
    this.id = id;
    this. nama = nama;
    this. nilai = nilai;
    }   

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    
}

public class MenuMahasiswa {
   
    public static void main(String[] args) {

        int number=0; //memberikan nilai 0 kepada number agar while bisa melakukan loopig
        Scanner input = new Scanner(System.in);//Scanner Input
        
    
        ArrayList<DataMahasiswa> datMa = new ArrayList<DataMahasiswa>();//Untuk Membuat Array List

        while (number !=5) {//While Looping Apabila kita memilih 5 maka program selesai
            System.out.println("MENU");//Pilihan Menu
            System.out.println("1. Buat Objek Mahasiswa");
            System.out.println("2. Edit Data (Nama atau Nilai) Mahasiswa");
            System.out.println("3. Remove objek mahasiswa");
            System.out.println("4. Tulis Laporan Ke File TXT");
            System.out.println("5. EXIT");
            System.out.println("Masukan Pilihan Anda : ");
            number = input.nextInt(); 

            switch (number){//Switch di gunakan untuk perintah memilih
                case 1:
                System.out.println("===Buat Menu Mahasiswa==="); //Menu Untuk Menginputkan data mahasiswa
                int id, nilai;

                System.out.println("Input ID : ");//input data
                id = input.nextInt();
                boolean idExists = false;
                    for (DataMahasiswa mahasiswaData : datMa) {//perintah agar data tidak di input 2x
                        if (mahasiswaData.getId() == id) {
                            idExists = true;
                            break;
                        }
                    }

                System.out.print("Input Nama: ");
                input.nextLine(); 

                String nama = input.nextLine();
                System.out.print("Input Nilai: ");
                nilai = input.nextInt();

                datMa.add(new DataMahasiswa(id, nama, nilai));
                System.out.println("Data Mahasiswa Berhasil di tambahkan");
                System.out.println( );

                break;

                case 2:
                System.out.println("===Edit Data (Nama atau Nilai) Mahasiswa===");//Pilihan nomor 2
                System.out.println("Input ID Mahasiswa : ");//Untuk Menginput ID
                int idm = input.nextInt();
                

                boolean isFound = false;
                for (DataMahasiswa m : datMa) { 
                    if (m.getId()==idm) {
                        isFound = true;

                        System.out.println("1. Edit Nama");
                        System.out.println("2. Edit Nilai");

                        System.out.print("Masukkan pilihan: ");
                        int editChoice = input.nextInt();

                        if (editChoice == 1) {
                            System.out.print("Masukkan Nama baru: ");
                            String newNama = input.next();
                            

                            System.out.println("Nama Mahasiswa berhasil diubah.");
                        } else if (editChoice == 2) {
                            System.out.print("Masukkan Nilai baru: ");
                            int newNilai = input.nextInt();
                            m.setNilai(newNilai);

                            System.out.println("Nilai Mahasiswa berhasil diubah.");
                        }
                    }
                }
                    
                    case 3:
                    System.out.print("Masukkan ID Mahasiswa yang akan dihapus: ");//pilihan noor 3
                    String in = input.nextLine();
    
                    boolean nothing = false;
                    for (DataMahasiswa m : datMa) {  //looping untuk mencari data mahasiswa
                        if (m.getId()==in) {
                            nothing = true;
                            datMa.remove(m);
    
                            System.out.println("Mahasiswa dengan ID " + in + " berhasil dihapus.");
                            break;
                        }
                    }
    
                    if (!isFound) {
                        System.out.println("Mahasiswa dengan ID " + in + " tidak ditemukan.");
                    }
                    }
                }
                    



                


            }
        } 
    

    
       

    

