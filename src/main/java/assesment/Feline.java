package assesment;

public abstract class Feline extends Animal{

    public Feline(String name, String noise) {
        super(name, noise);
    }

    @Override
    public String speak(String noise) {
        return noise;
    }
}
