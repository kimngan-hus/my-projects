
import java.util.Scanner;
public class TimeTable {
    public static void main(String[] args) {
        int row, col, size;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size: ");
        size = in.nextInt();
        for (row = -1; row <= size; row++){
            if (row == -1){
                System.out.print("*\t|");
            }else if (row == 0 ){
                System.out.print("-------");
            } else if (row > 0){
                System.out.printf("%1$d\t|", row);
            }
            for (col = 1; col <= size; col++){
                if (row == -1){
                    System.out.printf("%1$d\t", col);
                    continue;
                }else if (row == 0){
                    System.out.print("------");
                    continue;
                }
                    System.out.printf("%1$d\t", row * col);
                }
                System.out.println();
            }
        }
    }
