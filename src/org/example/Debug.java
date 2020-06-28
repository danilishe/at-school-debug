package org.example;


import java.util.Scanner;

public class Debug {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int getInt() {
        System.out.println("Введите число");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Допущена ошибка при вводе числа. Попробуйте ещё раз");
            scanner.next();
            number = getInt();
        }
        return number;
    }

}
