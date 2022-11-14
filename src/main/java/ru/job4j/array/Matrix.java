package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] rsl = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                rsl[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        for (int row = 0; row < result.length; row++) {
            for (int cell = 0; cell < result[row].length; cell++) {
                System.out.println(result[row][cell]);
            }
        }
    }
}
