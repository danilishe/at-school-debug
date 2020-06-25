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
    }

    private static int getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}
