package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Debug {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(random.nextInt());
        }
        int billionare = 0;
        int defaults = 0;
        int regular = 0;
        for (Integer person : persons) {
            person += random.nextInt();
            if (person > 1_000_000_000 || person < 0){
                billionare++;
            }
            else if (person > 0) {
                regular++;
            }
            else {
                defaults++;
            }

        }
        System.err.println("defaults = " + defaults);
        System.err.println("regular = " + regular);
        System.err.println("billionaire = " + billionare);
        System.err.println("regular + billionaire + defaults = " + (regular + billionare + defaults));
    }
}
