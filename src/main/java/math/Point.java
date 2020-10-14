package math;

import static java.lang.Math.hypot;

public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = y = 0;
    }

    public boolean equal(Point p) {
        return equal(p.x, x) && equal(p.y, y);
    }

    public boolean notEqual(Point p) {
        return !equal(p);
    }

    public Point subtract(Point p) {
        return new Point(x - p.x, y - p.y);
    }

    public Point add(Point p) {
        return new Point(x + p.x, y + p.y);
    }

    public double scalar(Point p) {
        return x * p.x + y * p.y;
    }

    public double pseudoScalar(Point p) {
        return x * p.y - y * p.x;
    }

    public Point multi(double k) {
        return new Point(x * k, y * k);
    }

    public Point div(double k) {
        return multi(1 / k);
    }

    public Point normal() {
        return div(len());
    }

    public Point rotate() {
        return new Point(-y, x);
    }

    public double len() {
        return hypot(x, y);
    }

    public double len2() {
        return x * x + y * y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    private boolean equal(double x, double y) {
        return Double.compare(x, y) == 0;
    }
}
