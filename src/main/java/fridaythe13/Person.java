package fridaythe13;

public abstract class Person {

    private String name;
    public double age;
    protected String sex;
    private String pronoun;

    public Person(String name, double age, String sex, String pronoun) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.pronoun = pronoun;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public void printName() {
        System.out.println("My name is " + this.name);
    }

    public abstract void printProfile();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", pronoun='" + pronoun + '\'' +
                '}';
    }

}


