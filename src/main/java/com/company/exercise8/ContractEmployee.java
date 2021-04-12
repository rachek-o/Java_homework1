package com.company.exercise8;

class ContractEmployee extends Employee implements CalculatePay {
    private String federalTaxId;
    private int hourlyPaidWorkers;
    private int numberOfHoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, String employeeId, int numberOfHoursWorked, double hourlyRate) {

        super(name, employeeId);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        calculatePay();
    }
    @Override
    public void calculatePay() {
        super.setAvgSalary(hourlyRate * numberOfHoursWorked);
    }

}
