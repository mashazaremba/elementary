package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to34then2Dot82() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        double expected = 2.82;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when63to87then4Dot47() {
        Point point1 = new Point(6, 3);
        Point point2 = new Point(8, 7);
        double expected = 4.47;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when16to48then3Dot6() {
        Point point1 = new Point(1, 6);
        Point point2 = new Point(4, 8);
        double expected = 3.6;
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when163to487then5Dot38() {
        Point point1 = new Point(1, 6, 3);
        Point point2 = new Point(4, 8, 7);
        double expected = 5.38;
        double out = point1.distance3d(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when913to582then8Dot12() {
        Point point1 = new Point(9, 1, 3);
        Point point2 = new Point(5, 8, 2);
        double expected = 8.12;
        double out = point1.distance3d(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}