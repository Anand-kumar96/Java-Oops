package Projects;
import java.util.*;
class ATM{
    Float Balance = 0.0f;
    int Pin = 9576;
    int count = 0;
    
    ATM(){
        checkPin();
    }
    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        if(count == 0){
        System.out.println("Welcome to State Bnak Of india");
        System.out.println("Enter Your Pin: ");
        count++;
    }else{
        if(count>=4){
            System.out.println("Please try again later!!\nYour maximum limit to enter valid pin is over.");
            sc.close();
            return;
        }
        System.out.println("Please enter a valid pin");
        count++;
    }
    int enteredPin = sc.nextInt();

    // check pin
    if(enteredPin==Pin){
        menu();
    }else{
        checkPin();
       }
       sc.close();
    }

    public void menu(){
        if(count==1){
        System.out.println("Welcome Anand Kumar");
        }
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1: checkBalance();
            break;
            case 2: withdrawMoney();
            break;
            case 3: depositMoney();
            break;
            case 4: System.out.println("Thanks for Connecting With us! \n Have a great day!!");
            break; // exit
            default: System.out.println("Please enter a valid key");
            break;
        }
        sc.close();
    }

    public void checkBalance(){
        System.out.println("Your Balance is : "+ Balance);
        menu();
    }
    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw: ");
        float withDrawAmount = sc.nextFloat();
        // check
        if(Balance< withDrawAmount){
            System.out.println("You have Insufficient Balance");
        }else{
            Balance = Balance-withDrawAmount;
            System.out.println("Money Withdraw Successfully.");
        }
        menu();
        sc.close();
    }
   
     public void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Deposit: ");
        Float depositAmount =  sc.nextFloat();
        Balance = Balance + depositAmount;
        System.out.println("Money Deposited Successfully.");
        menu();
        sc.close();
     }

}
public class AtmMachine {
    public static void main(String[] args) {
    new ATM();
    }
}
