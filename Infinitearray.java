public class  Infinitearray{
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int arr[], int target) {
        // First find the range
        int start = 0;
        int end = 1;
        
        // Condition for target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // New start
            // Now double the box size
            end = end + (end - start + 1) * 2;
            
            // Ensure end doesn't go out of bounds (considering finite array assumption)
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
            start = temp;
        }
        
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            // Find middle element
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        
        return -1; // Target not found
    }
}
