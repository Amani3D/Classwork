package demo;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Animal cat = new Animal("Felix");
        Animal dog = new Animal("Bingo");

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(cat);
        animals.add(dog);

        for(Animal animal : animals) {
            System.out.println(animal);
        }



//        for(int x = 0; x < animals.size(); x++) {
//
//        }

//        int[] arrayOfNumbers = {1, 2, 3, 4};
//
//        Animal[] arrayOfAnimals = {cat};

        //ArrayList<String> groceryList = new ArrayList<String>();

//        groceryList.add("Bread");
//        groceryList.add("Milk");
//
//        System.out.println(groceryList);

//        ArrayList<Animal> animalList = new ArrayList<Animal>();
//
//        animalList.add(cat);
//        animalList.add(new Animal("Mack"));
//
//        System.out.println(animalList);


    }
}
