package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeTask2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 70; i++) {
            numbers.add((int) (Math.random() * 500));
        }

        int low = 0;
        int average = 0;
        int big = 0;

        for (Integer number : numbers) {
            number += (int) (Math.random() * 500);
        }
    }

}
