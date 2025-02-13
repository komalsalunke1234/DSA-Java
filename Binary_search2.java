import java.util.Arrays;

public class Binary_search2 {
    public static void main(String[] args) {
        int arr[] = {90, 87, 99, 33, 66, 77, 34, 11, 88};
        int target = 77;
        // Sort the array first
        Arrays.sort(arr);
        int ans = binary_search(arr, target);
        System.out.println(ans);
    }

    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
