package io.zipcoder;

public class Cat extends Pet {

    public int lives;

    public Cat(String name, String noise, int lives) {
        super(name, noise);
        this.lives = lives;
    }

    public void speak(String noise) {
        System.out.println(noise);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lives=" + lives +
                '}';
    }
}
