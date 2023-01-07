public class BinarySearch {
    public static boolean binarySearch(int[] arr, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (arr[fromIdx] == key)
                return true;
            return false;
        } else {
            int middleIdx = (toIdx + fromIdx) / 2;
            if (key == arr[middleIdx])
                return true;
            else if (key > middleIdx) {
                fromIdx = middleIdx + 1;
            } else {
                toIdx = middleIdx;
            }
        }
        return binarySearch(arr, key, fromIdx, toIdx);
    }

    public static boolean isSortList(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,6,8,12,45,89,92,98};
        int n = arr.length;
        if (isSortList(arr)) {
            System.out.println(binarySearch(arr, 92, 0, n - 1));
        } else {
            System.out.println("please add a sort list!");
        }
    }
}

