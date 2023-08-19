package I.O;
import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\TestInput\\Testout.txt");
            //int i = fin.read(); //Untuk Membaca 1 Character saja
            int i =0;
            while ((i = fin.read())!=-1){ // Untuk Membaca Banyak Character sekaligus
                System.out.print((char)i);
            }
            fin.close();
        } catch (Exception e) {System.out.println(e);}
    }
    
}
