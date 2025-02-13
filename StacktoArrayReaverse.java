

// THIS QUESTION IS USING RECURSION //

import java.util.Stack;
public class StacktoArrayReaverse {
    public static void  Displayrevrec(Stack<Integer> st){
        
    if(st.isEmpty())return;
    int top=st.pop();
  
        
        System.out.println(top+" ");
        Displayrevrec(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
       
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println(st);
        Displayrevrec(st);
        System.out.println(st);
    }
}
