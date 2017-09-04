package io.zipcoder.design_demo.stage3;

/**
 * Created by leon on 9/4/17.
 */
public class Person {
    private final String name;
    private final int age;
    private final int favoriteNumber;

    public Person(String name, int age, int favoriteNumber) {
        this.name = name;
        this.age = age;
        this.favoriteNumber = favoriteNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }
}
