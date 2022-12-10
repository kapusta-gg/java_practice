package prac4point1.task8;

public class Circle extends Shape{
    protected double radius;

    public Circle(){this.radius = 0;}
    public Circle(double radius){super(); this.radius = radius;}
    public Circle(double radius, String color, boolean filled){super(color, filled); this.radius = radius;}

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public double getArea() {return Math.PI * Math.pow(this.radius, 2);}

    @Override
    public double getPerimeter() {return 2 * Math.PI * this.radius;}

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + ' ' + ", filled=" + filled +  '}';
    }
}
