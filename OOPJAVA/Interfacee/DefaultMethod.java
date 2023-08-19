package OOPJAVA.Interfacee;

interface Polygon{
    void getArea();


default void getSides(){
    System.out.println("I can get side of a polygon");
}
}

class Rectangle implements Polygon{
    public void getArea(){
        int length = 6;
        int beradth = 5;
        int area = length * beradth;
        System.out.println("the area of the rectangle is" + length * beradth);
    }

    public void getSides(){
        System.out.println("I Have 4 Sides");
    }
}

class Square implements Polygon{
    public void getArea(){
        int length = 5;
        int area = length * length ;
        System.out.println(" the area of the squre is " + area);
    }
}


public class DefaultMethod {
    public static void main(String[] args) {
        Rectangle r1 =  new Rectangle();
        r1.getArea();
        r1.getSides();

        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}
