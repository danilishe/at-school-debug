package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeTask2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 70; i++) {
            numbers.add(getValues());
        }

        int low = 0;
        int average = 0;
        int big = 0;

        for (Integer number : numbers) {
            number += getValues();
            if (number < 200) {
                low++;
            } else if (number < 400 && number > 200) {
                average++;
            } else if (number > 400) {
                big++;
            }
        }

        System.out.println("low = " + low);
        System.out.println("average = " + average);
        System.out.println("big = " + big);
        System.out.println("low + average + big = " + low + average + big);
    }

    private static int getValues() {
        return (int) (Math.random() * 500);
    }
}


