import java.util.Stack;
public class Stackbasic{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.push(6));
            System.out.println(st.size());
            System.out.println(st.peek());

        }
}