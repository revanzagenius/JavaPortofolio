import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

    Double x;
    Double y;
    Double result;
    
    Scanner input = new Scanner(System.in);
    System.out.println(" Chose And Operator + , - , * or / =");
    String operator = input.nextLine();

    System.out.println(" Enter First Number =");
    x = input.nextDouble();
    System.out.println(" Enter Second number =");
    y = input.nextDouble();

    if (operator.equals("+") ){
        System.out.println(result = x + y);
    }else if(operator.equals("-") ){
        System.out.println(result = x - y);
    }else if(operator.equals("*")){
        System.out.println(result = x * y);
    }else if(operator.equals("/")){
        System.out.println(result = x / y);
    }
    }
}
