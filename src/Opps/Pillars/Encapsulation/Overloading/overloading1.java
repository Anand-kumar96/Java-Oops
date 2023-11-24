package Opps.Pillars.Encapsulation.Overloading;
// 1. By Changing the Number of Parameters 
public class overloading1 {
    public static int sum(int a,int b){
    return a+b;
    }
    public static int sum(int a,int b,int c){
    return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
    return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(45,43,22));
        System.out.println(sum(46,78,90,43));
    }
}
