import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        Scanner in = new Scanner(System.in);
        boolean isValid;
        isValid = false;
        do {
            System.out.print("Enter a number between 0−10 o r 90−100: ");
            numberIn = in.nextInt();
            if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);
    }
}
