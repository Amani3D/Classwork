package homiework;

public class Employee {

    public String firstName;
    public String lastName;
    public double employeeID;

    public Employee(String firstName, String lastName, double employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public void paycheck() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}
