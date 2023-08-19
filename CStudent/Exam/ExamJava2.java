package Exam;
import java.util.*;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class ExamJava2 {
    
    public static void main(String[] args) {
        String username,password;
        int i,item,j;
        String a;
        int b;
        int c;
        
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Username : ");
    username = input.nextLine();
    System.out.println("Masukan Password : ");
    password = input.nextLine();
    
   
     if (username.equals("Revanza") && password.equals("rohis1403")){
        System.out.println("Selamat datang Harry , Masukan jumlah data item yang akan di jual :");
        item = input.nextInt();

        


        for (i = 1; i <= item; i++){
            System.out.println("Barang ["+i+"]");
        System.out.println("Masukan nama barang : ");
        a = input.nextLine();
        input.nextLine();
        System.out.println("Masukan jumlah barang : ");
        b = input.nextInt();
        System.out.println("Masukan harga satuan : ");
        c = input.nextInt();
        }
        
        Barang al = new Barang(a, b, c);
        ArrayList<Barang> barangs = new ArrayList<Barang>();
        barangs.add(al);
        barangs.add(al);
        barangs.add(al);
        barangs.add(al);

        for (i = 0; i < barangs.size(); i++){
        System.out.println(barangs.get(i));
        }

        
    }else{
        System.out.println("Username & Password yang anda masukan salah");
    }
    
}
}

