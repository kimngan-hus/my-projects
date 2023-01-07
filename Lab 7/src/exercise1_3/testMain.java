package exercise1_3;

public class testMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1,2,3,4);//Upcast
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
    }
}
