public class Fibonacci {
    public static int fibonacci1(int n) {
        int f0 = 1;
        int f1 = 1;
        int fn = 1;
        if (n == 0 || n == 1)
            return n;
         else
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            return fn;
        }
    public static int fibonacci2(int n){
        if (n==0 || n==1)
            return n;
        else
            return fibonacci2(n-1) + fibonacci2(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("F1("+i+") = " + fibonacci1(i));
            System.out.println("F2("+i+") = "+fibonacci2(i));
        }
    }
}
