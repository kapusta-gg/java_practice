package prac2.task3;

import java.util.ArrayList;

public class Tester {
    private ArrayList<Circle> circles = new ArrayList<>();

    public int getNum_of_circles() {
        return circles.size();
    }

    public void addCircle(Circle circle){
        circles.add(circle);
    }

    public static void main(String[] args) {

        Tester test = new Tester();
        Circle circle = new Circle();
        test.addCircle(circle);
    }
}
