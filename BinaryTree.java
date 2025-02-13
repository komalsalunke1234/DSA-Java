import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {

    // Node class definition
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor for Node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Variable to keep track of the current index while building the tree
    static int index = -1;

    // Method to build the tree
    public static Node BuildTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        // Create a new node
        Node newNode = new Node(nodes[index]);

        // Recursively build the left and right subtrees
        newNode.left = BuildTree(nodes);
        newNode.right = BuildTree(nodes);

        return newNode;
    }

    // Preorder traversal method
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder Traversal
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(" "+root.data);
        Inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.data);
    }
    public static void levelorder(Node root){
        Queue<Node> q=new LinkedList();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();

                    if(q.isEmpty()){
                        break;

                    }
                    else{
                        q.add(null);

                    }
                }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);

                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            }   
    }

    //count the nodes
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);

        return leftNodes+rightNodes+1;

    }
    //sum f tree
    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftsum=sumNodes(root.left);
        int rightsum=sumNodes(root.right);

        return leftsum+rightsum+root.data;

    }

    // height of tree 
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int myheight=Math.max(leftheight,rightheight)+1;
        return myheight;
    }
    // Main method
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Build the tree
        Node root = BuildTree(nodes);

        // Print the preorder traversal
        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println();
        System.out.println("Inorder traversal.");
        Inorder(root);
        System.out.println();
        System.out.println("postorder traversal .");
        postorder(root);
        System.out.println();
        System.out.println("level order taraversal is:");
        levelorder(root);
        System.out.println("the count of roots in the tree are :");
       System.out.println(countNodes(root));//time complexity O(N);

       System.out.println("the sum of tree is :");
       System.out.println(sumNodes(root));

       System.out.println("the height of tree is :");
       System.out.println(height(root));
    }
}
