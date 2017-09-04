package io.zipcoder.design_demo.stage7;

import java.util.ArrayList;

/**
 * Created by leon on 9/4/17.
 */
public class PersonRepository {
    ArrayList<Person> personArrayList = new ArrayList<Person>();
    public void add(Person person) {
        Console console = new Console();
        console.println("Adding person object to person-repository");
        personArrayList.add(person);
        console.println("Object added to person-repository.");
        console.println("Name is " + person.getName());
        console.println("Age is " + person.getAge());
        console.println("Favorite number is " + person.getFavoriteNumber());
    }
}
