package Opps;
import java.util.Scanner;

public class Oops1 {
    public static class Student{
        String name;
        int rollNo;
        String batch;
        //constructor
         Student(String name, int rollNo,String batch){
         this.name =name;
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
     sc.close();
     s1.printStudentDetails();
    }
}
