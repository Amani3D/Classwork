package assesment;

public class Cat extends Feline implements Pet{

    public Cat(String name, String noise) {
        super(name, noise);
    }

    @Override
    public void greet() {
        System.out.println("Hello Kitty");
    }
}

