import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
    public static Boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
               if( st.size()==0) return false;
               if(st.peek()=='(') {
                st.pop();
               }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(isBalanced(str));
    }
    
}
