
public class Book {
    // Attributes (Fields)
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
    }

    // Method to apply a discount to the book price
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= (price * percentage / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Getters (optional, for accessing attributes if needed)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using the default constructor
        Book book1 = new Book();
        book1.displayInfo();

        // Creating objects using the parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99);
        book2.displayInfo();

        Book book3 = new Book("1984", "George Orwell", "9780451524935", 8.99);
        book3.displayInfo();

        // Applying discount to book2
        System.out.println("\nApplying 20% discount to 'The Great Gatsby'...");
        book2.applyDiscount(20);
        book2.displayInfo();
    }
}