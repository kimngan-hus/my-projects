import java.util.Scanner;
public class MagicSum {
    public static void main(String[] args){
        final int SENTINEL = -1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a positive integer (or -1 to end): ");
        number = sc.nextInt();
        int sum=0;
        while (number != SENTINEL){
            if (hasEight(number)){
                sum+=number;
            }
            System.out.print(" enter a positive integer(or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.println("the magic sum is: " + sum);
    }
        public static boolean hasEight(int numarVerificat) {
            int rest = numarVerificat % 10;
            return rest == 8;
        }
    }

