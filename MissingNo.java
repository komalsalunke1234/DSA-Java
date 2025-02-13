
        //return the only number in range that are missing from array;
        //[3,0,1]-->2 is missing that we have find
        // when numberrs are start from the 0 then we have to take index i.e there are n+1 nubers present in array ;
        // and when numbers are start fromm the 1 then wee have to take the index-1 i.e means there are  n numbers are present in the arrray;
       

public class MissingNo {
    public static void main(String[] args) {
        // Example array: [0, 3, 1] --> 2 is missing
        int arr[] = {0, 3, 1};
        int missing = findMissingNo(arr);
        System.out.println("Missing number is: " + missing);
    }

    public static int findMissingNo(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // Ensure correct is within bounds
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Check for the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // If all numbers are in place, the missing number is the last one
        return arr.length;
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
