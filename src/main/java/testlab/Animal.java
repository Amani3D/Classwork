package testlab;

public abstract class Animal {

    public String location;
    public String noise;

    public Animal(String location, String noise) {
        this.location = location;
        this.noise = noise;
    }

    public void makeNoise(String noise) {
        System.out.println(noise);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "location='" + location + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }
}
