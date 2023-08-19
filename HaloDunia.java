import java.util.Scanner;

public class HaloDunia {
    public static void main(String[] args) {
        int firstRows, firstCols, secondRows, secondCols, c, d, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num of rows and columns:");
        firstRows = scan.nextInt();
        firstCols = scan.nextInt();

        int first[] = new int[firstRows * firstCols];
        System.out.println("enter the value of first matrix");
        for (c = 0; c < firstRows * firstCols; c++) {
            first[c] = scan.nextInt();
        }

        System.out.println("enter the num of rows and columns second matrix");
        secondRows = scan.nextInt();
        secondCols = scan.nextInt();
        int second[] = new int[secondRows * secondCols];
        int answer[] = new int[firstRows * secondCols];

        System.out.println("enter the elements of second matrix");
        for (c = 0; c < secondRows * secondCols; c++) {
            second[c] = scan.nextInt();
        }
        scan.close();

        if ( firstCols != secondRows ) {
            throw new IllegalArgumentException("A:Rows: " + firstCols + " did not match B:Columns " + secondRows + ".");
        }

        for (c = 0; c < firstRows; c++) {
            for (d = 0; d < secondCols; d++) {
                for (k = 0; k < firstCols; k++) {
                    answer[(c * secondCols) + d] += first[(c * firstCols) + k] * second[(k * secondCols) + d];
                    //Equivalent to  answer[c][d] += first[c][k] * second[k][d];
                }
            }
        }

        System.out.println("The product is ");
        for (c = 0; c < firstRows; c++) {
            for (d = 0; d < secondCols; d++) {
                System.out.print(answer[(c * secondCols) + d] + "\t");
            }
            System.out.println();
        }
    }
}