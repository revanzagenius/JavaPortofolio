package I.O;
import java.io.*;

public class BufferdInputExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fin= new FileInputStream("D:\\TestInput\\Testout.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        try{
        int i;
        while ((i = bin.read())!=-1) {
            System.out.print((char)i);
        }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}

    
