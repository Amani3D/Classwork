package fridaythe13;



public class Person {



    public String name;
    public double age;

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }
}
