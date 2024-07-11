import java.util.Scanner;

interface Library {
    void displayDetails();
    void issueBook();
    void returnBook();
}

class Book implements Library {
    String title;
    String author;
    boolean isIssued;

    Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        isIssued = false;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("is Issued: " + (isIssued ? "Yes" : "No"));
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("The book \"" + title + "\" has been issued.");
        }
         else {
            System.out.println("The book \"" + title + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("The book \"" + title + "\" has been returned.");
        } 
        else {
            System.out.println("The book \"" + title + "\" is not issued.");
        }
    }
}


public class LibraryManagement{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String bookTitle = s.nextLine();
        System.out.print("Enter book author: ");
        String bookAuthor = s.nextLine();

        Book b1 = new Book(bookTitle, bookAuthor);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Display Book Details");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    b1.displayDetails();
                    break;
                case 2:
                    b1.issueBook();
                    break;
                case 3:
                    b1.returnBook();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
