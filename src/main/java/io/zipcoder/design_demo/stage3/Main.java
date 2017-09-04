package io.zipcoder.design_demo.stage3;

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
        ArrayList<io.zipcoder.design_demo.stage1.Person> personRepository = new ArrayList<io.zipcoder.design_demo.stage1.Person>();
        Console console = new Console();

        String stringName = console.getStringInput("Enter your name");
        int intAge = console.getIntegerInput("Enter your age");
        int intFavoriteNumber= console.getIntegerInput("Enter your favorite number");

        // TODO - Move to factory method
        console.println("Creating a person object.");
        io.zipcoder.design_demo.stage1.Person person = new io.zipcoder.design_demo.stage1.Person(stringName, intAge, intFavoriteNumber);


        console.println("Adding person object to person-repository");
        personRepository.add(person);
        console.println("Object added to person-repository.");
        console.println("Name is " + person.getName());
        console.println("Age is " + person.getAge());
        console.println("Favorite number is " + person.getFavoriteNumber());
    }
}
