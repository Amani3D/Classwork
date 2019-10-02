package io.zipcoder;

public class Pet {

    private String name;
    public String noise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public String speak() {
        return noise;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }
}
