package prac6.task2;
//интерфейс Movable и класс MovablePoint взяты из 1 задачи
import prac6.task1.Movable;
import prac6.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private void checkSpeed(){
        if(this.bottomRight.getxSpeed() != this.topLeft.getxSpeed() || this.bottomRight.getySpeed() != this.topLeft.getySpeed()){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void moveUp() {
        this.checkSpeed();
        this.bottomRight.moveUp();
        this.topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        this.checkSpeed();
        this.bottomRight.moveDown();
        this.topLeft.moveDown();
    }

    @Override
    public void moveRight() {
        this.checkSpeed();
        this.bottomRight.moveRight();
        this.topLeft.moveRight();
    }

    @Override
    public void moveLeft() {
        this.checkSpeed();
        this.bottomRight.moveLeft();
        this.topLeft.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
