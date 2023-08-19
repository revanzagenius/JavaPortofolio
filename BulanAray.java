import java.util.Scanner;

public class BulanAray {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Menentukan Nama Bulan ##");
    System.out.println("=========================================");
    System.out.println();
     
    int n;
     
    System.out.print("Input angka bulan (1-12): ");
    n = input.nextInt();
     
    String[] bulan = {
      "Januari", "Februari", "Maret", "April", 
      "Mei", "Juni","Juli", "Agustus", "September", "Oktober", 
      "November", "Desember"
    };
     
    if ((n < 1) || (n > 12)) {
      System.out.println("Pilihan tidak tersedia");
    }
    else {
      System.out.println(bulan[n-1]);
    }
 
  }
}

