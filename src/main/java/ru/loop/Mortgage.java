package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double p = amount / 100 * percent;
            amount += p;
            amount -= salary;
            year++;
        }
        return year;

    }
}
