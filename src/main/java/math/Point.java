package math;

import static java.lang.Math.abs;
import static java.lang.Math.hypot;

public class Point {
    private double eps = 1e-7;

    private boolean equal(double x, double y){
        return abs(x - y) < eps;
    }

    private double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean eq(Point rhs){
        return equal(rhs.getX(), this.x) && equal(rhs.getY(), this.y);
    }

    public boolean not_eq(Point rhs){
        return !this.eq(rhs);
    }

    @Override
    public String toString() {
        return "" + x + " " + ' ' + y;
    }

    Point deq(Point rhs){
        return new Point(this.x - rhs.getX(), this.y - rhs.getY());
    }

    Point add(Point rhs){
        return new Point(this.x + rhs.getX(), this.y + rhs.getY());
    }

    double scalar(Point rhs){
        return this.x * rhs.getX() + this.y * rhs.getY();
    }

    double pseudo_scalar(Point rhs){
        return this.x * rhs.getY() - this.y * rhs.getX();
    }

    double getLen(){
        return hypot(this.x, this.y);
    }

    Point mul(double k){
        return new Point(this.x * k, this.y * k);
    }

    Point div(double k){
        return mul(1 / k);
    }

    Point normal(){
        return this.div(this.getLen());
    }

    Point rotate(){
        return new Point(-this.y, this.x);
    }

    double getLen2(){
        return this.x * this.x + this.y * this.y;
    }
}
