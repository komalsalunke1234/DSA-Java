public class Even_count {
    public static void main(String[] args) {
        int arr[]={26,31,222,449,4532};// it will check the even no from the 
        int evenno=counteven(arr);
        System.out.println("the even numbers in the array are : "+evenno);
        
    }
    public static int counteven(int []arr){
        int count=0;
        for(int num:arr){
            while(num>0){
                 int digit=num%10;
                if(num%2==0){
                    count++;
                }
                num/=10;
            }
        }
        return count;
    }
}
