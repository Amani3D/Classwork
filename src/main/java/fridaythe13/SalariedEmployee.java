package fridaythe13;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    public double yearlySalary;
    public LocalDate hireDate;
    public Personality personality;
    public Cars cars;


    public SalariedEmployee(String name, float hoursWorked, double yearlySalary, LocalDate hireDate, Personality personality, Cars cars) {
        super(name, hoursWorked);
        this.yearlySalary = yearlySalary;
        this.hireDate = hireDate;
        this.personality = personality;
        this.cars = cars;

    }

    @Override
    public void printProfile() {
        System.out.println("I am a salaried employee");
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "yearlySalary=" + yearlySalary +
                ", hireDate=" + hireDate +
                ", personality=" + personality +
                ", cars=" + cars +
                '}';
    }

    @Override
    public void calculatePay() {
        System.out.println(yearlySalary);
    }

    @Override
    public double getPaymentAmount() {
        return yearlySalary;
    }
}
