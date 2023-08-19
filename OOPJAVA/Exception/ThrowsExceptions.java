package OOPJAVA.Exception;
import java.io.IOException;

import OOPJAVA.Main;

public class ThrowsExceptions {
    void m() throws IOException {
        throw new IOException("Device Eror");
    }
    void n() throws IOException{
        m();
    }
    
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception Heandle");
        }
    }

    public static void main(String[] args) {
        ThrowsExceptions obj = new ThrowsExceptions();
        obj.p();
        System.out.println("Normal Flow...");
    }
}
