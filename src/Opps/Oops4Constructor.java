package Opps;

class Student{
    String name;
    int RollNo;
    // default constructor
    Student(){
        System.out.println("this is default Constructor...!!");
    }
    Student(String name, int RollNo){
        this.name=name;
        this.RollNo=RollNo;
        System.out.println("This is parametrized constructor..!!");
    }
    void myName(){
        System.out.println("my Name is : "+name);
    }
}
public class Oops4Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anand",20);
        s2.myName();
        s1.myName();
    }
}
