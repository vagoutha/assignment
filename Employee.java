package com.company;
 class Employee {
     int employeeId;
     String employeeName;
     double salary;

     public Employee(int employeeId, String employeeName, double salary) {
         this.employeeId = employeeId;
         this.employeeName = employeeName;
         this.salary = salary;
     }

     public int getEmployeeId() {
         return employeeId;
     }

     public void setEmployeeId(int employeeId) {
         this.employeeId = employeeId;
     }

     public String getEmployeeName() {
         return employeeName;
     }

     public void setEmployeeName(String employeeName) {
         this.employeeName = employeeName;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }
 }

