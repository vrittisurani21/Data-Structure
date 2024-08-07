// Node class to represent a node in the singly linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// SinglyLinkedList class to implement a singly linked list
class SinglyLinkedList {
    Node head; // Head of the list

    // Method to add a new node at the end of the list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to test the implementation
public class Lab10_1 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add nodes to the list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Print the linked list
        System.out.println("Linked List: ");
        list.printList();
    }
}