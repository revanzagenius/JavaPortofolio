package OOPJAVA;
import java.util.Scanner;

abstract class AbstractBangunRuang {
  abstract void volume();
}


class VolumeBalok extends AbstractBangunRuang{
 public void volume(){
       System.out.println();
       Scanner input = new Scanner(System.in);
       System.out.println("Volume Balok");
       System.out.print("Panjang = "); int panjang = input.nextInt();
       System.out.print("Lebar = "); int lebar = input.nextInt();
       System.out.print("Tinggi = "); int tinggi = input.nextInt();
       int balok = panjang*lebar*tinggi;
       System.out.print("Volume balok = " + balok);
       System.out.println();
 }
}

class VolumeBola extends AbstractBangunRuang {
  public void volume(){
       System.out.println();
       float phi;
       Scanner input = new Scanner(System.in);
       System.out.println("Volume Bola");
       System.out.print("Jari-jari (r) = "); double jari = input.nextDouble();
       System.out.print("Phi = "); phi = input.nextFloat();
       double bola = phi*jari*jari*jari;
       System.out.print("Volume bola = " + (4*bola/3));
        System.out.println();
  }
}

class VolumeTabung extends AbstractBangunRuang {
  public void volume(){
        System.out.println();
        float phi;
        Scanner input = new Scanner(System.in);
        System.out.println("Volume Tabung");
        System.out.print("Masukan nilai Jari-jari (r) = "); double jariTabung = input.nextDouble();
        System.out.print("Phi = "); phi = input.nextFloat();
        System.out.print("Masukan Tinggi tabung = "); double tinggi = input.nextDouble();
        double tabung = jariTabung*jariTabung*phi*tinggi;
        System.out.print("Volume tabung = " + tabung);
         System.out.println();
  }
}

class BangunRuangAbstract {
 public static void main(String[] args){
  int nomor = 0;
  System.out.println("Untuk menghitung beberapa menu di bawah silahkan input beberapa data yang dibutuhkan");
  System.out.println("----------------------Menu----------------------");
  while(nomor<4) { 
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("MENU");
      System.out.println("1. Volume Balok");
      System.out.println("2. Volume Bola");
      System.out.println("3. Volume Tabung");
      System.out.println("4. EXIT");
      System.out.println();
      System.out.print("Input nomor : "); nomor = input.nextInt();
      
      switch(nomor) {
        case 1 :
           VolumeBalok ml = new VolumeBalok();
           ml.volume();
        case 2 :
           VolumeBola sl = new VolumeBola();
           sl.volume();
        case 3 :
           VolumeTabung pl = new VolumeTabung();
           pl.volume();
        case 4 :
        break;
      }  // tutup switch case
  }//tutup while
 }
}