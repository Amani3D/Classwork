package assesment;

public class Hippo extends Animal{

    public Hippo(String name, String noise) {
        super(name, noise);
    }

    @Override
    public String speak(String noise) {
        return noise;
    }
}
