public class A {

  Integer a = 10;
  static int b = 20;

  void add()   
  {
    int c = 30, d;
    d = a+b+c;
    System.out.println(d);
    System.out.println(" a :" + a + " b :" + b + " c :" + c + " = " + d);
  }

  void mul() // Fungsi Atau deklrasi fungsi tidak menggunakan ; di akhir
  {
  int e = 40,f; 
  f = a * b * e;
  System.out.println(f);
  System.out.println("a :" + a + " b :" + b + " e :" + " = " + f);    
  }
  public static void main(String[] args) {
    System.out.print("Test Instance Class A");
    A objA = new A(); // Nama Class sesuaikan dengan nama Class di atas
    objA.add();
    objA.mul();

}
}