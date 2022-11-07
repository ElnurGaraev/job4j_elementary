package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (0 < amount) {
            amount = (amount * percent / 100 + amount) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 70, 50));
    }
}
