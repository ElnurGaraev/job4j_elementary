package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[index] != data[data.length - 1]) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] value = new boolean[]{false, true, true};
        boolean result = Check.mono(value);
        System.out.println(result);
    }
}
