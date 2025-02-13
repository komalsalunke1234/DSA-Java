import java.util.Stack;
public class revStackRecursively {
    public static void pushAtBottom(Stack<Integer>st,int x){
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            int top=st.pop();
            pushAtBottom(st, x);
            st.push(top);
        }
    }
    public static void revStack(Stack<Integer>st){
        if(!st.isEmpty()){
            int top=st.pop();
            revStack(st);
            pushAtBottom(st, top);
        }
    }
    public static void main(String[] args) {
        //for reversing the stack first we have to do is insert  at bottom;
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        revStack(st);
        System.out.println(st);
    }
}
