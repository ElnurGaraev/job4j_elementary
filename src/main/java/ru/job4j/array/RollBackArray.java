package ru.job4j.array;

public class RollBackArray {
    public static int[] rollBack(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - 1 - index];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = rollBack(new int[] {1, 2, 3, 4, 5});
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
