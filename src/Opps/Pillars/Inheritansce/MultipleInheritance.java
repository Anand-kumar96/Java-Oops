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
class Auto extends Car{
    boolean sunroof;
    int seat;
    void autoDetails(){
        carDetail();
        System.out.println("Sunroof is : "+sunroof+"\nSeat is : "+seat);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        
        Auto auto = new Auto();
        auto.name ="Zupito";
        auto.color ="Blue";
        auto.price = 500000;
        auto.wheel=3;
        auto.brand="Mahindra";
        auto.sunroof=false;
        auto.seat=6;
        auto.autoDetails();
    }
}
