package fridaythe13;

import employee.Person;

public class Employee extends Person {

    //properties, instance variables, fields
    private float hoursWorked;
    private double hourlyRate;

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Employee(String name, float hoursWorked, double hourlyRate) {
        //constructor
        super(name);
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
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
