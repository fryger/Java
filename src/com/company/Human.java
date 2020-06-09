package com.company;

import com.company.creatures.Animal;

import java.math.BigDecimal;
import java.util.Arrays;


public class Human implements Saleable {

    private String firstName;
    private String lastName;
    private Phone phone;
    private Animal pet;
    private BigDecimal salary;
    private BalanceHistory balanceHistory;
    public Double cash = 300.0;
    public Car[] garage;

    {
        garage = new Car[2];
    }

    public Human() {
        this.balanceHistory = new BalanceHistory();
    }

    public void setGarage(int size) {
        this.garage = new Car[size];
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

    public Car getCar(int position) {
        return garage[position];
    }

    public void setCar(Car car, int position) {

        if (this.salary.compareTo(BigDecimal.valueOf(car.getvalue() / 1)) == 1) {
            System.out.println("Cash");
            this.garage[position] = car;
        } else if (this.salary.compareTo(BigDecimal.valueOf(car.getvalue() / 12.0)) == 1) {
            System.out.println("Credit");
            this.garage[position] = car;
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


    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {

    }

    public double wealth() {
        double wealth = 0.0;
        for (int i = 0; i < garage.length; i++) {
            wealth += garage[i].value;
        }
        return wealth;
    }

    public void showoff() {
        for (int i = 0; i < garage.length; i++) {
            System.out.println(garage[i].model);
        }
    }

    public void sorting() {
        Arrays.sort(garage);
    }
}

