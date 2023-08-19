import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class VolBangun {
    public double volomeBangun(double p , double l , double t){
        double volbalok = p*l*t;
        return volbalok;      
    }
    public double VolumeBangun (double phi , Double j){
        double volbol = phi*4*j*j*j/3;
        return volbol;
    }
    public double VolumeBangun (Double phi , Double j,Double t){
        double perkalian = phi*j*t;
        return perkalian;
    }
    public static void main(String[] args){
        System.out.println("\n\t=========   MULAI  ========\n");
        int nomor =0;
        
        Scanner ukuran = new Scanner(System.in);
        VolBangun obj = new VolBangun();
        while(nomor !=4){
            System.out.println("MENU ");
            System.out.println("1. Volume balok ");
            System.out.println("2. Volume bola ");
            System.out.println("3. Volume tabung  ");
            System.out.println("4. EXIT ");
            System.out.print("\nInput Nomor        = ");
            nomor = ukuran.nextInt();
            if (nomor == 1){
                System.out.print("panjang          =  ");
                double p = ukuran.nextDouble();
                System.out.print("lebar            =  ");
                double l = ukuran.nextDouble();
                System.out.print("tinggi           =  ");
                double t = ukuran.nextDouble();
                Double result = obj.volomeBangun(p, l, t);
                System.out.println("volome balok         : "+result );
            }
            else if(nomor == 2){
                System.out.print("phi             =  ");
                double phi = ukuran.nextDouble();
                System.out.print("jariJari        =  ");
                Double j = ukuran.nextDouble();
                double result = obj.VolumeBangun(phi, j);
                System.out.println("volome balok         : "+result );
            }
            else if(nomor == 3){
                System.out.print("phi                  =  ");
                Double phi = ukuran.nextDouble();
                System.out.print("jari-jari            = ");
                Double j = ukuran.nextDouble();
                System.out.print("tinggi               = ");
                Double t = ukuran.nextDouble();
                double result=obj.VolumeBangun(phi, j, t);
                System.out.println("volome balok         : "+result );
            }
            else if(nomor==4){
                System.out.println(" ");
            }
            else{
                System.out.println("\nnomor yang anda input salah, coba lagi");
            }
            break;
        }  
        System.out.println("\n\t=========  SELESAI  ========\n");
    }
    
}

































    

