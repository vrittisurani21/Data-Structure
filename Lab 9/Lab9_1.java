import java.util.Scanner;

class Lab9_1 {
    public int front, rear, capacity;
    public int[] queue;

    public Lab9_1 (int c) {
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[c];
    }

    public void Enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
    }

    public void Dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    public void Display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = sc.nextInt();
        Lab9_1 q = new Lab9_1(capacity);

        while (true) {
            System.out.println("\nChoices:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = sc.nextInt();
                    q.Enqueue(data);
                    break;
                case 2:
                    q.Dequeue();
                    break;
                case 3:
                    q.Display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    sc.close();
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
