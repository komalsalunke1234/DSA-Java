import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={8,5,6,2,3,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr){
        //run the step till n-1;
        for(int i=0;i<arr.length;i++){
            //for each step max item will come at  last respective inndeex;
            for(int j=1;j<arr.length-i;j++){
                //swap
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
    }
}
