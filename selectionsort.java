import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={8,9,5,6,7,2,4,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            //find max term
            int last=arr.length-i-1;
            int maxindex=getMaxindex(arr,0,last);
            swapArray(arr, maxindex, last);
        }
    }
    static void swapArray(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    static int getMaxindex(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;

            }
        }
        return max;
    }
}
