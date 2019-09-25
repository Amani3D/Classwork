package homework;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang", 4);
        car1.setCartype("Porsche");
        car1.realWheels(8);

        System.out.println(car1);
    }
}
