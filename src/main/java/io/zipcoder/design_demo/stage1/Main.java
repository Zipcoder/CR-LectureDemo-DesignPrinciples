package io.zipcoder.design_demo.stage1;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        // TODO - Remove redundancy: print, nextLine
        System.out.println("Enter your name.");
        String stringName = scanner.nextLine();

        // TODO - Remove redundancy: print, nextLine, parseInt
        System.out.println("Enter your age.");
        String stringAge = scanner.nextLine();
        int intAge = Integer.parseInt(stringAge);

        // TODO - Remove redundancy: print, nextLine, parseInt
        System.out.println("Enter your favorite number.");
        String stringFavoriteNumber = scanner.nextLine();
        int intFavoriteNumber = Integer.parseInt(stringFavoriteNumber);

        System.out.println("Creating a person object.");
        Person person = new Person(stringName, intAge, intFavoriteNumber);

        System.out.println("Adding person object to person-repository");
        personRepository.add(person);
        System.out.println("Object added to person-repository.");
        System.out.println("Name is " + person.getName());
        System.out.println("Age is " + person.getAge());
        System.out.println("Favorite number is " + person.getFavoriteNumber());
    }
}
