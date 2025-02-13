public class Binary_search{
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,55,77,99};
       int target=77;
        int ans=binary_search(arr,target);
        System.out.println(ans);

    }
    static int binary_search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
while(start<=end){
    int mid=start+(end-start)/1;
    if(target<arr[mid]){
        end=mid-1;

    }
    else if(target>arr[mid]){
        start=mid+1;

    }
    else{
        return mid;
    }
}
return -1;
    }
}