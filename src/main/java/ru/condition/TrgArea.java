package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double rsl2 = TrgArea.area(6, 7, 8);
        System.out.println("area (2, 2, 2) = " + rsl);
        System.out.println("area (6, 7, 8) = " + rsl2);
    }

}
