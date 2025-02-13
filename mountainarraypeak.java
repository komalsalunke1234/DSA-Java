public class mountainarraypeak {
    //the mountain array refers that first the array will be in ascending 
    //order and then the array will be in descending order and that element 
    //in this mountain array we have to find that is greater ;
    public static void main(String[] args) {
        int arr[]={2,6,8,11,10,5,2,0};
        System.out.println(peakelement(arr));
    }
    static int peakelement(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in deccresing order of an array;
                end=mid;

            }
            else{
                //you aree in ascending part of an aarray;
                start=mid+1;
            }
        }
        //at the end here start is equal to end ans pointing to largest number
        return start;//here start==end we can return end also in this case;
    }
}
