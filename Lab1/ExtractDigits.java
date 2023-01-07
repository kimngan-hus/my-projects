import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            System.out.print(" ");
            n = n / 10;
        }
    }


}
