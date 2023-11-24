package Opps.Pillars.Encapsulation.Overriding;
class Bank{
    public int rateOfInterest(){
        return 9;
    }
}
class Sbi extends Bank{
    @Override
    public int rateOfInterest(){
        return 10;
    }
}
class Pnb extends Bank{
    @Override
    public int rateOfInterest(){
        return 11;
    }
}
public class OverrideExample1 {
    public static void main(String[] args) {
    Sbi sbi = new Sbi();
    Pnb pnb = new Pnb();
    Bank bank = new Bank();
    System.out.println(sbi.rateOfInterest()+"%");
    System.out.println(pnb.rateOfInterest()+"%");
    System.out.println(bank.rateOfInterest()+"%");
    }
}
