import java.util.Arrays;

public class insertionsort {
    
    // Corrected printArray method
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {8, 5, 6, 7, 3, 2, 9};
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Corrected insertion sort method
    static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){  // Start from 1 instead of 0
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);  // You can remove this if you don't want to print each step
    }
}
