package Opps.Pillars.Abstraction;

abstract class Car{
    abstract public void carDetail();
    public void color(){
        System.out.println("Car color is Black.");
    }
}

class Tata extends Car{
    public void carDetail(){
        System.out.println("Car name is Nexon and\nCar price is 6 lakhs");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.carDetail();
        tata.color();;
    }
}
