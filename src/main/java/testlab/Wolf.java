package testlab;

public class Wolf extends Canine{

    public Wolf(String location, String noise) {
        super(location, noise);
    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
    }

    @Override
    public String toString() {
        return "Wolf{" + noise + '\'' + '}';
    }
}
