package I.O;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class TugasDay5 {
    public static void main(String[] args)throws Exception{
    Scanner input = new Scanner(System.in);
    int nomor =0;
    InputStreamReader r = new InputStreamReader(System.in); 
   



        while(nomor !=3){
            System.out.println("MENU");
            System.out.println("1. Tulis String");
            System.out.println("2. Baca String");
            System.out.println("3. Exit");
            
            System.out.println("Masukan Pilihan : ");
            nomor = input.nextInt();
            BufferedReader masukan = new BufferedReader(r);

        switch (nomor) {
            case 1:
                BufferedReader baca = new BufferedReader(r);
                System.out.println("Masukan Directory : ");
                String directory = input.nextLine();
                input.nextLine();
                System.out.println("Masukan Nama File : ");
                String namaFile =  input.nextLine();
                System.out.println("Nama : ");
                String nama = input.nextLine();
                System.out.println("Tempat Lahir : ");
                String tempatLahir = input.nextLine();
                System.out.println("Masukan Tanggal Lahir : ");
                String tanggalLahir = input.nextLine();
                String directoryFile = directory + "\\" + namaFile;
                String biodata = nama + "\n" + tempatLahir + "\n" + tanggalLahir;


                
                FileWriter fw = new FileWriter(directoryFile);
                
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(biodata);
                bw.flush();
                bw.close();
                fw.close();
                fw.close();

                System.out.println( );
                System.out.println("File Telah Di Buat");
                break;

            case 2:
            BufferedReader baca2 = new BufferedReader(r);
                System.out.print("Masukan Nama Directory :");
                String directory2 = baca2.readLine();
                System.out.print("Masukan File Directory :");
                String namaFile2 = baca2.readLine();
                FileReader fr = new FileReader(directory2 + "\\" + namaFile2);
                BufferedReader baca3 = new BufferedReader(fr);

                int i;
                while ((i = baca3.read()) !=-1){
                    System.out.print((char)i);
                }
                System.out.println( );


                break;
            case 3:
            break;
        }
    }
    }
    
}
