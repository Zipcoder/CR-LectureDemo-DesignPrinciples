package io.zipcoder.design_demo.stage7;

/**
 * Created by leon on 9/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.demo();
    }

    public void demo() {
        PersonFactory personFactory = new PersonFactory();
        PersonRepository personRepository = new PersonRepository();

        Person person = personFactory.createPerson();
        personRepository.add(person);
    }
}
