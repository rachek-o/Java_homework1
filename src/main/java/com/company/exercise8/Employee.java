package com.company.exercise8;

public class Employee implements Comparable<Employee> {
    private String name;
    private String employeeId;
    private double avgSalary;

    public Employee() {
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public double getAvgSalary() {
        return avgSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setAvgSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee o) {
        if (avgSalary > o.avgSalary) {
            return 1;
        } else if (avgSalary < o.avgSalary) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", avgSalary=" + avgSalary +
                '}';

    }
}
