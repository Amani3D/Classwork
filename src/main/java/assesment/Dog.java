package assesment;

public class Dog extends Canine implements Pet{

    public Dog(String name, String noise) {
        super(name, noise);
    }

    @Override
    public void greet() {
        System.out.println("Hello puppy!");
    }
}
