package OOPJAVA;
import java.util.Scanner;
import java.util.*;
class Bantu {
    //Mencari Volume Balok
    double volBangun(double panjang,double lebar,double tinggi){
        return panjang * lebar * tinggi; 
    }
    //Mencari Volume Bola
    Double volBangun (Double phi,Double r){
        return (4 * phi * r * r * r)/3;
    }

    //Mencari Volume Tabung
    Double volBangun (Double phi2,Double jariJari ,Double t){
        return (phi2 * jariJari* jariJari) * t;
    }

}

public class VolumeBangun {
    public static void main(String[] args) {
    Bantu obj = new Bantu();
    //Scaner input yang akan di inputkan oleh user untuk memilih menu
    Scanner input = new Scanner(System.in);
    
    Integer nomor=0;

    
    //Perulangan While untuk mengulang menu yang akan di pilih oleh user
    while (nomor !=4){
        System.out.println("MENU");
        System.out.println("1. Volume Balok");
        System.out.println("2. Volume Bola");
        System.out.println("3. Volume Tabung");
        System.out.println("4. EXIT");
        
        System.out.println("Input Nomor : ");
        nomor = input.nextInt();
        

    //Switch Case logika percabangan yang dimana ketika user memilih menu maka switch case akan bekerja sesuai dengan menu yang di pilih oleh user
    switch(nomor){
        //Swirch Case Volume Balok
        case 1:
        System.out.println("Masukan Panjang : ");
        double panjang = input.nextInt();
        System.out.println("Masukan Lebar : ");
        double lebar = input.nextInt();
        System.out.println("Masukan tinggi : ");
        double tinggi = input.nextInt();

        System.out.println("Volume balok = " + obj.volBangun(panjang, lebar, tinggi) );
        System.out.println();
        break;
         
        //Switch Case Volume Bola
        case 2:
        System.out.print("Masukkan Phi : ");
        Double phi=input.nextDouble();
        System.out.print("Masukkan Jari-jari (r) : ");
        Double r = input.nextDouble();
        System.out.println("Volume Bola = " + obj.volBangun(phi, r));
        System.out.println();
        break;

        // Switch Case Volume Tabung
        case 3:
        System.out.print("Masukkan phi : ");
        double phi2=input.nextInt();
        System.out.print("Masukkan jariJari : ");
        double jariJari = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        double t = input.nextInt();

        System.out.println("Umur Anda = " + obj.volBangun(phi2, jariJari, t));
        System.out.println();
        break;
        case 4:
        break;
        
    }
    }
       
    }
    
}

