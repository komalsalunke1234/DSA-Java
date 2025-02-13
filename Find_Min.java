
public class Find_Min{
    public static void main(String[] args) {
        int arr[]={-12,56,-1,33,9,-98,75};
        System.out.println(min(arr));

    }
    //assume that arr.length != 0
         static int min(int[]arr){
            int ans=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]<ans){
                    ans=arr[i];
                }
            }
            return ans;
         }

}