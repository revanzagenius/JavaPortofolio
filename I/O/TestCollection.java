package I.O;
// package CStudent;

import java.util.ArrayList;
import java.util.Iterator;

import Student;

public class TestCollection {
    public static void main(String args[]){
        Student s1 = new Student(1151900025,"Revanza",21,"Informatika");
        Student s2 = new Student(1151900011, "Kelfin", 21,"Informatika");
        Student s3 = new Student(1151900001, "Hamdan", 21,"Informatika");

    ArrayList<Student> list = new ArrayList<Student>();
    list.add(s1);
    list.add(s2);
    list.add(s3);

    Iterator itr = list.iterator();

    while (itr.hasNext()){
        Student st=(Student)itr.next();
        System.out.println(st.rollno+""+st.name+"+"+st.age+""+st.jurusan);
    }
    }
    
}
