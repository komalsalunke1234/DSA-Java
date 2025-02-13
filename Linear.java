public class Linear {
    public static void main(String[] args) {
        int arr[]={23,78,65,34,66,79};
        int target=65;
        System.out.println(Linear(arr, target, 1, 3));
        
    }
    static int Linear(int arr[] ,int target,int start,int end){
        if(arr.length==0){
            return -1;

        }
        for(int index=start;index<=end;index++){
            int element=arr[index];
            if(element == target ){
                return index;
            }
        }
        return -1;
    }
}
