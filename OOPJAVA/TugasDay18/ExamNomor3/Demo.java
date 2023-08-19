public class Demo extends Child {
    public static void main(String[] args) {
        Child child = new Child();

        child.parentInfo(); //untuk menampilkan parent info

        System.out.println();

        child.home();//di gunakan untuk menampikan Parent Home
        child.car();//di gunakan untuk menampikan Parent Car
        
        System.out.println();

        child.childInfo();
  
    }
}
