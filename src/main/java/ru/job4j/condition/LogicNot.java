package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean even = LogicNot.isEven(8);
        System.out.println(even);
        boolean positive = LogicNot.isPositive(5);
        System.out.println(positive);
        boolean notEven = LogicNot.notEven(7);
        System.out.println(notEven);
        boolean notPositive = LogicNot.notPositive(-3);
        System.out.println(notPositive);
        boolean notEvenAndPos = LogicNot.notEvenAndPositive(5);
        System.out.println(notEvenAndPos);
        boolean evenOrNotPos = LogicNot.evenOrNotPositive(-4);
        System.out.println(evenOrNotPos);
    }
}
