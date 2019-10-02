package testlab;

public class Tiger extends Feline {

    public Tiger(String location, String noise) {
        super(location, noise);
    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
    }

    @Override
    public String toString() {
        return "Tiger{" + noise + '\'' + '}';
    }
}
