package Opps.Pillars.Abstraction;
// to achieve abstraction and implements multiple inheritance
// object only created of class not interface

interface LuxiaryCar{
    public void start();
}
class ElectricCar implements LuxiaryCar{
    public void start(){
        System.out.println("Car is start");
    }
}

class DiselCar implements LuxiaryCar{
    public void start(){
        System.out.println("Disel Car is start");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        DiselCar Xuv700 = new DiselCar();
        tesla.start();
        Xuv700.start();
    }
}
