package I.O;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\TestInput\\Testout.txt");
            fw.write("Revanza Programer Hebat");
            fw.close();
            } catch (Exception e) {System.out.println(e);}
            System.out.println("Success.....");
    }
    
}
