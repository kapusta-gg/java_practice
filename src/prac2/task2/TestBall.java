package prac2.task2;


public class TestBall {
    public static void main(String[] args) {
        Ball test = new Ball(2, 3);
        System.out.println(test.toString());
        test.move(8.5, -0.5);
        System.out.println(test.getX());
    }
}
