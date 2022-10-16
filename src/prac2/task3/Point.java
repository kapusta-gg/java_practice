package prac2.task3;

public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){};

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "coords: " +
                "x: " + x +
                " y:" + y;
    }
}
