package homiework;

public class SalariedEmployee extends Employee{

    public double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double employeeID, double weeklySalary) {
        super(firstName, lastName, employeeID);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void paycheck() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
