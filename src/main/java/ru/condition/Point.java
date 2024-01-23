package ru.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(9, 1, 3);
        Point b = new Point(5, 8, 2);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }

}
