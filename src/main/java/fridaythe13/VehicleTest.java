package fridaythe13;

public class VehicleTest {
    public static void main(String[] args) {

        Car car = new Car(4, "Volvo", "4");
        car.setName("Mustang");
        car.setWheels(4);
        car.describeVehicle();

        System.out.println(car);

    }
}
