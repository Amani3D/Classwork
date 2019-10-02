package io.zipcoder;

public class Dog extends Pet {

    public String collar;

    public Dog(String name, String noise, String collar) {
        super(name, noise);
        this.collar = collar;
    }

    public void speak(String noise) {
        System.out.println(noise);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "collar='" + collar + '\'' +
                '}';
    }
}
