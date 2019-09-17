package fridaythe13;

public class Employee {
    //properties, instance variables, fields
    public String name;
    public float hoursWorked;
    public double hourlyRate;

    public Employee(String name, float hoursWorked, double hourlyRate) {
        //constructor
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    //Method or Function
    public void calculatePay(){
        System.out.println(hourlyRate * hoursWorked);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
