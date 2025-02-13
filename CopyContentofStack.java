import java.util.Stack;
public class CopyContentofStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            System.out.println(st);
            //reverse
            Stack<Integer> rt=new Stack<>();
            while(st.size()>0){
                rt.push(st.pop());

            }
            //again  reverse
            Stack<Integer>gt=new Stack<>();
            while(rt.size()>0){
                gt.push(rt.pop());

            }
            System.out.println(gt);
    }
}
