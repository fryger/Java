package com.company;

import com.company.creatures.Animal;

import java.math.BigDecimal;

public class Human implements Saleable {

    private String firstName;
    private String lastName;
    private Phone phone;
    private Animal pet;
    private Car car;
    private BigDecimal salary;
    private BalanceHistory balanceHistory;
    public Double cash = 300.0;


    public Human() {
        this.balanceHistory = new BalanceHistory();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {

        if (this.salary.compareTo(BigDecimal.valueOf(car.getvalue() / 1)) == 1) {
            System.out.println("Cash");
            this.car = car;
        } else if (this.salary.compareTo(BigDecimal.valueOf(car.getvalue() / 12.0)) == 1) {
            System.out.println("Credit");
            this.car = car;
        } else {
            System.out.println("No car for you");
        }
    }

    public Double getSalary() {
        this.balanceHistory.displayHistoryOfSalary();
        return salary.doubleValue();
    }

    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("The payment can't be negative");
        } else {
            System.out.println("Data was submitted to accounting system, Hania from HR have your annex to the contract, ZUS i US knows everything");
            this.balanceHistory.saveHistoryAccountCharge(salary);
            this.salary = BigDecimal.valueOf(salary);
        }
    }

    public String toString() {
        return firstName + " " + lastName + " " + car;
    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {

    }
}
