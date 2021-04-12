package com.company.exercise8;

public class SalariedEmployee extends Employee implements CalculatePay {
    private String socialSecurityNumber;
    private int fixedPaidWorkers;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String name, String employeeId, double fixedMonthlyPayment) {
        super(name, employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        calculatePay();

    }

    @Override
    public void calculatePay() {
        super.setAvgSalary(fixedMonthlyPayment);
    }
}