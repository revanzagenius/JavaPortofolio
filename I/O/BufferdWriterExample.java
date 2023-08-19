package I.O;
import java.io.*;

public class BufferdWriterExample {
    public static void main(String[] args) {
        try{
        FileWriter fw = new FileWriter("D:\\Test.txt");
        

        BufferedWriter bw = new BufferedWriter(fw);

        String s = "Welcome To G2";
        
        bw.write(s);
        bw.flush();
        bw.close();
        fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Sucess.....");
    }
    
}
