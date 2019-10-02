package assesment;

public abstract class Canine extends Animal{

    public Canine(String name, String noise) {
        super(name, noise);
    }

    @Override
    public String speak(String noise) {
        return noise;
    }
}
