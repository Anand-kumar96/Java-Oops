package Opps;

import java.util.Scanner;

public class Oops2Static {
    
   public static class Student{
       static String name;
       static int rollNo;
       static  String batch;
        //constructor
         Student(String name, int rollNo,String batch){
         Student.name =name;
         Student.rollNo=rollNo;
         Student.batch=batch;
        }
       static void printStudentDetails(){
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
     new Student(name, rollNo, batch);
     sc.close();
    //    s1.printStudentDetails();
     // but we can also acccess without using object
     Student.printStudentDetails();
     System.out.println(Student.name);
    }
}