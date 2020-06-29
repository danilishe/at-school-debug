package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        List<Integer> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(getRandom());
    }
        int billionaire = 0;
        int defaults = 0;
        int regular = 0;
        for (Integer person : persons) {
            person += getRandom();
            if (person > 1_000_000_000 || person < 0) {
                billionaire++;
            } else if (person > 0)
                regular++;
            else defaults++;
        }
}

    private static int getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
    }