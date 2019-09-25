package classwork;

public class Animal extends Dog {

    private String name;
    private String food;


    public Animal(String name, String food, String noise) {
        this.name = name;
        this.food = food;

    }

    public void makeNoise(String noise){
        System.out.println(noise);
    }
}
