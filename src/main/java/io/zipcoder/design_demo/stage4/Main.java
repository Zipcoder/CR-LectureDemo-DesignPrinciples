package io.zipcoder.design_demo.stage4;

import java.util.ArrayList;

/**
 * Created by leon on 9/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.demo();
    }

    public void demo() {
        ArrayList<Person> personRepository = new ArrayList<Person>();
        // TODO - remove redundancy: Console creation
        Console console = new Console();
        Person person = createPerson();

        console.println("Adding person object to person-repository");
        personRepository.add(person);
        console.println("Object added to person-repository.");
        console.println("Name is " + person.getName());
        console.println("Age is " + person.getAge());
        console.println("Favorite number is " + person.getFavoriteNumber());
    }

    public Person createPerson() { // factory method
        // TODO - remove redundancy: Console creation
        Console console = new Console();

        String stringName = console.getStringInput("Enter your name");
        int intAge = console.getIntegerInput("Enter your age");
        int intFavoriteNumber= console.getIntegerInput("Enter your favorite number");

        console.println("Creating a person object.");
        Person person = new Person(stringName, intAge, intFavoriteNumber);
        return person;
    }
}
