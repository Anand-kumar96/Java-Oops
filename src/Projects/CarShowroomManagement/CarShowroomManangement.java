package Projects.CarShowroomManagement;

import java.util.ArrayList;
import java.util.Scanner;

interface utility {
    public void get_detail();
    public void set_detail();
}

public class CarShowroomManangement {
    static Scanner sc = new Scanner(System.in);
    public static void main_menu() {
        System.out.println();
        System.out.println(
                "======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================\n");
        System.out
                .println("=============================== *** ENTER YOUR CHOICE *** ===============================\n");
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS\n");
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS\n");
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static int interChoice(String x, String y) {
        System.out.println();
        System.out.println(x);
        System.out.println(y);
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Showroom> showroom = new ArrayList<>();
        ArrayList<Employee> employee = new ArrayList<>();
        ArrayList<Car> car = new ArrayList<>();
        int showroom_counter=0;
        int employee_counter=0;
        int car_counter=0;
        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();
            while (choice != 0 && choice != 9) {
                switch (choice) {
                    case 1:
                        showroom.add(new Showroom());
                        showroom.get(showroom_counter).set_detail();
                        showroom_counter++;
                        choice = interChoice("1].ADD NEW SHOWROOM", "9].GO BACK TO MAIN MENU");
                        break;

                    case 2:
                        employee.add(new Employee());
                        employee.get(employee_counter).set_detail();
                        employee_counter++;
                        choice = interChoice("2].ADD NEW EMPLOYEE", "9].GO BACK TO MAIN MENU");
                        break;

                    case 3:
                        car.add(new Car());
                        car.get(car_counter).set_detail();
                        car_counter++;
                        choice = interChoice("3].ADD NEW CAR", "9].GO BACK TO MAIN MENU");
                        break;

                    case 4:
                        if(showroom.size()>0){
                            System.out.println("=============================== SHOWROOMS DETAILS IS:  ===============================");
                        }else{
                            System.out.println("NO SHOWROOM FOUND. PLEASE ADD SOME.......");
                        }
                        for (int i = 0; i < showroom.size(); i++) {
                            showroom.get(i).get_detail();
                            System.out.println();
                        }
                        choice = interChoice("9].GO BACK TO MAIN MENU", "0].EXIT");
                        break;

                    case 5:
                        if(employee.size()>0){
                            System.out.println("=============================== EMPLOYEES DETAILS IS:  ===============================");
                        }else{
                            System.out.println("NO EMPLOYEE FOUND. PLEASE ADD SOME.......");
                        }
                        for (int i = 0; i < employee.size(); i++) {
                            employee.get(i).get_detail();
                            System.out.println();
                        }
                        choice = interChoice("9].GO BACK TO MAIN MENU", "0].EXIT");
                        break;

                    case 6:
                        if(car.size()>0){
                            System.out.println("=============================== CARS DETAILS IS:  ===============================");
                        }else{
                            System.out.println("NO CAR FOUND. PLEASE ADD SOME.......");
                        }
                        for (int i = 0; i < car.size(); i++) {
                            car.get(i).get_detail();
                            System.out.println();
                        }
                        choice = interChoice("9].GO BACK TO MAIN MENU", "0].EXIT");
                        break;

                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
        sc.close();
    }
}
