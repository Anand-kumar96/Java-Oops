package Opps.Pillars;
// using multiple interface implement class
interface A{
    public void start();
}
interface B{
    public void accelerate();
}
interface C{
    public void stop();
}

class Verna implements A, B{
    public void start(){
        System.out.println("Verna Started...");
    }
    public void accelerate(){
        System.out.println("Verna accelearted...");
    }
}

class HondaCity implements A, B, C{
    public void start(){
        System.out.println("HondaCity Started...");
    }
    public void accelerate(){
        System.out.println("HondaCity accelearted...");
    }
    public void stop(){
        System.out.println("HondaCity stop...");
    }
}
public class InterfaceExample2 {
    public static void main(String[] args) {
        Verna verna = new Verna();
        HondaCity hondaCity = new HondaCity();
        verna.start();
        verna.accelerate();
        hondaCity.start();
        hondaCity.accelerate();
        hondaCity.stop();
    }
}
