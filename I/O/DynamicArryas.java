package I.O;
import java.util.*;

import javax.sound.midi.Soundbank;

//ArrayList

public class DynamicArryas {
    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();//Untuk Membuat Array
    list.add("Revanza");
    list.add("Panegran");
    list.add("Hamdan");
    list.add("Paijo");

    Iterator isi = list.iterator();//Untuk memanggil Array List
    while(isi.hasNext()){//boolean untuk mengecek apakah ada isi atau tidak arrays itu
        System.out.println(isi.next());
    }
}
}
