package homework;

public class Car {

    private String cartype;
    private double wheels;

    public Car(String cartype, double wheels){
        this.cartype = cartype;
        this.wheels = wheels;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    private String setWheels(double wheels) {
        return "Number of wheels " + wheels;
    }

    public void realWheels(double wheels) {
        System.out.println(setWheels(wheels));
    }
    public void whatCar() {
        System.out.println("cartype + wheels");
    }

    @Override
    public String toString() {
        return "Car{" +
                "cartype='" + cartype + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
