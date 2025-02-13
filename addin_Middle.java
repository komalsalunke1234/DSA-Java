class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void AddinMiddle(int index, String data) {
        // Check if the index is valid
        if (index > size || index < 0) {
            System.out.println("Invalid index value.");
            return;
        }

        // Create a new node
        Node newNode = new Node(data);
        size++;

        // If we're inserting at the head
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node just before the desired index
        Node currNode = head;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }

        // Insert the new node
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // Additional methods for testing
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}

// Example usage
public class addin_Middle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.AddinMiddle(0, "first");
        list.AddinMiddle(1, "second");
        list.AddinMiddle(1, "middle");
        list.printList(); // Output: first -> middle -> second -> null
    }
}
