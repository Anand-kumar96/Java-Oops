package Opps.Pillars.Encapsulation;
class Student{
    private String name;
    private int age;
    private int roll_no;
    Student(String name, int age, int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }

// getter
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public int getRollNo(){
    return roll_no;
  }
// setter
 public void setName(String name){
  this.name=name;
 }
 public void setAge(int age){
  this.age=age;
 }
 public void setRollNo(int roll_no){
  this.roll_no=roll_no;
 }
}
public class GetterAndSetter {
  public static void main(String[] args) {
    Student s1 = new Student("Anand",25 , 2);
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
    System.out.println(s1.getRollNo());
    s1.setName("Aryan");
    s1.setAge(27);
    s1.setRollNo(5);
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
    System.out.println(s1.getRollNo());
  }
    
}
