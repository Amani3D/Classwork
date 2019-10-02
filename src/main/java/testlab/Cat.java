package testlab;

public class Cat extends Feline {

    public Cat(String location, String noise) {
        super(location, noise);
    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
    }

    @Override
    public String toString() {
        return "Cat{" + noise + '\'' + '}';
    }
}
