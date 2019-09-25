package inheritance;


public class Tiger extends Animal {

    private String typeOfFood;

    public Tiger(String typeOfFood) {
        super(typeOfFood);
        this.typeOfFood = typeOfFood;
    }

    @Override
    public void eats(String typeOfFood) {
        super.eats(typeOfFood);
    }


}
