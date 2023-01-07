package exercise2_8;

public class testMyCircle {
    public static void main(String[] args) {



        MyCircle c1 = new MyCircle(3,4, 2);
        System.out.println(c1);
        c1.setCenterX(3);
        c1.setCenterY(4);
        System.out.println("center x is: " + c1.getCenterX());
        System.out.println("center y is: " + c1.getCenterY());
        c1.setCenterXY(4, 6);   // Test setXY()
        System.out.println(c1.getCenterXY()[0]);  // Test getXY()
        System.out.println(c1.getCenterXY()[1]);
        System.out.println(c1);
// Testing the overloaded methods getLength() and getGradient()
        System.out.println(c1.getArea());
        MyCircle c2 = new MyCircle(5,6,3);
        System.out.println(c1.distance(c2));
    }
}
