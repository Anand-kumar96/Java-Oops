package Opps.Pillars.Encapsulation.Overloading;

public class overloading3 {
//3 By changing the Order of the Parameters 
public static void StudentId(String name, int roll_no){
    System.out.println("Student name is: "+name+" and Roll No is: "+roll_no);
}
public static void StudentId(int roll_no, String name){
    System.out.println("Student name is: "+name+" and Roll No is: "+roll_no);
}
public static void main(String[] args) {
    StudentId("Anand", 01);
    StudentId(5, "Aryan");
}
}
