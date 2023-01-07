import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        Scanner in = new Scanner(System.in);
        inNumber = in.nextInt();
        int inDigit;
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
        }
    }
}
