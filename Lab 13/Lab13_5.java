import java.util.Scanner;

class Song {
    String title;
    Song prev;
    Song next;

    Song(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}

public class Lab13_5 {
    Song head;
    Song tail;
    Song current;

    // Function to add a song to the playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = tail = newSong;
            head.next = head.prev = head;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            newSong.next = head;
            head.prev = newSong;
            tail = newSong;
        }
    }

    // Function to play the next song
    public void playNext() {
        if (current == null) {
            current = head;
        } else {
            current = current.next;
        }
        System.out.println("Playing: " + current.title);
    }

    // Function to play the previous song
    public void playPrevious() {
        if (current == null) {
            current = head;
        } else {
            current = current.prev;
        }
        System.out.println("Playing: " + current.title);
    }

    // Function to display the playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        Song temp = head;
        do {
            System.out.print(temp.title + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_5 player = new Lab13_5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Song");
            System.out.println("2. Play Next");
            System.out.println("3. Play Previous");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    player.addSong(title);
                    break;
                case 2:
                    player.playNext();
                    break;
                case 3:
                    player.playPrevious();
                    break;
                case 4:
                    player.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
