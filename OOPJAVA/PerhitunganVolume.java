package OOPJAVA;
import java.util.*;

abstract class RumusVolume {
    int panjangBalok;
    int lebarBalok;
    int tinggiBalok;
    double jariJariBola;
    double pi = 3.14;
    double tinggiTabung;
    double jariJariTabung;

    RumusVolume(int pb, int lb, int tb){
        this.panjangBalok = pb;
        this.lebarBalok = lb;
        this.tinggiBalok = tb;
    }

    RumusVolume(double jjB){
        this.jariJariBola = jjB;
    }

    RumusVolume(double tTabung, double jjTabung){
        this.jariJariTabung = tTabung;
        this.jariJariTabung = jjTabung;
    }

    abstract double rumus();
}

class RumusBalok extends RumusVolume{

    public RumusBalok(int pb, int lb, int tb){
        super(pb, lb, tb);
    }

    public double rumus(){
        return panjangBalok * lebarBalok * tinggiBalok;
    }
}

class RumusBola extends RumusVolume{

    public RumusBola(double jjB){
        super(jjB);
    }

    public double rumus(){
        return (4 * pi * (jariJariBola*jariJariBola*jariJariBola))/3;
    }
}

class RumusTabung extends RumusVolume{

    public RumusTabung(double jjTabung, double tTabung){
        super(jjTabung,tTabung);
    }

    public double rumus(){
        return (pi * (jariJariTabung*jariJariTabung) *tinggiTabung);
    }
}

public class PerhitunganVolume {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int masukan;
        //Double pi = 3.14;

        System.out.println("-------MENU-------");


        do {
            System.out.println("1. Volume Balok");
            System.out.println("2. Volume Bola");
            System.out.println("3. Volume Tabung");
            System.out.println("4. Exit");

            System.out.print("Input nomor : ");
            masukan = input.nextInt();

            switch(masukan){

                case 1 : //Balok
                System.out.println("Volume Balok");
                System.out.print("Panjang Balok : ");
                int pB = input.nextInt();
                System.out.print("Lebar Balok : ");
                int lB = input.nextInt();
                System.out.print("Tinggi Balok : ");
                int tB = input.nextInt();
                RumusBalok rumusBangun1 = new RumusBalok(pB, lB, tB);
                System.out.println("Volume Balok adalah " + rumusBangun1.rumus());
                System.out.println();
                break;

                case 2 : //Bola
                System.out.println("Volume Bola");
                System.out.print("Jari jari Bola : ");
                Double jjBola = input.nextDouble();
                System.out.print("Masukan nilai pi :");
                RumusBola rumusBangun2 = new RumusBola(jjBola);
                System.out.println("Volume Balok adalah " + rumusBangun2.rumus());
                System.out.println();
                break;

                case 3 : //Tabung
                System.out.println("Volume Tabung");
                System.out.print("Jari jari Tabung : ");
                double jjTabung = input.nextDouble();
                System.out.print("Tinggi Tabung : ");
                double tTabung = input.nextDouble();
                RumusTabung rumusTabung = new RumusTabung(jjTabung, tTabung);
                System.out.println("Volume Balok adalah " + rumusTabung.rumus());
                System.out.println();
                break;
                
                case 4 :
                System.out.println("Bye bye Ganteng !!!");
                System.out.println();
                break;

                default :
                System.out.println("Nomor yang anda masukan tidak ada!");
                System.out.println();

            }
        } while (masukan != 5);

        input.close();

    }
}