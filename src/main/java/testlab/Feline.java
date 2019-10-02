package testlab;

public abstract class Feline extends Animal {

    public Feline(String location, String noise) {
        super(location, noise);
    }

    @Override
    public String toString() {
        return "Feline{" + noise + '\'' + '}';
    }
}
