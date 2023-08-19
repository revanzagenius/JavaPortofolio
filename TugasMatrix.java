import java.util.Scanner;
import java.util.Arrays;

public class TugasMatrix {
    public static void main(String[] args) {
    int panjang;
    int i;

    Scanner input = new Scanner (System.in);
    System.out.println("Panjang Aray Integer : ");
    panjang = input.nextInt();

    Integer[] matriks = new Integer [panjang];

    for (i=0; i < panjang; i++ ){
        System.out.print("Index["+i+"] : ");
			matriks [i]=input.nextInt();
    }
    System.out.println();
		System.out.println("Panjang Array Integer adalah :  ["+panjang+"]");
        System.out.println(Arrays.toString(matriks));
}
}