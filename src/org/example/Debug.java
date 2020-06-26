package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        List<Integer> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add((int) Math.random() * Integer.MAX_VALUE);
        }
        int billionare = 0;
        int defaults = 0;
        int regular = 0;
        for (Integer person : persons) {
            person += (int) Math.random() * Integer.MAX_VALUE;
            if (person > 1_000_000_000)
                billionare++;
            else if (person > 0)
                regular++;
            else if (person == 0)
                defaults++;
        }
        System.err.println("defaults = " + defaults);
        System.err.println("regular = " + regular);
        System.err.println("billionaire = " + billionare);
        System.err.println("regular + billionaire + defaults = " + regular + billionare + defaults);
    }
}
