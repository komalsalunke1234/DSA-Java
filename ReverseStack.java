import java.util.Stack;
public class ReverseStack {
    //we are making 3 stacks here in first stack all elements are push and then in 2nd stack all get reversed and then in the 3rd stack they all get revesemeans original stack and then after that that elements filled into the 1st stack itself
   public static void main(String[] args) {
    Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer>rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);

   
   Stack<Integer>gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
            
        }
        System.out.println(gt);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
            
}
