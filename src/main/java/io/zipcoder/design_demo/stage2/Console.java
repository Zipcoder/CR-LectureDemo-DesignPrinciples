package io.zipcoder.design_demo.stage2;

import java.util.Scanner;

/**
 * Created by leon on 9/4/17.
 */
public class Console {
    public void println(String val) {
        System.out.println(val);
    }

    public String getStringInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
