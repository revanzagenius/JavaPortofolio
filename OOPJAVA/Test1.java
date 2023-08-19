package OOPJAVA;

public class Test1 {
    public int addNumbers(int a , int b ){
        int sum = a + b ;
        return sum ;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

    Test1 obj = new Test1();
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is : " +  result);
    }
    
}
