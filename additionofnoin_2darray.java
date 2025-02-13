class additionofnoin_2darray{
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
//print the addition of all element present in the array having maximum sum;
        int maxSum = maximunm_no(array);
        System.out.println("Maximum row sum: " + maxSum);
    }

    public static int maximunm_no(int[][] array) {
        int ans = Integer.MIN_VALUE;
        for (int num = 0; num < array.length; num++) {
            int sum = 0;
            for (int arr = 0; arr < array[num].length; arr++) {
                sum += array[num][arr];
            }
            if (sum > ans) { 
                ans = sum;
            }
        }
        return ans; 
    }
}
