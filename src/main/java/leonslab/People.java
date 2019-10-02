package leonslab;

import java.util.ArrayList;
import java.util.Iterator;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
       return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeAll(Person person) {
        personList.clear();
    }

    public int count(Person person) {
        return personList.size();
    }

    public Object[] toArray(Person person) {
        return personList.toArray();
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
