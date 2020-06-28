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

    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка при вводе операции. Попробуйте ещё раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

}
