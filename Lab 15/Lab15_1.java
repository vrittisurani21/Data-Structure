class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    int preIndex = 0;

    Node constructTreeUtil(int pre[], int post[], int l, int h, int size) {
        if (preIndex >= size || l > h)
            return null;

        Node root = new Node(pre[preIndex]);
        preIndex++;

        if (l == h || preIndex >= size)
            return root;

        int i;
        for (i = l; i <= h; i++) {
            if (pre[preIndex] == post[i])
                break;
        }

        if (i <= h) {
            root.left = constructTreeUtil(pre, post, l, i, size);
            root.right = constructTreeUtil(pre, post, i + 1, h - 1, size);
        }

        return root;
    }

    Node constructTree(int pre[], int post[], int size) {
        return constructTreeUtil(pre, post, 0, size - 1, size);
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}

public class Lab15_1 {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        int pre[] = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int post[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};
        int size = pre.length;

        Node root = tree.constructTree(pre, post, size);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.printInorder(root);
    }
}
