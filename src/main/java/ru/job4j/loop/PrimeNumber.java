package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int mount = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                mount++;
            }
        }
        return mount;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber.calc(2));
    }
}
