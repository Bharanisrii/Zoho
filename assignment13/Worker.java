package assignment13;

import java.util.Scanner;

abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + employeeId);
    }

    public abstract double calculatePay();
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    public double calculatePay() {
        return salary;
    }
}

public class Worker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Hourly Employee:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Employee ID: ");
        int id1 = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();

        
        HourlyEmployee hourlyEmployee = new HourlyEmployee(name1, id1, hourlyRate, hoursWorked);

        
        System.out.println("\nEnter details for Salaried Employee:");
        scanner.nextLine(); 
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Employee ID: ");
        int id2 = scanner.nextInt();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

      
        SalariedEmployee salariedEmployee = new SalariedEmployee(name2, id2, salary);

        
        System.out.println("\nPay for Hourly Employee:");
        hourlyEmployee.getEmployeeDetails();
        System.out.println("Pay: $" + hourlyEmployee.calculatePay());

      
        System.out.println("\nPay for Salaried Employee:");
        salariedEmployee.getEmployeeDetails();
        System.out.println("Pay: $" + salariedEmployee.calculatePay());
    }
}
