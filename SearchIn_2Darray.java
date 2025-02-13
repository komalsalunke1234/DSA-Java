import java.util.Arrays;
public class SearchIn_2Darray {
    public static void main(String[] args) {
        int arr[][]={
            {25,65,87},
            {95,47,22,33,49},
            {98,65,33,22}
        };
        int target=65;
        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int target){
        for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                if(arr[rows][cols]==target){
                    return new int[]{rows,cols};

                }
            }
        }
        return new int[] {-1,-1};
    }
    
}
