package testlab;

public abstract class Canine extends Animal {

    public Canine(String location, String noise) {
        super(location, noise);
    }

    @Override
    public String toString() {
        return "Canine{}";
    }
}
