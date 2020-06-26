package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {

    public static void main(String[] args) {
        System.out.println("Hello world!!");
        System.err.println("Error..");
        List<Integer> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(getRandom());
        }
    }

    private static Integer getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}