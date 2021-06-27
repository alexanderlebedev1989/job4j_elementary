package ru.job4j;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("Преобразование без потери данных");
        // 3 выражение
        char c = 45000;
        float f = c;
        System.out.println(f);

        // 5 выражение
        short s = 1500;
        char c5 = (char) s;
        double d = c5;
        System.out.println(d);
        System.out.println();

        System.out.println("Преобразование c потерей данных");
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);

        // 2 выражение
        float f2 = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);

        // 4 выражение
        double d4 = 121.19;
        byte b4 = (byte) d4;
        System.out.println(b4);
    }
}
