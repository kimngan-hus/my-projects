public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = i * factorial;
        }
        System.out.println(factorial);
    }
}
