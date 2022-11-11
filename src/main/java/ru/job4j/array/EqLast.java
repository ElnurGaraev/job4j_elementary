package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int index = 0; index < left.length / 2; index++) {
            if (left[left.length - index - 1] != right[right.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] right = {1, 2, 3, 4, 5};
        boolean rsl = check(left, right);
        System.out.println(rsl);
    }
}
