class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert a node
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    // Find the minimum value in the BST
    int findMin() {
        return findMinRec(root);
    }

    int findMinRec(Node root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return Integer.MIN_VALUE;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.key;
    }

    // Find the maximum value in the BST
    int findMax() {
        return findMaxRec(root);
    }

    int findMaxRec(Node root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return Integer.MAX_VALUE;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.key;
    }
}

public class Lab15_2 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Minimum value in the BST is " + bst.findMin());
        System.out.println("Maximum value in the BST is " + bst.findMax());
    }
}
