// Node class representing a node in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class representing the linked list
class LinkedList {
    Node head;

    // Method to add a node to the end of the linked list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to copy the linked list
    LinkedList copyList() {
        LinkedList copiedList = new LinkedList();
        Node temp = head;
        while (temp!= null) {
            copiedList.addNode(temp.data);
            temp = temp.next;
        }
        return copiedList;
    }

    // Method to print the linked list
    void printList() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Lab12_1{
    public static void main(String[] args) {
        LinkedList originalList = new LinkedList();
        originalList.addNode(1);
        originalList.addNode(2);
        originalList.addNode(3);
        originalList.addNode(4);
        originalList.addNode(5);

        System.out.println("Original List:");
        originalList.printList();

        LinkedList copiedList = originalList.copyList();

        System.out.println("Copied List:");
        copiedList.printList();
    }
}