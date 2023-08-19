package OOPJAVA;
import java.util.Scanner;

abstract class RuangBangun {
    Double phi;
    Double r;
    int panjang;
    int lebar;
    int tinggi;
    Double phi2;
    Double jariJari ;
    Double tinggi2;

    RuangBangun (int pan,int leb,int ting){
        this.panjang = pan;
        this.lebar = leb;
        this.tinggi = ting;

    }
    RuangBangun(Double phi,Double r ){
        this.phi = phi;
        this. r = r;
    }
    RuangBangun(Double p , Double j ,Double t  ){
        this.phi2 = p;
        this.jariJari = j;
        this.tinggi2 = t;
    }
     abstract double rumus();   
}


 class VolumeBalok extends RuangBangun {
    VolumeBalok(int pan,int leb,int ting){
        super(pan,leb,ting);
    }
    public double rumus(){
        return panjang *lebar*tinggi;
    }
    
}

 class VolumeBola extends RuangBangun {
    VolumeBola(double phi,double r){
        super(phi,r);
    }
    public double rumus(){
        return (4 * phi* r * r * r)/3;
    }
    
}
 class VolumeTabung extends RuangBangun {
    VolumeTabung(double p , double j , double t){
        super(p,j,t);
    }
    public double rumus(){
        return (phi2 * jariJari* jariJari) * tinggi2;
    }
    
}


public class OveridingAndOverloading {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int number = 0;

     while (number !=4){
        System.out.println("MENU");
        System.out.println("1. Volume Balok");
        System.out.println("2. Volume Bola");
        System.out.println("3. Volume Tabung");
        System.out.println("4. EXIT");
        
        System.out.println("Input Nomor : ");
        number = input.nextInt();

    switch (number) {
        case 1:
            System.out.println();
            System.out.println("Volume Balok");
            System.out.println("Masukan Panjang : ");
            int pan = input.nextInt();
            System.out.println("Masukan Lebar : ");
            int leb = input.nextInt();
            System.out.println("Masukan Tinggi : ");
            int ting = input.nextInt();

            VolumeBalok vb = new VolumeBalok (pan,leb,ting);
            System.out.println("Volume Balok adalah " + vb.rumus());
            System.out.println();
            
            break;
        
        case 2:
            System.out.println();        
            System.out.println("Volume Bola");
            System.out.print("Masukan Phi : ");
            Double phi = input.nextDouble();
            System.out.print("Masukan r :");
            Double r = input.nextDouble();
            VolumeBola vb2 = new VolumeBola(phi,r);
            System.out.println("Volume Balok adalah " + vb2.rumus());
            System.out.println();
            break;

        case 3:
            System.out.println();
            System.out.println("Volume Tabung");
            System.out.print("Masukan Panjang : ");
            double p = input.nextDouble();
            System.out.print("Masukan Jari - jari: ");
            double j = input.nextDouble();
            System.out.println("Masukan Tinggi : ");
            double t = input.nextDouble();

            VolumeTabung vt = new VolumeTabung (p,j,t);
            System.out.println("Volume Balok adalah " + vt.rumus());
            System.out.println();
            break;
        case 4:
            System.out.println("System Exit");
        default:
            break;
    }
    input.close();

     }

    }
    
}
