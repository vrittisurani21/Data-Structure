import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class Lab13_1 {
    public Node last;

    public void insertAtFront(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void deleteFromPosition(int position) {
        if (last == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = last.next;
        Node prev = last;

        for (int i = 1; i < position; i++) {
            prev = current;
            current = current.next;
        }

        prev.next = current.next;
        current.next = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_1 list = new Lab13_1();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front");
            System.out.println("2. Delete from specified position");
            System.out.println("3. Insert at end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");

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
                    System.out.print("Enter data to insert at end: ");
                    int endData = sc.nextInt();
                    list.insertAtEnd(endData);
                    break;
                case 4:
                    System.out.print("Circular linked list: ");
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
