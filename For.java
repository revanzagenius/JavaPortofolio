public class For {
    public static void main(String[] args) {
    for (int i=0; i<5; i++){
        System.out.println(i + "java is fun");
    }
    
    int sum = 0;
    int n = 1000;
    
    for (int i = 1; i<=n; i++){
        sum +=i;
    }
    System.out.println("Sum = " + sum);
}
}
