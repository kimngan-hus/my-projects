
import java.util.Scanner;
public class TriangularPatternX {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size: ");
        size = in.nextInt();
        System.out.println("(A)");
        a(size);
        System.out.println("(B)");
        b(size);
        System.out.println("(C)");
        c(size);
        System.out.println("(D)");
        d(size);
        in.close();
    }

    public static void a(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col <= row) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void b(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col + row <= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void c(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col >= row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void d(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col + row >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
