package com.company;

import java.time.LocalDate;

public class BalanceHistory {
    private static final String SALARY_MESSAGE = "Salary was equal %s in %s";
    private Double lastBalanceSalary;
    private LocalDate accountChargeDate;

    public BalanceHistory() {
    }

    public Double getLastBalanceSalary() {
        return lastBalanceSalary;
    }

    public LocalDate getAccountChargeDate() {
        return accountChargeDate;
    }

    public void saveHistoryAccountCharge(Double valueOfSalary) {
        this.lastBalanceSalary = valueOfSalary;
        this.accountChargeDate = LocalDate.now();
    }

    public void displayHistoryOfSalary() {
        String message = String.format(SALARY_MESSAGE, this.lastBalanceSalary, this.accountChargeDate);
        System.out.println(message);
    }
}
