class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Lab13_4 {
    Node head;

    // Function to split the circular linked list into two halves
    public void splitList(Node head, Node[] head1_ref, Node[] head2_ref) {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head == null) return;

        // Using the tortoise and hare algorithm to find the middle of the list
        while (fast_ptr.next != head && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }

        // If there are even elements in the list, move fast_ptr
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }

        // Set the head pointer of the first half
        head1_ref[0] = head;

        // Set the head pointer of the second half
        if (head.next != head) {
            head2_ref[0] = slow_ptr.next;
        }

        // Make the second half circular
        fast_ptr.next = slow_ptr.next;

        // Make the first half circular
        slow_ptr.next = head;
    }

    // Function to insert a node at the end of the circular linked list
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Function to print the circular linked list
    public void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_4 cll = new Lab13_4();
        cll.insertEnd(1);
        cll.insertEnd(2);
        cll.insertEnd(3);
        cll.insertEnd(4);
        cll.insertEnd(5);

        System.out.println("Original Circular Linked List:");
        cll.printList(cll.head);

        Node[] head1 = new Node[1];
        Node[] head2 = new Node[1];

        cll.splitList(cll.head, head1, head2);

        System.out.println("First half of the list:");
        cll.printList(head1[0]);

        System.out.println("Second half of the list:");
        cll.printList(head2[0]);
    }
}
