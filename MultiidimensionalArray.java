import java.util.Arrays;

public class MultiidimensionalArray {
    public static void main(String[] args) {
    int [][] siArray={
        {1,2,3},
        {4,5,6,9},
        {7},
    };

    for(int i=0; i<siArray.length;++i){
        for(int j = 0; j < siArray[i].length;++j){
            System.out.println("a["+i+"]["+j+"] : " + siArray[i][j]);
        }
        System.out.println();
    }

    
    
    System.out.println("Isi dari baris 1 = "+ Arrays.toString(siArray[0])+" Lenght of row 1 " + siArray[0].length);
    System.out.println("Isi dari baris 1 = "+ Arrays.toString(siArray[1])+" Lenght of row 1 " + siArray[1].length);
    System.out.println("Isi dari baris 1 = "+ Arrays.toString(siArray[2])+" Lenght of row 1 " + siArray[2].length);
 }
}
