import java.util.Stack;
public class PushAtBottom {
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
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        int x=100;
        pushAtBottom(st,x);

        System.out.println(st);
    }
}
