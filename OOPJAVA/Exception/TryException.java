package OOPJAVA.Exception;

public class TryException {
    public static void main(String[] args) {
    try {
        //int data = 50/0;
        String nama = null;
        System.out.println(nama.length());
        
    } catch (Exception e) {
      System.out.println("Ada Eror : " + e);
    }
    System.out.println("Rest the code...");
    
}
}
