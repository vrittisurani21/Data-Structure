class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Lab13_3 {
    Node head;

    // Function to delete alternate nodes
    public void deleteAlternateNodes() {
        if (head == null) return;

        Node current = head;
        while (current != null && current.next != null) {
            Node nodeToDelete = current.next;
            current.next = nodeToDelete.next;
            if (nodeToDelete.next != null) {
                nodeToDelete.next.prev = current;
            }
            current = current.next;
        }
    }

    // Function to insert a new node at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    // Function to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_3 dll = new Lab13_3();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(4);
        dll.insertEnd(5);

        System.out.println("Original List:");
        dll.printList();

        dll.deleteAlternateNodes();

        System.out.println("List after deleting alternate nodes:");
        dll.printList();
    }
}
