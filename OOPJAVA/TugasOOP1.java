// package OOPJAVA;
import java.util.Scanner;

public class TugasOOP1 {
    public int penjumlahan(int a , int b ){
        int penjumlahan = (a + b);

        return penjumlahan;
    }

    public int pengurangan(int a , int b ){
        int pengurangan = (a - b);

        return pengurangan;
    }

    public int perkalian(int a , int b ){
        int perkalian = (a * b);

        return perkalian;
    }

    public int pembagian(int a , int b ){
        int pembagian = (a / b);

        return pembagian;
    }


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Integer nomor=0;
    
    
    while (nomor !=5){
        System.out.println("MENU");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. EXIT");
        
        System.out.println("Input Nomor : ");
        nomor = input.nextInt();
        

    switch(nomor){
        case 1:
            System.out.println("Masukan Bilangan 1 : ");
            Integer bilangan1 = input.nextInt();
            System.out.println("Masukan Bilangan 2 : ");
            Integer bilangan2 = input.nextInt();
        
            TugasOOP1 obj = new TugasOOP1();
            int result = obj.penjumlahan(bilangan1, bilangan2);
            System.out.println("Hasil Penjumlahan = " +  result);
        break;

        case 2:
        System.out.print("Masukkan Bilangan 1 : ");
        Integer x=input.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        Integer y = input.nextInt();

        TugasOOP1 kurang = new TugasOOP1();
            int pengurangan = kurang.pengurangan(x, y);
            System.out.println("Hasil Pengurangan = " +  pengurangan);
        break;

        case 3:
        System.out.print("Masukkan Bilangan 1 : ");
        int v=input.nextInt();
        System.out.print("Masukkan Tahun Bilangan 2 : ");
        int w = input.nextInt();

        TugasOOP1 perkalian = new TugasOOP1();
        int kali = perkalian.perkalian(v,w);
        System.out.println("Hasil Perkalian = " +  perkalian);

        break;
        case 4:
        System.out.print("Masukkan Bilangan 1 : ");
        int s=input.nextInt();
        System.out.print("Masukkan Tahun Bilangan 2 : ");
        int t = input.nextInt();

        TugasOOP1 pembagian = new TugasOOP1();
        int bagi = pembagian.perkalian(s,t);
        System.out.println("Hasil Pembagian = " +  pembagian);
        break;

        case 5:
        break;
        
    }
    }

    
        
    
    
}

    
}
