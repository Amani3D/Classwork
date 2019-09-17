package fridaythe13;

public class AnimalParameter {
    public String animal;
    public int eyes;
    public String noise;

    public AnimalParameter(String animal, int eyes, String noise){

        this.animal = animal;
        this.eyes = eyes;
        this.noise = noise;
    }

    public void describeAnimal(){
        System.out.println(animal + " " + eyes + " " + " " + noise);
    }

    @Override
    public String toString() {
        return "AnimalParameter{" +
                "animal='" + animal + '\'' +
                ", eyes=" + eyes +
                ", noise='" + noise + '\'' +
                '}';
    }
}
