package I.O;
import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout= new FileOutputStream("D:\\TestInput\\Testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s = " Welcome to G2";
        byte b[]= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.print("Success.....");
    }    
}
