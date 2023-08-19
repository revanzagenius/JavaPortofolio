package OOPJAVA.Interfacee;

interface Polygon{
    void getArea(int length, int beradth);
}

class Rectangle implements Polygon {
    public void getArea(int length , int beradth) {
        System.out.println("The Area of rectangle is : "+ (length * beradth));
    }
}

public class ImplementingAnInterface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }

    
}
