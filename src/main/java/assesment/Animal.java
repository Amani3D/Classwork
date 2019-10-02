package assesment;

public abstract class Animal {

    private String name;
    private String noise;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise() {
        this.noise = noise;
    }

    public Animal(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public String speak(String noise) {
        return noise;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }
}
