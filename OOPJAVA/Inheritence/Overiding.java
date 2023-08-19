package OOPJAVA.Inheritence;

class Binatang{
    public void eat(){
        System.out.println(" Aku Mau Makan ");
    }
}

class Anjing extends Binatang{
    @Override
    public void eat(){
        super.eat();
        System.out.println("Aku Makan Makanan Anjing");
    }
    public void gongGong(){
        System.out.println(" I Akan Menggong Gong ");
    }
}



public class Overiding {
    public static void main(String[] args) {
        
    
    Anjing hewan = new Anjing();
    hewan.eat();
    hewan.gongGong();  
}
}
