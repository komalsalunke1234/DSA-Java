public class Maxno_array {
    public static void main(String[] args) {
        int arr[]={34,78,56,45,11,98,67};
        System.out.println("The maximum number from the array is:"+max(arr));
        
    }
    static int max(int arr[]){
        int ans=arr[0];
        for(int index=0;index<arr.length;index++){
            if(arr[index]>ans){//for minimum in the in array use < less than oerator init;

                ans=arr[index];
            }
        }
        return ans;

    }
}
