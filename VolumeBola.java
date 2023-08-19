import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
    //Variable Penampung Nilai Input Scanner
    Integer jariJari;
    Double phi;
    
    //Input Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan phi : ");
    phi = input.nextDouble();
    System.out.println("Masukanjari-jari  :");
    jariJari = input.nextInt();
    
    //Output program
    System.out.println("Volume Bola : " + ( 4 * phi * jariJari * jariJari * jariJari )/3);
    }
}
