public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = {2, 6, 8, 11, 6, 2, 1, 0};
        int target = 6;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakElementIn_MountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // Try finding in 2nd half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakElementIn_MountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Peak is in the right half
                start = mid + 1;
            } else {
                // Peak is in the left half, or it is mid
                end = mid;
            }
        }
        return start; // or return end; both are the same when start == end
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
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
        return -1; // Target not found
    }
}
