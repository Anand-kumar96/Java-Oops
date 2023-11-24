package Opps.Pillars.Inheritansce;

class Vehicle{
    String name;
    String color;
    float price;
    void printDetails(){
        System.out.println("Name is : "+name+"\nColor is : "+color+"\nPrice is : "+price);
    }
}
class Car extends Vehicle{
    int wheel;
    String brand;
    void carDetail(){
        printDetails();
        System.out.println("Wheel is : "+wheel+"\nBrand is :"+brand);
    }
}
public class SingleInheritence {
    public static void main(String[] args) {
        Car car = new Car();
        car.name ="Harrier";
        car.color ="Blue";
        car.price = 1000000;
        car.wheel=4;
        car.brand="Tata";
        car.carDetail();
    }
}
