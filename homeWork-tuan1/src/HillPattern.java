import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        int numRows;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
         numRows = sc.nextInt();
        System.out.println("(A)");
        printPatternA(numRows);
    }
    public static void printPatternA(int numRows) {
        int numCols = 2 * numRows - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCols; col++) {
                if ((col + row >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printPatternB(int numRows){
        int numCols = 2*numRows - 1;
        for (int row = 1 ; row < numRows; row++){
            for (int col = 1; col < numCols ; col++) {

            }
        }
    }
}