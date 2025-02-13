import java.util.Stack;
public class RemoveFromBottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
       
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        int index=1;
        Stack<Integer>gt=new Stack<>();
        while (st.size()>index+1) {
            gt.push(st.pop());
            
            
        }
       if(!st.isEmpty()){
        st.pop();
       }
       while (!gt.isEmpty()) {
        st.push(gt.pop());
       }

        System.out.println(st);
    }
}
