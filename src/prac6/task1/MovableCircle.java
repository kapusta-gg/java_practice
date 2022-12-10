package prac6.task1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.centre = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.centre.moveUp();
    }

    @Override
    public void moveDown() {
        this.centre.moveDown();
    }

    @Override
    public void moveRight() {
        this.centre.moveRight();
    }

    @Override
    public void moveLeft() {
        this.centre.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", centre=" + centre +
                '}';
    }
}
