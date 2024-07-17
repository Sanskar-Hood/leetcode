import java.util.*;

 class traversals {
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void main(String[] args) {
        // Constructing the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        // Lists to store traversal results
        ArrayList<Integer> preOrder = new ArrayList<>();
        ArrayList<Integer> inOrder = new ArrayList<>();
        ArrayList<Integer> postOrder = new ArrayList<>();
        
        // Perform traversals
        traversal(root, preOrder, inOrder, postOrder);
        
        // Print results
        System.out.println("Preorder: " + preOrder);
        System.out.println("Inorder: " + inOrder);
        System.out.println("Postorder: " + postOrder);
    }
    
    public static void traversal(Node node, ArrayList<Integer> preOrder, ArrayList<Integer> inOrder, ArrayList<Integer> postOrder) {
        if (node == null) {
            return;
        }
        
        // Preorder
        preOrder.add(node.data);
        
        traversal(node.left, preOrder, inOrder, postOrder);
        
        // Inorder
        inOrder.add(node.data);
        
        traversal(node.right, preOrder, inOrder, postOrder);
        
        // Postorder
        postOrder.add(node.data);
    }
}
