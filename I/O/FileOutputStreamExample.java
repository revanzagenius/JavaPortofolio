package I.O;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("C:\\Windows\\Temp\\test.txt");
            fout.write(65);
            fout.close();
            System.out.println("Sucess.....");
        }catch(Exception e){System.out.println(e);}
    }

    
}
