class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    boolean areIdentical(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if (temp1 == null && temp2 == null) {
            return true;
        }

        return false;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class Lab10_4 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.push(1);
        list1.push(2);
        list1.push(3);

        list2.push(3);
        list2.push(2);
        list2.push(3);

        System.out.println("List 1: ");
        list1.printList(list1.head);

        System.out.println("List 2: ");
        list2.printList(list2.head);

        if (list1.areIdentical(list1.head, list2.head)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }
}