import java.util.Scanner;

public class BoyerMooreVotingAlgorithm {
    public static int majorityElement(int[] nums){
        int n=nums[0] , count=1;
        for(int i=1;i< nums.length; i++){
            if(nums[i] == n){
                count ++;

            }
            else{
                count--;
                if(count ==0){
                    n=nums[i];
                    count =1;

                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[]nums =new int[x];

        for(int i=0;i<x;i++){
            nums[i]=sc.nextInt();

        }
        System.out.println(majorityElement(nums));
    }
}
