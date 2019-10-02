package leonslab;

public class Person {

    private final long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
