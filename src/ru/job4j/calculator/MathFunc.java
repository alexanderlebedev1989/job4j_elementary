package ru.job4j.calculator;

public class MathFunc {

    public static void main(String[] args) {
        int result = func1(100);
        System.out.println(result);
    }

    public static int func1(int x) {
        return x * x + 1;
    }
}
