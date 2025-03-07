package DAY7;

abstract class Employee {
    String name;
    int employeeId;


    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract void calculateSalary();

    void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private final int salary = 50000;

    FullTimeEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary: ₹" + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    private final int ratePerHour = 500;

    PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        int salary = hoursWorked * ratePerHour;
        System.out.println("Salary: ₹" + salary);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
      
        Employee emp1 = new FullTimeEmployee("Ramya", 101);
        emp1.showDetails();
        emp1.calculateSalary();
        System.out.println();

      
        Employee emp2 = new PartTimeEmployee("Sharmi", 102, 20);
        emp2.showDetails();
        emp2.calculateSalary();
    }
}


