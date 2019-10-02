package io.zipcoder;

public class Mouse extends Pet {

    public String food;

    public Mouse(String name, String noise, String food) {
        super(name, noise);
        this.food = food;
    }

    public void speak(String noise) {
        System.out.println(noise);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "food='" + food + '\'' +
                '}';
    }
}
