package exercise27;

import exercise26.MyPoint;

public class testMyLine {
    public static void main(String[] args) {
        MyLine p1 = new MyLine(3,4,6,7);
        System.out.println(p1);
        p1.setBeginX(3);
        p1.setEndX(4);
        p1.setBeginY(6);
        p1.setEndY(7);
        System.out.println("beginX is: " + p1.getBeginX());  // Test getters
        System.out.println("endX is: " + p1.getEndX());
        System.out.println("beginY is: " + p1.getBeginY());
        System.out.println("endY is: "+ p1.getEndY());
        p1.setBeginXY(4, 6);   // Test setXY()
        p1.setEndXY(5,7);
        System.out.println(p1.getBeginXY()[0]);  // Test getXY()
        System.out.println(p1.getBeginXY()[1]);
        System.out.println(p1.getEndXY()[0]);
        System.out.println(p1.getEndXY()[1]);
        System.out.println(p1);
// Testing the overloaded methods getLength() and getGradient()
        System.out.println(p1.getLength());
        System.out.println(p1.getGradient());

    }
}
