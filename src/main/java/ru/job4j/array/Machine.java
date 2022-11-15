package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            while (change >= coin) {
                change = change - coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int money = 50;
        int price = 35;
        int[] rsl = Machine.change(money, price);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }

    }
}

