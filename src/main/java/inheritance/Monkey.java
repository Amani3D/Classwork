package inheritance;

public class Monkey extends Animal {

    private String typeOfFood;

    public Monkey(String typeOfFood) {
        super(typeOfFood);
        this.typeOfFood = typeOfFood;
    }

    public void eats(String typeOfFood) {
        System.out.println(typeOfFood);
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
