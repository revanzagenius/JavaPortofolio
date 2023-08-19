package out.production.DasarJava;

public class Oprator {
    //Nomor 1
    public static void main (String[] args){
        Integer panjang = 12;
        Integer lebar = 8;
        Integer luas = panjang * lebar;
        
    System .out.println(luas);

    //Nomor 2
        Float alas =  7.0f;
        Float tinggi = 3.5f;
        Float hasil = alas * tinggi /2;

    System .out.println(hasil);

    //Nomor 3
        //Menggunakan Percabangan
        if (luas > hasil) {    
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //Menggunakan Boolean
        Boolean banding = luas > hasil;
        
    System.out.println(banding);

    //Nomor 4
        int num = luas;
        ++num;
        ++num;
        ++num;
        ++num;
        ++num;
        ++num;
        --num;
        --num;
        --num;
        System.out.println(num); 

    }
}
