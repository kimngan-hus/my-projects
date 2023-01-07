
public class Factorial {
    public static int factorial1(int n){
        int fac=1;
        for (int i = 1; i <= n ; i++) {
            fac *=i;
        }
        return fac;
    }
    public static int factorial2(int n){
        if(n==0)
            return 1;
        else
            return n * factorial2(n-1);
    }
    public static void main(String[] args){
        System.out.println(factorial1(5));
        System.out.println(factorial2(5));
    }
}
