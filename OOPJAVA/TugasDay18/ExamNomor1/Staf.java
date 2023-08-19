package OOPJAVA.TugasDay18.ExamNomor1;
import java.util.ArrayList;//library yang di gunakan agar kita bisa memanggil ArayList

public class Staf extends Worker {//Class Staff yang di extends ke ke superclass Worker
    String jabatan;//variable jabatan

    Staf(String idKaryawan , String nama , String jabatan ){
        super(idKaryawan, nama);
        this.jabatan = jabatan;
}
}
