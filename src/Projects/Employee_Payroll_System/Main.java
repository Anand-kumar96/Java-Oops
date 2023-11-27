package Projects.Employee_Payroll_System;

import java.util.Scanner;

public class Main {
    static PayrollSystem payroll = new PayrollSystem();

    public static void fullTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter monthly salary of employee");
        double monthlySalary = sc.nextDouble();
        FullTimeEmployee emp1 = new FullTimeEmployee(name, id, monthlySalary);
        payroll.addEmployee(emp1);
        System.out.println("Employee is added!!");
    }

    public static void partTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter how many hours employee worked: ");
        int hourWorked = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();
        PartTimeEmployee emp2 = new PartTimeEmployee(name, id, hourWorked, hourlyRate);
        payroll.addEmployee(emp2);
        System.out.println("Employee is added!!");
    }

    public static void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plaese enter employee id to remove: ");
        int id = sc.nextInt();
        payroll.removeEmployee(id);
    }

    public static void choiceDetails(int choice) {
        if (choice == 5) {
            System.out.println("Thanks for Connecting with us!!");
            return;
        }
        while (choice != 5) {
            switch (choice) {
                case 1:
                    System.out.println("\nPlease enter Fulll Time Employee Detail");
                    fullTimeEmployee();
                    mainMenu();
                    break;
                case 2:
                    System.out.println("\nPlease enter Part Time Employee Detail");
                    partTimeEmployee();
                    mainMenu();
                    break;
                case 3:
                    payroll.displayAllEmployee();
                    mainMenu();
                    break;
                case 4:
                    removeEmployee();
                    mainMenu();
                    break;
                default:
                    System.out.println("Please enter a valid choice...");
                    mainMenu();
                    break;
            }
        }
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice: \n");
        System.out.println("1.Add Full Time Employee \t\t\t 2.Add Part Time Employee");
        System.out.println("3.Display all Employee   \t\t\t 4.Remove an Employee");
        System.out.println("5. Exit\n");
        int choice = sc.nextInt();
        choiceDetails(choice);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("============================ WELCOME TO PAYROLL SYSTEM ======================\n");
        mainMenu();
    }
}
