package testlab;

public class Lion extends Feline {

    public Lion(String location, String noise) {
        super(location, noise);
    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
    }

    @Override
    public String toString() {
        return "Lion{" + noise + '\'' + '}';
    }
}
