package exercise1_2;

public class testMain {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(2.0);//Upcast Circle to Shape
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        Circle c1 = (Circle)g1;  // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());


        GeometricObject g2 = new Rectangle(2.0,4.0);//Upcast
        System.out.println(g2);
        System.out.println(g2.getPerimeter());
        System.out.println(g2.getArea());

        Rectangle r1 = (Rectangle) g2;//Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
