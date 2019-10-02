package fridaythe13;

public abstract class Employee extends Person implements IPay {

    //properties, instance variables, fields
    private float hoursWorked;

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Employee(String name, float hoursWorked) {
        //constructor
        super(name);
        this.hoursWorked = hoursWorked;

    }
    //Abstract Method or Function
    public abstract void calculatePay();

    //Method or Function
    public void printYearlyHours() {
        System.out.println(hoursWorked * 52);
    }

    @Override
    public String toString() {
        return "Employee name is : " + getName();
    }

}
