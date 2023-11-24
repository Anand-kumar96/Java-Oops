package Opps.Pillars.Encapsulation.Overloading;
//2  By Changing Data Types of the Parameters 
public class overloading2 {
    public static int sum(int a,int b,int c){
        return a+b;
        }
        public static double sum(double a,double b,double c){
        return a+b+c;
        }
        public static String sum(String a,String b,String c){
        return a+b+c;
        }
        public static void main(String[] args) {
            System.out.println(sum(2,3,4));
            System.out.println(sum(45,43,34.5));
            System.out.println(sum("Anand ","kumar ", "Singh"));
        }
}
