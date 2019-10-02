package fridaythe13;

public class Car extends Vehicle {

    private String windows;

    public Car(double wheels, String name, String windows) {
        super(wheels, name);
        this.windows = windows;
    }

    @Override
    public void describeVehicle() {
        System.out.println("There you go Mikaila");
    }

    @Override
    public String toString() {
        return "Car{" +
                "windows='" + windows + '\'' +
                ", name='" + name + '\'' + getWheels() +
                '}';
    }
}
