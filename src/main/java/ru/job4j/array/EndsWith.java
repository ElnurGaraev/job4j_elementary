package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean rsl = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - index - 1] != word[word.length - index - 1]) {
                rsl = false;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = endsWith(word, post);
        System.out.println(result);
    }
}
