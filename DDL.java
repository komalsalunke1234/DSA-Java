class Node {
    int data;
    Node next;
    Node back;

    // Constructor to initialize node with data, next, and back references
    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    // Constructor to initialize node with only data (default next and back are null)
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DDL {

    // Method to print the doubly linked list
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // Error: This should print on the same line.
            head = head.next;
        }
        System.out.println(); // Print a newline after printing all elements
    }

    // Method to convert an array to a doubly linked list
    private static Node convertArrr2DLL(int[] arr) {
        if (arr.length == 0) {
            return null; // Error: Handle an empty array properly by returning null
        }

        Node head = new Node(arr[0]); // Create the head node with the first element
        Node prev = head;

        for (int i = 1; i < arr.length; i++) { // Error: Start from index 1 since arr[0] is used for head
            Node temp = new Node(arr[i], null, prev); // Create a new node for each element
            prev.next = temp; // Link the current node to the previous node
            prev = temp; // Move prev to the current node
        }

        return head; // Return the head of the created doubly linked list
    }

    //deleting the head from the doubly linked list
    public static Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
      //  Node prev=head;
        head=head.next;
        head.back=null;
        //head.next=null;
        return head;


    }
    //deleting the tail from DLL
    public static Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;

        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
            
        }
        Node newtail=tail.back;
        newtail.next=null;
        tail.back=null;
        return head;
    }
    //deleting the kth element in the  DLL
    public static Node RemoveKthElement(Node head, int k) {
        if (head == null || k <= 0) {
            return head; // If list is empty or k is invalid, return head
        }

        Node kNode = head;
        int count = 1;

        // Traverse to the k-th node
        while (kNode != null && count < k) {
            kNode = kNode.next;
            count++;
        }

        if (kNode == null) { // If k-th node doesn't exist
            return head;
        }

        Node prev = kNode.back;
        Node next = kNode.next;

        // If the node to delete is the head
        if (prev == null) {
            return deleteHead(head); // Use the deleteHead method
        }

        // If the node to delete is the tail
        if (next == null) {
            return deleteTail(head); // Use the deleteTail method
        }

        // For the middle node
        prev.next = next;
        next.back = prev;

        // Detach the kNode completely
        kNode.next = null;
        kNode.back = null;

        return head;
    }
    //deleting the node from the DLL
    //question is that node should not be head other than head node appllicable
    public static void deleteNode(Node temp) {
        // Check if temp is null
        if (temp == null) {
            System.out.println("Cannot delete a null node.");
            return;
        }
    
        // Check if temp is the head node
        if (temp.back == null) {
            System.out.println("Cannot delete the head node using this method.");
            return;  // Head node should not be deleted by this method
        }
    
        Node prev = temp.back;
        Node next = temp.next;
    
        // Check if the node is the tail node
        if (next == null) {
            prev.next = null;
            temp.back = null; // Detach the node
            return;
        }
    
        // If the node is somewhere in the middle
        prev.next = next;
        next.back = prev;
        
        // Detach the node completely
        temp.next = null;
        temp.back = null;
    }
    

    public static void main(String[] args) {
        int arr[] = {5, 9, 7, 6, 3, 2}; // Input array
        Node head = convertArrr2DLL(arr); // Convert array to doubly linked list
        print(head); // Print the list
         head=deleteHead(head);
        print(head);
        head=deleteTail(head);
        print(head);
        head=RemoveKthElement(head,2);
        print(head);
        deleteNode(head);
        print(head);
        
        
    }
}
