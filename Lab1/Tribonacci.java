public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;
        int fn;
        int minfn1 = 1;
        int minfn2 = 1;
        int minfn3 = 2;
        int nMax = 20;
        int sum = minfn1 + minfn2 + minfn3;
        double average;
        System.out.println("the first " + nMax + " Fibonacci numbers are");
        System.out.print(minfn2);
        System.out.print(" ");
        System.out.print(minfn1);
        System.out.print(" ");
        System.out.print(minfn3);
        System.out.print(" ");
        while (n <= nMax) {
            fn = minfn1 + minfn2 + minfn3;
            System.out.print(fn);
            System.out.print(" ");
            sum += fn;
            ++n;
            minfn1 = minfn2;
            minfn2 = minfn3;
            minfn3 = fn;
        }
        average = sum / nMax;
        System.out.println(average);
    }
}


