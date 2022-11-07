package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 2; i <= n; i++) {
            rsl *= i;
            System.out.println(i);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calc(0));
        System.out.println(Factorial.calc(5));

    }

}
