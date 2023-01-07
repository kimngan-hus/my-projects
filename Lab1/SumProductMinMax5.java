import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int sum;
        int product;
        int min;
        int max;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();
        num5 = in.nextInt();
        in.close();
        min = num1;
        if (num2 < min) {
            min = num2;
        } else if (num3 < min) {
            min = num3;
        } else if (num4 < min) {
            min = num4;
        } else if (num5 < min) {
            min = num5;
        }
        max = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        } else if (num4 > max) {
            max = num4;
        } else if (num5 > max) {
            max = num5;
        }
        sum = num1 + num2 + num3 + num4 + num5;
        product = num1 * num2 * num3 * num4 * num5;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(max);
        System.out.println(min);
    }
}
