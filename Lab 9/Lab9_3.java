import java.util.Scanner;

class Lab9_3 {
    public int capacity;
    public int[] deque;
    public int front;
    public int rear;

    public Lab9_3(int capacity) {
        this.capacity = capacity;
        this.deque = new int[capacity];
        this.front = -1;
        this.rear = 0;
    }

    public void insertFront(int item) {
        if (front < 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        deque[front] = item;
    }

    public void insertRear(int item) {
        if (rear == front) {
            System.out.println("Deque is full. Cannot insert.");
            return;
        }
        deque[rear] = item;
        rear++;
    }

    public void deleteFront() {
        if (front == -1) {
            System.out.println("Deque is empty. Cannot delete.");
            return;
        }
        front++;
    }

    public void deleteRear() {
        if (rear == 0) {
            System.out.println("Deque is empty. Cannot delete.");
            return;
        }
        rear--;
    }

    public void display() {
        for (int i = front + 1; i < rear; i++) {
            System.out.print(deque[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the deque: ");
        int capacity = sc.nextInt();
        Lab9_3 dq = new Lab9_3(capacity);

        while (true) {
            System.out.println("\nChoices:");
            System.out.println("1. Insert at front end");
            System.out.println("2. Insert at rear end");
            System.out.println("3. Delete from front end");
            System.out.println("4. Delete from rear end");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at front: ");
                    int frontItem = sc.nextInt();
                    dq.insertFront(frontItem);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at rear: ");
                    int rearItem = sc.nextInt();
                    dq.insertRear(rearItem);
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    System.out.println("Deque elements:");
                    dq.display();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
