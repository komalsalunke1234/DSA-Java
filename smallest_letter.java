public class smallest_letter {
    //ceiling means smallest element greater than or equal to target;
    public static void main(String[] args) {
        char letter[]={'e','g','k','o','p','r'};
        char target='l';
        int ans=ceiling(letter,target);
        System.out.println(ans);
    }
    static int ceiling(char []letter,char target){
        if(target <letter[0]){
            return -1;
        }
        int start=0;
        int end=letter.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target<=letter[mid]){
                end=mid-1;

            }
            else {
                start=mid+1;
            
            }
        }
        return letter[start]%letter.length;
    }
}
