package Opps;

import java.util.Scanner;

public class Oops3Final {
    public static class Student{
        final String name = "Aryan";
        int rollNo;
         String batch;
        //constructor
         Student(String name, int rollNo,String batch){
        //  this.name =name; // final field acn not be assign
         this.rollNo=rollNo;
         this.batch=batch;
        }
        void printStudentDetails(){
        System.out.println("Student name is : "+name+"\n Roll no is : "+ rollNo+"\n His batch is : "+batch);
       }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter student name : ");
     String name = sc.nextLine();
     System.out.println("Enter student Roll Number : ");
     int rollNo = sc.nextInt();
     sc.nextLine();
     System.out.println("Enter student batch : ");
     String batch = sc.nextLine();
     Student s1 = new Student(name, rollNo, batch);
     s1.printStudentDetails();
     Student s2 = new Student("Rahul", 02, "A");
    //  s2.name = "Ganewsh";  final field name cannot be assign
     s2.printStudentDetails();
     sc.close();

    }
}