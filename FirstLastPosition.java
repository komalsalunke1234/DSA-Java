public class FirstLastPosition {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        int[] ans = searchRange(arr, target);
        System.out.println("First and last positions: " + ans[0] + ", " + ans[1]);
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        // Check for the first occurrence of target
        ans[0] = search(arr, target, true);
        // If the first occurrence is found, search for the last occurrence
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    // This function will return the index value
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Search on the left side for the first occurrence
                } else {
                    start = mid + 1; // Search on the right side for the last occurrence
                }
            }
        }
        return ans;
    }
}
