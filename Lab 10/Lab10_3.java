// Node class representing a node in the circularly linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// CircularlyLinkedList class to create and manipulate the circularly linked list
class CircularlyLinkedList {
    Node head;

    // Method to count the number of nodes in the circularly linked list
    int countNodes() {
        int count = 0;
        Node current = head;

        if (head == null) {
            return count;
        }

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    // Method to insert a new node at the end of the circularly linked list
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
}

public class Lab10_3 {
    public static void main(String[] args) {
        CircularlyLinkedList list = new CircularlyLinkedList();

        // Insert some nodes into the circularly linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Count and print the number of nodes in the circularly linked list
        int count = list.countNodes();
        System.out.println("Number of nodes in the circularly linked list: " + count);
    }
}