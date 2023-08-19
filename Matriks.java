import java.util.Scanner;
public class Matriks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ambil = new Scanner (System.in);
		int baris, kolom, i, j;
		
		System.out.println("-----------------------------------------------");
		System.out.println("	MEMBUAT PROGRAM MATRIKS");
		System.out.println("-----------------------------------------------");
		
		System.out.print("Masukkan baris array integer  : ");
		baris = ambil.nextInt();
		System.out.print("Masukkan kolom array integer    : ");
		kolom = ambil.nextInt();
		
		Integer[][] matriks = new Integer [baris][kolom];
		
		for (i=0; i < baris; i++) {
			for(j = 0; j < kolom; j++) {
			System.out.print("Indeks["+i+","+j+"] : ");
			matriks [i][j]=ambil.nextInt();
			}
		}
		System.out.println();
		System.out.println("Baris dan kolom Array 2 dimensi adalah ["+baris+","+kolom+"]");
		System.out.println("Array multidimensi 2 dimensi");
		for(i=0;i < baris; i++) {
			for(j=0; j < kolom; j++) {
				System.out.print(matriks[i][j]+" ");
			}
			System.out.println();
		}
	}

}
