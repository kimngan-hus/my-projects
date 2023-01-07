import java.util.Scanner;

public class BoxPatternX {
        public static void main(String[] args) {
            int  size;
            Scanner in = new Scanner(System.in);
            System.out.print("enter the size: ");
            size = in.nextInt();
            System.out.println("(A)");
            drawPatternA(size);
            System.out.println("(B)");
            drawPatternB(size);
            System.out.println("(C)");
            drawPatternC(size);
            System.out.println("(D)");
            drawPatternD(size);

        }
        public static void drawPatternA(int size){
            for (int row = 1; row <=size; row++){
                for (int col = 1; col <= size; col++){
                    if (row == 1 || row == size || col == 1 || col == size){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        public static void drawPatternB(int size){
            for (int row = 1; row <=size; row++){
                for (int col = 1; col <= size; col++){
                    if (row == 1 || row == col || row == size){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        public static void drawPatternC(int size){
            for (int row = 1; row <=size; row++){
                for (int col = 1; col <= size; col++){
                    if (row == 1 || row == size || (size - col +1 ) == row){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        public static void drawPatternD(int size){
            for (int row = 1; row <=size; row++){
                for (int col = 1; col <= size; col++){
                    if (row == 1 || row == size || (size - col +1 ) == row || row == col){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }


