package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivided(double fist, double second) {
        return subtract(fist, second)
                + divided(fist, second);
    }

    public static double sumTotal(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divided(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчет равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы операций деления и вычитания: "
                + subtractAndDivided(10, 20));
        System.out.println("Результат расчета общей суммы: " + sumTotal(10, 20));

    }
}
