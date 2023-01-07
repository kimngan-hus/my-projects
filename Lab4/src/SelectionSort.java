import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
                int tmp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = tmp;

        }
    }
    public static void main(String[] args){
        int[] arr = {9,6,4,1,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
