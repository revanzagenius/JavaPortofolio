 import java.util.*;
 import java.io.*;

public class MenuMahasiswa {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        Scanner input = new Scanner(System.in);
        int masukan ;
        ArrayList<DaftarMahasiswa> mahasiswaMahasiswa = new ArrayList<>();


        System.out.println("-------MENU-------");

        do {

            System.out.println("Pilih no yang ada di bawah ini :");
            System.out.println("1. Buat Object Mahasiswa");
            System.out.println("2. Edit Data (Nama atau Nilai) Mahasiswa");   
            System.out.println("3. Remove Object Mahasiswa");
            System.out.println("4. Tulis Laporan ke File TXT");
            System.out.println("5. Exit");
            
            BufferedReader masuk = new BufferedReader(isr);
            System.out.print("Input nomor : ");
            masukan = Integer.parseInt(masuk.readLine());


            switch (masukan) {
            
            case 1 : //Buat object mahasiswa
            System.out.println("Buat Object Mahasiswa");
            System.out.print("Input Jumlah Mahasiswa\t : ");
            int jumlahMahasiswa = Integer.parseInt(masuk.readLine());
            for (int i = 1; i <= jumlahMahasiswa; i++) {

                System.out.println("Mahasiswa : " + i);
                BufferedReader br = new BufferedReader(isr);
                System.out.print("Input ID\t\t : ");
                int inputID = Integer.parseInt(br.readLine());
                System.out.print("Input Nama\t : ");
                String inputNama = br.readLine();
                System.out.print("Input Nilai\t :");
                int inputNilai = Integer.parseInt(br.readLine());

                mahasiswaMahasiswa.add(new DaftarMahasiswa(inputID, inputNama, inputNilai));
                System.out.println("Mahasiswa berhasil ditambahkan.");
                }
            
            break;
           
            case 2:
            System.out.print("\nInput ID Mahasiswa: ");
            int editId = input.nextInt();//user menginput id yang ingin di edit
            boolean found = false;//mendeklarasikan type data boolean untuk mencari id yang diinput

            for (DaftarMahasiswa m : mahasiswaMahasiswa) {
                if (m.getId() == editId) {
                found = true;//jika id yang dicari ditemukan maka akan lanjut
                System.out.println(m.toString());
                System.out.println("Pilih menu:");
                System.out.println("1. Edit Nama");
                System.out.println("2. Edit Nilai");
                System.out.print("Pilih menu: ");
                int editMenu = input.nextInt();//user menginput menu yang ingin dipilih

                switch (editMenu) {//pilihan edit
                    case 1:
                    System.out.print("Nama: ");
                    String newNama = input.next();//user menginput data yang ingin dimasukkan
                    m.setNama(newNama);//setelah diinput akan tersimpan didalam ArrayList
                    break;//memaksa sebuah perulangan berhenti sebelum waktunya
                    case 2:
                    System.out.print("Nilai: ");
                    int newNilai = input.nextInt();//user menginput data yang ingin dimasukkan
                    m.setNilai(newNilai);//setelah diinput akan tersimpan didalam ArrayList
                    break;//memaksa sebuah perulangan berhenti sebelum waktunya
                    default:
                    System.out.println("Menu tidak ditemukan.");
                    break;//memaksa sebuah perulangan berhenti sebelum waktunya
                    }

                    System.out.println("Data mahasiswa berhasil diubah.");//setelah diedit maka akan dicetak seperti ini
                    break;//memaksa sebuah perulangan berhenti sebelum waktunya
                }
            }
            if (!found) {
                System.out.println("Mahasiswa tidak ditemukan.");//jika id yang dicari tidak ditemukan
            }
            break;//memaksa sebuah perulangan berhenti sebelum waktunya

            case 3 :
            BufferedReader br3 = new BufferedReader(isr);
            System.out.print("Input ID Mahasiswa yang akan diedit: ");
            int idMahasiswa = Integer.parseInt(br3.readLine());

            int index2 = -1;
    
            if (index2 == -1) {
            System.out.println("Mahasiswa tidak ditemukan.");
            return;
            }
            
            for (int i = 0; i < mahasiswaMahasiswa.size(); i++) {
                if (mahasiswaMahasiswa.get(i).getId() == idMahasiswa) {
                    index2 = i;
                    break;
                }
            }

            Object obj = idMahasiswa;
            boolean removed = mahasiswaMahasiswa.remove(obj);
            System.out.println("Is the object removed? " + removed);
            break;

            case 4 :
            BufferedReader br4 = new BufferedReader(isr);
            System.out.println("1. Tulis String -> Menulis Ke File");
            System.out.print("Masukan Nama Directory :");
            String namaDc1 = br4.readLine();
            System.out.print("Masukan File Directory :");
            String namaFile1 = br4.readLine();
            String namaDocument = namaDc1 + "\\" + namaFile1; // bisa juga pakai "/" satu aja
            System.out.println(namaDocument);
            FileWriter fw = new FileWriter(namaDocument);
            BufferedWriter bw2 = new BufferedWriter(fw);
            bw2.write(mahasiswaMahasiswa);
            bw2.flush();
            System.out.println("Berhasil Bang jago");
            System.out.println();
            break;

            case 5 :
            System.out.println("Bye bye Ganteng !!!");

            default :
            System.out.println("Nomor yang anda masukan tidak ada!");
            System.out.println();
            }


        }while (masukan != 5 );
        
    }   
}
