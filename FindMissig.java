import java.util.ArrayList;
import java.util.List;

public class FindMissig {
    public static void main(String[] args) {
        int arr[] = {8,8,3,5,5,5,6,1};
        List<Integer> missingNumbers = findDisappearedNumbers(arr);
        System.out.println("Disappeared numbers are: " + missingNumbers);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find all indices where the numbers are not in the correct place
        List<Integer> missingNumbers = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                missingNumbers.add(index + 1);
            }
        }

        return missingNumbers;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
