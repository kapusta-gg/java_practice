package prac2.task6;

import java.util.Objects;

public class Circle {
    private double center_x = 0;
    private double center_y = 0;
    private double radius = 0;

    public Circle(){};
    public Circle(double x, double y, double radius){
        this.center_x = x;
        this.center_y = y;
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter_x(double center_x) {
        this.center_x = center_x;
    }

    public void setCenter_y(double center_y) {
        this.center_y = center_y;
    }

    public double getRadius() {
        return radius;
    }

    public double getCenter_x() {
        return center_x;
    }

    public double getCenter_y() {
        return center_y;
    }

    public double square(){
        return 2 * Math.PI * Math.pow(this.radius, 2);
    }

    public double length(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
