package testlab;

public class Hippo extends Animal{

    public Hippo(String location, String noise) {
        super(location, noise);
    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
    }

    @Override
    public String toString() {
        return "Hippo{" + noise + '\'' + '}';
    }
}
