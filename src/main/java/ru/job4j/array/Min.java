package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < array[0]) {
                min = array[index];
                break;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 1, 5};
        int result = Min.findMin(array);
        System.out.println(result);
    }
}