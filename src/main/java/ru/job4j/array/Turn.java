package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] value = new int[]{1, 2, 3, 4, 5};
        int[] rsl = back(value);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(value[index]);
        }
    }
}

