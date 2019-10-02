package homiework;

public class BasePlusEmployee extends CommissionedEmployee{

    public double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, double employeeID, double baseSalary, double grossSales, double commisionRate) {
        super(firstName, lastName, employeeID, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public void paycheck() {
        System.out.println(commisionRate * grossSales + baseSalary);
    }

    @Override
    public String toString() {
        return "BasePlusEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
