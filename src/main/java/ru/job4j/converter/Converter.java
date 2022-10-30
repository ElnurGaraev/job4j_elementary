package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRuble(float value) {
       return value * 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static void main(String[] args) {
        float expectedEuro = 2;
        float euro = Converter.rubleToEuro(140);
        boolean passedEuro = expectedEuro == euro;
        float expectedDollar = 3;
        float dollar = Converter.rubleToDollar(140);
        boolean passedDollar = expectedDollar == dollar;
        float expectedDolRub = 60;
        float dollarRuble = Converter.dollarToRuble(1);
        boolean passedDolRub = expectedDolRub == dollarRuble;
        float expectedEuRub = 70;
        float euroRuble = Converter.euroToRuble(1);
        boolean passedEuRub = expectedEuRub == euroRuble;
        System.out.println("140 rubles are " + euro + ". Test result is " + passedEuro + ".");
        System.out.println("140 rubles are " + dollar + ". Test result is " + passedDollar + ".");
        System.out.println("1 dollar is " + dollarRuble + " рублей. Test is " + passedDolRub + ".");
        System.out.println("1 euro is " + euroRuble + " рублей.Test is " + passedEuRub + ".");
    }
}
