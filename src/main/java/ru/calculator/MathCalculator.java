package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + div(first, second);
    }

    public static double sumOfAllMethods(double first, double second) {
        return minus(first, second) + div(first, second)
                + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println(minusAndDivide(12, 15));
        System.out.println(sumOfAllMethods(9, 22));
    }

}
