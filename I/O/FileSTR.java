import java.io.*;

public class FileSTR {
    public static void main(String[] args) throws IOException{
        
        //OutputStreamWriter osw = new OutputStreamWriter(System.out);
        InputStreamReader isr = new InputStreamReader(System.in);
        int masukan ;

        System.out.println("-------MENU-------");

        do {

            System.out.println("Pilih no yang ada di bawah ini :");
            System.out.println("1. Tulis String");
            System.out.println("2. Baca String");   
            System.out.println("3. Exit");
            
            BufferedReader masuk = new BufferedReader(isr);
            System.out.print("Input nomor : ");
            masukan = Integer.parseInt(masuk.readLine());

            switch (masukan) {

                case 1: // Tulis String
                BufferedReader br1 = new BufferedReader(isr);
                System.out.println("1. Tulis String -> Menulis Ke File");
                System.out.print("Masukan Nama Directory :");
                String namaDc1 = br1.readLine();
                System.out.print("Masukan File Directory :");
                String namaFile1 = br1.readLine();
                String namaDocument = namaDc1 + "\\" + namaFile1; // bisa juga pakai "/" satu aja
                // System.out.println(namaDocument);
                FileWriter fw = new FileWriter(namaDocument);
                BufferedWriter bw2 = new BufferedWriter(fw);
                System.out.print("Nama\t\t : ");
                String nama = br1.readLine();
                System.out.print("Tempat Lahir\t : ");
                String tempat = br1.readLine();
                System.out.print("Tanggal Lahir\t : ");
                String tanggal = br1.readLine();
                bw2.write(nama +"\n" + tempat + "\n" + tanggal);
                bw2.flush();
                // br1.close();
                // bw2.close();
                System.out.println("Berhasil Bang jago");
                System.out.println();
                break;
                    
                case 2 :
                BufferedReader br2 = new BufferedReader(isr);
                System.out.println("2. Baca String -> Membaca Dari File)");
                System.out.print("Masukan Nama Directory :");
                String namaDc2 = br2.readLine();
                System.out.print("Masukan File Directory :");
                String namaFile2 = br2.readLine();
                FileReader fr = new FileReader(namaDc2 + "\\" + namaFile2);
                BufferedReader br3 = new BufferedReader(fr);

                int i;
                while ((i = br3.read()) !=-1){
                    System.out.print((char)i);
                }

                // br3.close();
                // fr.close();
                // br2.close();
                System.out.println();

                break;

                case 3 :
                System.out.println("Bye bye Ganteng !!!");
                break;

                default :
                System.out.println("Nomor yang anda masukan tidak ada!");
                System.out.println();    
            }
        } while (masukan != 3 );
    
        // bw2.flush();
        // br1.close();
        // bw2.close();
        // br3.close();
        // fr.close();
        // br2.close();
        // osw.close();
        isr.close();

    }
}
