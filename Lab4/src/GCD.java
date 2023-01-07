public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, (a % b));
    }
    public static int gcd1(int a, int b){
        int c = a % b;
        while (c!=0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(gcd(25,120));
        System.out.println(gcd1(25,120));
    }
}
