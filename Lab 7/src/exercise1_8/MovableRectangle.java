package exercise1_8;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }


    @Override
    public void moveUp() {
        if ((topLeft.xSpeed != bottomRight.xSpeed)
                && (topLeft.ySpeed != bottomRight.ySpeed)) {
            return;
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if ((topLeft.xSpeed != bottomRight.xSpeed)
                && (topLeft.ySpeed != bottomRight.ySpeed)) {
            return;
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if ((topLeft.xSpeed != bottomRight.xSpeed)
                && (topLeft.ySpeed != bottomRight.ySpeed)) {
            return;
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if ((topLeft.xSpeed != bottomRight.xSpeed)
                && (topLeft.ySpeed != bottomRight.ySpeed)) {
            return;
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
