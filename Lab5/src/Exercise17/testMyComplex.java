package Exercise17;

public class testMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex1 = new MyComplex(1.1,2.2);
        MyComplex myComplex2 = new MyComplex(3.3,4.4);
        System.out.println("enter complex number 1 " + myComplex1.getReal() + " " + myComplex1.getImag());
        System.out.println("enter complex number 2 " + myComplex2.getReal()+" " +myComplex2.getImag());
        System.out.println("Number 1 is: " + myComplex1);
        if (myComplex1.isReal()){
            System.out.println(myComplex1 +" is  a pure real number");
        }else {
            System.out.println(myComplex1 +" is not a pure real number");
        }
        if (myComplex1.isImaginary()){
            System.out.println(myComplex1 +" is  a pure imaginary number");
        }else {
            System.out.println(myComplex1 +" is not  a pure imaginary number");
        }
        if (myComplex1.equals(myComplex2)){
            System.out.println(myComplex1 +" is equal to " + myComplex2);
        }else {
            System.out.println(myComplex1 + "is not equal to " + myComplex2);
        }
    }

}
