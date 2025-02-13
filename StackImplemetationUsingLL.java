class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newnode = new Node(value);
        newnode.next = top;
        top = newnode;
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedvalue = top.data;
        top = top.next;
        return poppedvalue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(23);
        st.push(24);
        st.push(25);
        st.push(26);
        st.push(27);

        System.out.println("Peek: " + st.peek());
        System.out.println("Pop: " + st.pop());
        st.display();
    }
}
