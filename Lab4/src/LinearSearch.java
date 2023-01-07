public class LinearSearch {
    public static boolean linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key)
                return true;
        }
        return false;
    }
    public static int linearIndexSearch(int[] arr, int key){
        if (linearSearch(arr,key)){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==key)
                    return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9};
        System.out.println(linearIndexSearch(arr,5));
    }
}
