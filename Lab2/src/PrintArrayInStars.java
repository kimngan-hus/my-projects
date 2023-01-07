import java.util.Scanner;
public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        Output(Input(NUM_ITEMS,sc));
    }
    public static int[] Input(int n, Scanner scanner){
        int[] arr = new int[n];
        System.out.print("enter the value of all items: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void Output(int[] arr){
        for (int idx = 0; idx < arr.length; ++idx) {
            System.out.print(idx + ": ");
            for (int startNo = 1; startNo <= arr[idx] ; ++startNo) {
                System.out.print("* ");

            }
            System.out.printf("\n");
        }
    }
}
