package Projects.Employee_Payroll_System;

import java.util.ArrayList;

class PayrollSystem {
    private ArrayList<Employee> emplyoeeList;

    // constructor
    PayrollSystem() {
        emplyoeeList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        emplyoeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToBeRemoved = null;
        for (Employee employee : emplyoeeList) {
            if (employee.getId() == id) {
                employeeToBeRemoved = employee;
            }
        }
        if (employeeToBeRemoved != null) {
            emplyoeeList.remove(employeeToBeRemoved);
            System.out.println("\nEMPLOYEE IS REMOVED !!\n");
        }else{
            System.out.println("\nINVALID ID. .NO EMPLOYEE IS FOUND...\n");
        }
    }

    public void displayAllEmployee() {
        if(emplyoeeList.size()==0){
            System.out.println("\n===============NO EMPLOYEE FOUND. PLEASE ADD SOME!!============\n");
        }else{
            System.out.println("\n\n=============== All Employee detail =============\n");
            for (Employee employee : emplyoeeList) {
                System.out.println(employee.toString()+"\n");
            }
        }
    }
}
