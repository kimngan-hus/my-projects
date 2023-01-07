package exercise1_8;



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
        System.out.println(m3);

        MovableCircle m4 = (MovableCircle) m3;
        System.out.println(m4);
        m4.moveUp();
        System.out.println(m4);
        m4.moveDown();
        System.out.println(m4);
        m4.moveLeft();
        System.out.println(m4);
        m4.moveRight();
        System.out.println(m4);

        Movable m5 = new MovableRectangle(2,5,1,4,5,5);
        System.out.println(m5);
        m5.moveUp();
        System.out.println(m5);
        m5.moveDown();
        System.out.println(m5);
        m5.moveLeft();
        System.out.println(m5);
        m5.moveRight();
        System.out.println(m5);

        MovableRectangle m6 = (MovableRectangle) m5;
        System.out.println(m6);
        m6.moveUp();
        System.out.println(m6);
        m6.moveDown();
        System.out.println(m6);
        m6.moveLeft();
        System.out.println(m6);
        m6.moveRight();
        System.out.println(m6);
    }
    }

