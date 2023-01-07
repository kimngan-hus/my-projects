import java.util.Scanner;
public class CheckerPattern {
    public static void main(String[] args) {
        int row, col, size;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size: ");
        size = in.nextInt();
        for (row = 1; row <= size; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
