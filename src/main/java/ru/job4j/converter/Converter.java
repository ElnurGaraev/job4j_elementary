package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rls = value * 60;
        return rls;
    }

    public static float euroToRuble(float value) {
        float rls = value * 70;
        return rls;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float dollarRuble = Converter.dollarToRuble(1);
        float euroRuble = Converter.euroToRuble(1);
        System.out.println("140 rubles are " + euro + " euro and " + dollar + " dollar.");
        System.out.println("1 dollar is " + dollarRuble + " рублей.");
        System.out.println("1 euro is " + euroRuble + " рублей.");
    }
}
