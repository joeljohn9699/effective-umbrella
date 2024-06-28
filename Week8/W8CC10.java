//RightLeftRotation
//CC

public class W8CC10 {
    
    // BST node
    static class Node {
        int key, height;
        Node left, right;
    }
    
    // Utility function to create a new node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.key = data;
        temp.height = 1;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    
    public int getHeight(Node N) {
        if (N == null)
        return 0;
        return N.height;
    }
    
    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public Node rightRotation(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        
        // Perform rotation
        x.right = y;
        y.left = T2;
        
        // Update heights
        y.height = findMax(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = findMax(getHeight(x.left), getHeight(x.right)) + 1;
        
        // Return new root
        return x;
    }
    
    public Node leftRotation(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        
        // Perform rotation
        y.left = x;
        x.right = T2;
        
        // Update heights
        x.height = findMax(getHeight(x.left), getHeight(x.right)) + 1;
        y.height = findMax(getHeight(y.left), getHeight(y.right)) + 1;
        
        // Return new root
        return y;
    }
    
    public int getBalanceFactor(Node N) {
        if (N == null)
        return 0;
        return getHeight(N.left) -getHeight(N.right);
    }
    
    public Node insert(Node node, int key) {
        
        // create node
        if (node == null) {
            return (newNode(key));
        }
        if (key < node.key)
        node.left = insert(node.left, key);
        else if (key > node.key)
        node.right = insert(node.right, key);
        else 
        // Duplicate keys not allowed
        return node;
        node.height = 1 + findMax(getHeight(node.left), getHeight(node.right));
        int balance = getBalanceFactor(node);
        
        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            System.out.println("Value inserted successfully!!! and the tree is unbalanced");
            System.out.println("Hence, performing Right Left Rotation");
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
    
    static void Inorder(Node root) {
        if (root == null)
        return;
        else {
            Inorder(root.left);
            System.out.print(root.key + "{" + root.height + "}" + " ");
            Inorder(root.right);
        }
    }
    
    public static void main(String args[]) {
        W8CC10 obj = new W8CC10();
        int value;
        Node root = null;
        int[] arr = { 35, 33, 55, 38, 88, 43 };
        
        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            System.out.println("\nInserting "+value+" to tree");
            root = obj.insert(root, value);
            
            // Print inorder traversal of the BST
            System.out.println("\nInorder of Binary tree\n");
            Inorder(root);
            System.out.println();
        }
    }
}
