package exercise29;

import exercise28.MyCircle;

public class testMyTriangle {
    public static void main(String[] args) {


        MyTriangle T1 = new MyTriangle(-1, 1, 1, 3, 2, 0);
        System.out.println(T1);
        System.out.println(T1.getPerimeter());
        System.out.println(T1.getType());
    }
}
