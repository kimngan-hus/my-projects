import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        OutputPrimesInArray(InputArr(NUM_ITEMS,sc));
    }
        public static int[] InputArr(int n, Scanner scanner){
            int[] arr = new int[n];
            System.out.print("enter the value of all items: ");
            for (int i=0; i < n;++i){
                arr[i] = scanner.nextInt();
            }
            return arr;
        }
        public static void OutputPrimesInArray(int[] arr){
            System.out.print("the value are: ");
            for (int i =0 ; i < arr.length; ++i){
                if (i==0) {
                    System.out.print("[ " + arr[i]);
                } else if (i == arr.length - 1) {
                    System.out.print(", " + arr[i] + " ] ");
                }else {
                    System.out.print(", " + arr[i]);
                }
            }
        }


}
