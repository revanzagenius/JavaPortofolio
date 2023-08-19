package OOPJAVA.TugasDay18.ExamNomor2;

public class Child extends Parent {//Membuat Subclass dengan nama Child dan extends dengan class Perent
    @Override //Mendeklarasikan Overriding karena di class Parent ada nama field yang sama
    void car(){
        System.out.println("Child \"\s s Car");
    }
    
}
