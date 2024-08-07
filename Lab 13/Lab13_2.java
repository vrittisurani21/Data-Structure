import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
}

public class Lab13_2 {
    public Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;
        for (int i = 1; i < position; i++) {
            if (current == null) {
                System.out.println("Invalid position. Cannot delete.");
                return;
            }
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position. Cannot delete.");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_2 list = new Lab13_2();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front");
            System.out.println("2. Delete from specified position");
            System.out.println("3. Display all nodes");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at front: ");
                    int frontData = sc.nextInt();
                    list.insertAtFront(frontData);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = sc.nextInt();
                    list.deleteFromPosition(position);
                    break;
                case 3:
                    System.out.print("Doubly linked list: ");
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
