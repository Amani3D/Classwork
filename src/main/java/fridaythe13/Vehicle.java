package fridaythe13;

public class Vehicle {

    private double wheels;
    protected String name;

    public double getWheels() {
        return wheels;
    }

    public void setWheels(double wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(double wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    public void describeVehicle() {
        System.out.println("Your car is " + name + wheels);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}
