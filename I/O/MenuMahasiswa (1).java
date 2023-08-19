package I.O;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuMahasiswa {
    private String ID;
    private String Nama;
    private int Nilai;

    public MenuMahasiswa(String ID, String Nama, int Nilai) {
        this.ID = ID;
        this.Nama = Nama;
        this.Nilai = Nilai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNilai() {
        return Nilai;
    }

    public void setNilai(int Nilai) {
        this.Nilai = Nilai;
    }

    public static void main(String[] args) {
        ArrayList<MenuMahasiswa> mahasiswaList = new ArrayList<MenuMahasiswa>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Buat Object Mahasiswa");
            System.out.println("2. Edit Data (Nama atau Nilai) Mahasiswa");
            System.out.println("3. Remove Object Mahasiswa");
            System.out.println("4. Tulis Laporan ke File TXT");
            System.out.println("5. Exit");

            System.out.print("Masukkan pilihan menu: ");
            int menuChoice = scanner.nextInt();

            if (menuChoice == 1) {
                System.out.print("Masukkan ID: ");
                String ID = scanner.next();

                boolean isDuplicateID = false;
                for (MenuMahasiswa m : mahasiswaList) {
                    if (m.getID().equals(ID)) {
                        isDuplicateID = true;
                        break;
                    }
                }

                if (isDuplicateID) {
                    System.out.println("ID sudah digunakan. Silahkan gunakan ID lain.");
                } else {
                    System.out.print("Masukkan Nama: ");
                    String Nama = scanner.next();
                    System.out.print("Masukkan Nilai: ");
                    int Nilai = scanner.nextInt();

                    MenuMahasiswa newMahasiswa = new MenuMahasiswa(ID, Nama, Nilai);
                    mahasiswaList.add(newMahasiswa);

                    System.out.println("Mahasiswa baru berhasil ditambahkan.");
                }
            } else if (menuChoice == 2) {
                System.out.print("Masukkan ID Mahasiswa: ");
                String ID = scanner.next();

                boolean isFound = false;
                for (MenuMahasiswa m : mahasiswaList) {
                    if (m.getID().equals(ID)) {
                        isFound = true;

                        System.out.println("1. Edit Nama");
                        System.out.println("2. Edit Nilai");

                        System.out.print("Masukkan pilihan: ");
                        int editChoice = scanner.nextInt();

                        if (editChoice == 1) {
                            System.out.print("Masukkan Nama baru: ");
                            String newNama = scanner.next();
                            m.setNama(newNama);

                            System.out.println("Nama Mahasiswa berhasil diubah.");
                        } else if (editChoice == 2) {
                            System.out.print("Masukkan Nilai baru: ");
                            int newNilai = scanner.nextInt();
                            m.setNilai(newNilai);

                            System.out.println("Nilai Mahasiswa berhasil diubah.");
                        }
                    }
                }

                if (!isFound) {
                    System.out.println("Mahasiswa dengan ID " + ID + " tidak ditemukan.");
                }
            } else if (menuChoice == 3) {
                System.out.print("Masukkan ID Mahasiswa yang akan dihapus: ");
                String ID = scanner.next();

                boolean isFound = false;
                for (MenuMahasiswa m : mahasiswaList) {
                    if (m.getID().equals(ID)) {
                        isFound = true;
                        mahasiswaList.remove(m);

                        System.out.println("Mahasiswa dengan ID " + ID + " berhasil dihapus.");
                        break;
                    }
                }

                if (!isFound) {
                    System.out.println("Mahasiswa dengan ID " + ID + " tidak ditemukan.");
                }
            } else if (menuChoice == 4) {
                try {
                    System.out.print("Masukkan nama file: ");
                    String fileName = scanner.next();
                    System.out.print("Masukkan direktori: ");
                    String directory = scanner.next();

                    File file = new File(directory + "\\" + fileName + ".txt");
                    if (file.createNewFile()) {
                        FileWriter writer = new FileWriter(file);

                        writer.write("LAPORAN NILAI MAHASISWA\n");
                        writer.write("=======================\n");

                        for (MenuMahasiswa m : mahasiswaList) {
                            writer.write("ID: " + m.getID() + "\n");
                            writer.write("Nama: " + m.getNama() + "\n");
                            writer.write("Nilai: " + m.getNilai() + "\n\n");
                        }

                        writer.close();

                        System.out.println("Laporan berhasil disimpan di file " + fileName + ".txt di direktori " + directory + ".");
                    } else {
                        System.out.println("File sudah ada. Silahkan gunakan nama file yang lain.");
                    }
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan saat menulis file.");
                }
            } else if (menuChoice == 5) {
                System.out.println("Program selesai. Sampai jumpa lagi!");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid. Silahkan coba lagi.");
            }
        }
    scanner.close();
    }
}

