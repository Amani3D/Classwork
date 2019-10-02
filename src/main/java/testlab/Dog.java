package testlab;

public class Dog extends Canine{

    public Dog(String location, String noise) {
        super(location, noise);
    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
    }

    @Override
    public String toString() {
        return "Dog{" + noise + '\'' + '}';
    }
}
