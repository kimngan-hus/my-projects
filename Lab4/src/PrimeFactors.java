import java.util.Scanner;

import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the upper bound: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("\n%d perfect numbers found (%.2f%c)", count, (double) count  / n * 100, '%');
    }
    public static boolean isProductOfPrimeFactors(int n) {
        int product = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && isPrime(i)) {
                product *= i;
                if (product > n) {
                    return false;
                }
            }
        }
        return product == n;
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
