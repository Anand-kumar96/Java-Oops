package Opps.Pillars.Inheritansce;
// used in extends something when
// to invoke properties or varibale, method , constructor of parent class
// this comes in picture when parent and child class have same name of variable and method 


//TO INVOKE PARENT CLASS VARIABLE
class Animal{
    String color ="white";
}
class Dog extends Animal{
    String color = "Red";
    void printColor(){
        System.out.println("parent class: "+super.color);
        System.out.println("child class: "+color);
    }
}

// TO INVOKE PARENT CLASS METHOD
class Cars{
    public void start(){
        System.out.println("Car started...");
    }
}

class Kia extends Cars{
    public void start(){
        System.out.println("Kia started....");
    }
    
    public void startMachine(){
        //start parent car
        super.start();
        //start car Kia
         start();
   }
}

// TO INVOKE PARENT CLASS CONSTRUCTOR
class Student{
    Student(){
        System.out.println("Student constructor called...");
    }
}

class Ramesh extends Student{
    Ramesh(){
        super();
        System.out.println("Ramesh consructor called...");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        //1
        Dog dog = new Dog();
        dog.printColor();
        //2
        Kia kia = new Kia();
        kia.startMachine();
        //3
        new Ramesh();
    }
}
