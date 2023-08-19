
public class Child extends Parent { 
    String name = "TOM";
    int money = 200;

    void car (){//field dengan nama car yang akan di lakukan overreading ke class Parent
        System.out.println("Parent\"\s car");
    }
    
    void parentInfo(){//digunakan untuk menampilkan info dari class Parent
        System.out.println("Parent Name : " + super.name);
        System.out.println("Parent Money : " + super. money);
    }
    void childInfo(){//digunakan untuk menampilkan info dari class Child
        System.out.println("Parent Name : " + name);
        System.out.println("Parent Money : " + money);
        
    }
}
