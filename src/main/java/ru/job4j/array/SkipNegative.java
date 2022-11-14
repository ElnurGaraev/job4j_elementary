package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {{1, -2}, {1, 2}};
        int[][] rsl = SkipNegative.skip(array);
        for (int row = 0; row < rsl.length; row++) {
            for (int cell = 0; cell < rsl.length; cell++) {
                System.out.println(rsl[row][cell]);
            }
        }
    }
}
