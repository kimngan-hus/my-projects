import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUMBER_STUDENT = 3;
        int numberIn;
        Scanner in = new Scanner(System.in);
        boolean isValid;
        int sum = 0;
        double average;
        for (int NO_STUDENT = 1; NO_STUDENT <= NUMBER_STUDENT; NO_STUDENT++) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0−100) for student " + NO_STUDENT + " is: ");
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;

        }
        average = sum / NUMBER_STUDENT;
        System.out.println(average);
    }
}
