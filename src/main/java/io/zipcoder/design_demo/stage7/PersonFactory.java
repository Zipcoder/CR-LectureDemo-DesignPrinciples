package io.zipcoder.design_demo.stage7;

/**
 * Created by leon on 9/4/17.
 */
public class PersonFactory {

    public Person createPerson() {
        Console console = new Console();
        String stringName = console.getStringInput("Enter your name");
        int intAge = console.getIntegerInput("Enter your age");
        int intFavoriteNumber = console.getIntegerInput("Enter your favorite number");

        console.println("Creating a person object.");
        Person person = new Person(stringName, intAge, intFavoriteNumber);
        console.println(person.toString());
        return person;
    }
}
