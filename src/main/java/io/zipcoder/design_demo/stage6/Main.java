package io.zipcoder.design_demo.stage6;

import java.util.ArrayList;

/**
 * Created by leon on 9/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.demo();
    }

    Console console = new Console();

    public void demo() {
        PersonFactory personFactory = new PersonFactory();
        ArrayList<Person> personRepository = new ArrayList<Person>();
        Person person = personFactory.createPerson();

        // TODO - Move to Person Repository class
        console.println("Adding person object to person-repository");
        personRepository.add(person);
        console.println("Object added to person-repository.");
        console.println("Name is " + person.getName());
        console.println("Age is " + person.getAge());
        console.println("Favorite number is " + person.getFavoriteNumber());
    }
}
