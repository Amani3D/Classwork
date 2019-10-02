package testlab;

public class AnimalTest {
    public static void main(String[] args) {

       Wolf wolf = new Wolf("Woods", "Large Bark");
        System.out.println(wolf);

        Dog dog = new Dog("House", "Bark");
        System.out.println(dog);

        Hippo hippo = new Hippo("Africa", "Mehhhh");
        System.out.println(hippo);

        Cat cat = new Cat("House", "Meow");
        System.out.println(cat);

        Lion lion = new Lion("Africa", "RAWR");
        System.out.println(lion);

        Tiger tiger = new Tiger("Jungle", "Big Meow");
        System.out.println(tiger);

        Animal[] animals = {wolf, dog, hippo, cat, lion, tiger};

    }

    public static void makeNoise(Animal[] animals) {
        for (Animal zoo : animals) {
            System.out.println(zoo);
        }
    }


    }

