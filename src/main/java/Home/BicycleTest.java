package Home;

public class BicycleTest {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle(70, 6, 15);
        bicycle1.applyBrake(8);
        bicycle1.speedUp(10);

        System.out.println(bicycle1);
    }
}
