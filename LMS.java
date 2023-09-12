import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String issueDate;
    private String returnDate;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issueDate = "";
        this.returnDate = "";
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    // Implement getters and setters for other attributes
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

    // Implement methods for updating, deleting, and searching for books
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("List of Books:");
                    library.displayBooks();
                    break;

                case 3:
                    System.out.println("Exiting Library Management System.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}