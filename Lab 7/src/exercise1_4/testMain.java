package exercise1_4;

public class testMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1,2,3,4);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

        MovablePoint m2 = (MovablePoint) m1;//DownCast
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableCircle(2,4,6,7,3);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
        m3.moveLeft();
        System.out.println(m3);
        m3.moveRight();

        MovableCircle m4 = (MovableCircle) m3;
        System.out.println(m4);
        m4.moveUp();
        System.out.println(m4);
        m4.moveDown();
        System.out.println(m4);
        m4.moveLeft();
        System.out.println(m4);
        m4.moveRight();
    }
}
