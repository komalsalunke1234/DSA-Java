import java.util.Arrays;

public class cyclic_sort{
    public static void main(String[] args) {
        int arr[]={9,1,8,6,2,7,3,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    
    }
    public static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            //this condition are for  the out of bound issue  resolving
            if(arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);

            }
            else{
                i++;
            }
            }
        }
        public static void swap(int arr[],int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    }
