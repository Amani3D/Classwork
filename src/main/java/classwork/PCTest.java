package classwork;

public class PCTest {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(6, 7, 8);
        Monitor monitor = new Monitor("Dell", "Dell", "Six Inches", "120 x 1024");
        Motherboard motherboard = new Motherboard("MS - 7821", "MSI", 2, 3, "Update");
        Case cAse = new Case("HP", "HP", "300 Watt", new Dimensions(19, 12, 25));


        PC pc = new PC(cAse, motherboard, monitor);
        pc.description();
        pc.powerUp();

        System.out.println(pc);
    }
}
