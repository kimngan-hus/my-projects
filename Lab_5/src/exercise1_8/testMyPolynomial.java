package exercise1_8;

public class testMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2 ,3.3,4.4 );
        MyPolynomial p2 = new MyPolynomial(2.2,3.3,4.4,5.5);
        System.out.println(p1);
        System.out.println(p1.evaluate(5));
        System.out.println(p1.getDegree());
        System.out.println(p1.add(p2));
        System.out.println(p1.multiply(p2));
    }
}
