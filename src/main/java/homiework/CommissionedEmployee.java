package homiework;

public class CommissionedEmployee extends Employee{

    public double grossSales;
    public double commisionRate;

    public CommissionedEmployee(String firstName, String lastName, double employeeID, double grossSales, double commisionRate) {
        super(firstName, lastName, employeeID);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    @Override
    public void paycheck() {
        System.out.println(commisionRate * grossSales);
    }

    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "grossSales=" + grossSales +
                ", commisionRate=" + commisionRate +
                '}';
    }
}
