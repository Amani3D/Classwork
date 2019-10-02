package assesment;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("dog", "Bark");
        Cat cat = new Cat("cat", "Meow");
        Lion lion = new Lion("lion", "Rawr");
        Tiger tiger = new Tiger("tiger", "Rawr");
        Wolf wolf = new Wolf("wolf", "Growl");
        Hippo hippo = new Hippo("hippo", "Mehhhh");
        RoboDog roboDog = new RoboDog("robodog", "Automated Bark");

            Pet[] pet = {dog, cat, roboDog};
            printArray(pet);
        }



    public static void printArray(Pet[] pet) {
        for (Pet p : pet)
        p.greet();


    }
}



