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
        int rich = 0;
        int regularFolk = 0;
        int sadPeople = 0;

        for (Integer person : persons) {
            long personAfterLottery = ((long) person) + getRandom();
            if (personAfterLottery > 1_000_000_000L) {
                rich++;
            } else if (personAfterLottery > 0) {
                regularFolk++;
            } else {
                sadPeople++;
            }
        }

        System.out.println("rich = " + rich);
        System.out.println("regularFolk = " + regularFolk);
        System.out.println("sadPeople = " + sadPeople);
        System.out.println("rich + regularFolk + sadPeople = " + (rich + regularFolk + sadPeople));
    }

    private static Integer getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}