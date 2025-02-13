import java.util.Arrays;

public class Linear_search {
    public static void main(String[] args) {
        int nums[] = {23, 46, 43, 78, 33, 90, 11, 39};
        int target = 11;
        int ans = Linear_search(nums, target);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target " + target + " found at index: " + ans);
    }

    // Search in the array: return the index if the item is found,
    // otherwise return -1 indicating item not found
    static int Linear_search(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // Check if the element at the current index matches the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // Return -1 if the target was not found in the array
        return -1;
    }
}
