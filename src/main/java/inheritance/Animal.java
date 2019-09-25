package inheritance;

public class Animal {

    public String typeOfFood;

    public Animal(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void eats(String typeOfFood) {
        System.out.println(typeOfFood);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
