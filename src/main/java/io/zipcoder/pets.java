package io.zipcoder;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class pets {
    public static void main(String[] args) {

        ArrayList<Pet> listOfPets = new ArrayList<Pet>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petNumber = scanner.nextInt();

        System.out.println("So you have " + petNumber);

    for (int p = 0; p < petNumber; p++) {
        System.out.println("What kind of pets are they and what are their names?");
        String userInput1 = scanner.nextLine();
        if (userInput1.equals("Dog")) {
            System.out.println("What's your dogs name?");
            String dogName = scanner.next();
            Dog dog1 = new Dog("Spike", "Bark", "Red Collar");
            listOfPets.add(dog1);
        }else if (userInput1.equals("Cat")) {
            System.out.println("What's your cat's name?");
            String catName = scanner.next();
            Cat cat1 = new Cat("Tom", "Meow", 9);
            listOfPets.add(cat1);
        }else if (userInput1.equals("Mouse")) {
            System.out.println("What's your mouses name?");
            String mouseName = scanner.next();
            Mouse mouse1 = new Mouse("Jerry", "Squeek", "Cheese");
            listOfPets.add(mouse1);
        } else {
            System.out.println("So no pets?");
        }

    }

        for (Pet bs : listOfPets) {
            System.out.println(bs.speak());
        }

        System.out.println(listOfPets);

    }
}
