import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        int row, col, size;
        int row1 = 1;
        int col1, size1;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size: ");
        size = in.nextInt();
        for (row = 1; row <= size; row++) {
            for (col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
        System.out.print("enter the size1: ");
        size1 = in.nextInt();
        while (row1 <= size1) {
            col1 = 1;
            while (col1 <= size1) {
                System.out.print("* ");
                col1++;
            }
            row1++;
            System.out.print("\n");

        }
    }
}


