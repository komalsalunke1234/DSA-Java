class Solution {
    public int mySqrt(int x) {
     
      if(x == 1 || x == 0){
        return x;
      }
         int i=1;
      while(i<=x/i){
        if(i*i==x){
            return i;
        }
        else if(i*i >x){
            break;
        }
        i++;
      }
      return i-1;
      
    }
}