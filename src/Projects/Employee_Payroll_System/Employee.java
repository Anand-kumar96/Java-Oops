package Projects.Employee_Payroll_System;

abstract public class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    abstract public double calculateSalary();

    @Override
    public String toString() {
        return "Employee Name is : " + getName() + "\nId is : " + getId() + "\nSalary is : " + calculateSalary();
    }
}

