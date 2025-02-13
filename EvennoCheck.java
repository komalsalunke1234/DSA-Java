public class EvennoCheck {
    public static void main(String[] args) {
        int arr[] = {12, 342, 6, 7896};
        int evenno = countEvenDigit(arr);
        System.out.println("Number of even digits in array: " + evenno);
    }

    public static int countEvenDigit(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) { // Check if the number has an even number of digits
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int noofdigits = digits(num);
        return noofdigits % 2 == 0; // Returns true if even, false if odd
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10; // Correctly reduce the number
        }
        return count; // Return the count of digits
    }
}
