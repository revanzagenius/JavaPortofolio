package OOPJAVA;

public class ParameterizedConstructor {
    String languages;

    ParameterizedConstructor (String lang) {
        languages = lang;
        System.out.println(languages + "Programing Language");

    }
     public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor("Java");
        ParameterizedConstructor obj2 = new ParameterizedConstructor("Python");

     }
    
}
