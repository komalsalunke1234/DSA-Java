import java.util.Stack;

public class InsertBottomOfStack {
    public static void main(String[] args) {
        // Create a stack and add some elements
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        System.out.println("Original Stack: " + st);

        // Specify the index and value to insert
        int index = 2; // Index where the new element will be inserted
        int x = 89;    // Value to be inserted

        // Create a temporary stack to hold elements
        Stack<Integer> temp = new Stack<>();

        // Move elements above the specified index to the temporary stack
        while (st.size() > index) {
            temp.push(st.pop());
        }

        // Push the new element at the specified index
        st.push(x);

        // Restore the original elements from the temporary stack
        while (temp.size() > 0) {
            st.push(temp.pop());
        }

        // Output the modified stack
        System.out.println("Modified Stack: " + st);
    }
}
