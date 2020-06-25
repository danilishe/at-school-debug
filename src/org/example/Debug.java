package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Hello teacher!");
        System.err.println("Create ArrayList");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(getRandom());
        }
        int positive = 0;
        int zero = 0;
        int negative = 0;
        for (Integer element : list) {
            element += getRandom();
            if (element > 0) {
                positive++;
            } else if (element == 0) {
                zero++;
            } else {
                negative++;
            }
        }

        System.out.println("positive = " + positive);
        System.out.println("zero = " + zero);
        System.out.println("negative = " + negative);
        System.out.println("All numbers = " + (positive + zero + negative));
    }

    private static int getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}
