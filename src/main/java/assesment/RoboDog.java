package assesment;

public class RoboDog extends Robot implements Pet{

    public String name;
    public String noise;

    public RoboDog(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    @Override
    public void greet() {
        System.out.println("Hello human...");
    }
}
