package com.company;

public class Manager extends Employee {
    public static final double incentive = 0.5;

    public Manager(int employeeId, String employeName, double salary) {
        super(employeeId, employeName, salary);
    }

    public double getSalary() {
        return salary + salary * incentive;
    }
}
